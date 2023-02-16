/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DAO;
import entity.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author khanh
 */
@WebServlet(name = "ShowCartController", urlPatterns = {"/showcart"})
public class ShowCartController extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        if (session.getAttribute("acc") == null) {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else {
            User us = (User) session.getAttribute("acc");
            String acc = us.getUsername();
            DAO dao = new DAO();
            Order kh = dao.listOrder(acc);
            if (kh != null) {
                List<HoaDonChiTiet> listHDCT = dao.getHdctByidDH(kh.getIdDonHang());
                float sum = 0;
                List<ListCart> listCart = new ArrayList<>();
                for (HoaDonChiTiet hdct : listHDCT) {
                    String idSP = hdct.getIdSP();
                    float dongia = dao.getProductByIDSP(hdct.getIdSP()).getDongia();
                    int soluong = hdct.getSoLuong();
                    String image = dao.getProductByIDSP(hdct.getIdSP()).getImage();
                    String tenSp = dao.getProductByIDSP(hdct.getIdSP()).getTenSp();
                    listCart.add(new ListCart(idSP, dongia, soluong, image, tenSp));
                }
                for (ListCart ls : listCart) {
                    sum += ls.getThanhtien();
                }

                request.setAttribute("sum", sum);
                request.setAttribute("mess", null);
                request.setAttribute("listCart", listCart);
                request.getRequestDispatcher("cart.jsp").forward(request, response);
            } else {
                request.setAttribute("mess", "Không có sản phẩm trong giỏ hàng");
                request.getRequestDispatcher("cart.jsp").forward(request, response);
            }
        }

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
        processRequest(request, response);
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
