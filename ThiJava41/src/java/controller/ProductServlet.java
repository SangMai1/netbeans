/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.ProductDAO;
import helper.DateHelper;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Product;

/**
 *
 * @author SANG
 */
@WebServlet(name = "ProductServlet", urlPatterns = {"/ProductServlet"})
public class ProductServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            Product p = null;
            ProductDAO dao = new ProductDAO();
            String action = request.getParameter("action");
            String maSp;
            
            if (action == null || action.equals("")) {
                request.setAttribute("PRODUCT", new Product());
                request.setAttribute("ACTION", "SaveOrUpdate");
                request.getRequestDispatcher("product.jsp").forward(request, response);
                return;
            }
            
            switch(action){
                case "SaveOrUpdate":
                    maSp = request.getParameter("maSp");
                    String tenSp = request.getParameter("tenSp");
                    Date ngayNhap = DateHelper.todate(request.getParameter("ngayNhap"));
                    Double giaTien = Double.parseDouble(request.getParameter("giaTien"));
                    int soLuong = Integer.parseInt(request.getParameter("soLuong"));
                    
                    p = new Product(maSp, tenSp, ngayNhap, soLuong, giaTien);
                    if (dao.getById(maSp) == null) {
                        dao.add(p);
                    } else {
                        dao.update(p);
                    }
                    request.setAttribute("LIST_PRODUCT", dao.getAll());
                    request.getRequestDispatcher("product.jsp").forward(request, response);
                    break;
                case "List":
                    request.setAttribute("LIST_PRODUCT", dao.getAll());
                    request.getRequestDispatcher("product_view.jsp").forward(request, response);
                    break;
                case "AddOrEdit":
                    maSp = request.getParameter("maSp");
                    p = dao.getById(maSp);
                    if (p == null) {
                        p = new Product("", "", DateHelper.now(), 0, 0.0);
                    }
                    request.setAttribute("PRODUCT", p);
                    request.setAttribute("ACTION", "SaveOrUpdate");
                    request.getRequestDispatcher("product.jsp").forward(request, response);
                    break;
                case "delete":
                    maSp = request.getParameter("maSp");
                    p = dao.getById(maSp);
                    if (p != null) {
                        dao.delete(maSp);
                    }
                    request.setAttribute("LIST_PRODUCT", dao.getAll());
                    request.getRequestDispatcher("product_view.jsp").forward(request, response);
                    break;
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
