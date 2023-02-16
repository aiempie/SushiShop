/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DAO;
import dao.adminDao;
import entity.Customer;
import entity.HoaDonChiTiet;
import entity.ListCart;
import entity.User;
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
@WebServlet(name = "LoadOrderController", urlPatterns = {"/loadOrder"})
public class LoadOrderController extends HttpServlet {

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
        int id = Integer.parseInt(request.getParameter("id"));
        String c = request.getParameter("us");
        HttpSession session = request.getSession();
        adminDao addao = new adminDao();
        DAO dao = new DAO();
        if (session.getAttribute("acc") == null) {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else {
            User us = (User) session.getAttribute("acc");
            if (us.getIsAdmin() == 0) {
                session.setAttribute("acc", us);
                request.setAttribute("mess", "Tài khoản bạn không thuộc admin!");
                request.getRequestDispatcher("trangquanlyAdmin.jsp").forward(request, response);

            } else {
                session.setAttribute("acc", us);
                /* TODO output your page here. You may use following sample code. */
                List<HoaDonChiTiet> listHDCT = dao.getHdctByidDH(id);
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
                Customer cus = dao.getCusByUser(c);
                request.setAttribute("sum", sum);
                request.setAttribute("listCt", listCart);
                request.setAttribute("cus", cus);
                request.setAttribute("dh", dao.searchOrderByID(id));
                request.getRequestDispatcher("chitietdh.jsp").forward(request, response);
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
