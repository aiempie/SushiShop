/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DAO;
import entity.*;
import entity.DanhGia;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author khanh
 */
@WebServlet(name = "RateController", urlPatterns = {"/rate"})
public class RateController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String id = request.getParameter("idsp");
        DAO dao = new DAO();
        Product sp = dao.getProductByIDSP(id);
        List<Category> listC = dao.getAllCategory();
        int sosao = Integer.parseInt(request.getParameter("star"));
        String cmt = request.getParameter("comment");

        DanhGia dg = dao.layDanhGia(id);
        if (dg == null) {
            dao.AddDanhGia(id, sosao, cmt, 1);
        } else {
            String cmtmoi = cmt + "," + dg.getComment();
            int luotdgmoi = dg.getLuotdanhgia() + 1;
            float saomoi = ((dg.getSoSao() * dg.getLuotdanhgia()) + sosao) / luotdgmoi;
            dao.UpDanhGia(id, saomoi, cmtmoi, luotdgmoi);
        }
        DanhGia newdg = dao.layDanhGia(id);
        List<String> listCmt = new ArrayList<String>(Arrays.asList(newdg.getComment().split(",")));
        float ss = (float) Math.round(newdg.getSoSao() * 100) / 100;
        request.setAttribute("sp", sp);
        request.setAttribute("listCate", listC);
        request.setAttribute("tag", sp.getIdLoaiHang());
        request.setAttribute("ss", ss);
        request.setAttribute("mess", "Cảm ơn bạn đã đánh giá");
        request.setAttribute("listCmt", listCmt);
        request.getRequestDispatcher("detail.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
