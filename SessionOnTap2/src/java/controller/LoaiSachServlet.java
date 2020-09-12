/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.LoaiSachDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.LoaiSach;

/**
 *
 * @author SANG
 */
@WebServlet(name = "LoaiSachServlet", urlPatterns = {"/LoaiSachServlet"})
public class LoaiSachServlet extends HttpServlet {

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
            LoaiSach ls = null;
            LoaiSachDAO dao = new LoaiSachDAO();
            String action = request.getParameter("action");
            int maLoaiSach;
            
            if (action == null || action.equals("")) {
                request.setAttribute("LOAISACH", new LoaiSach());
                request.setAttribute("ACTION", "SaveOrUpdate");
                request.getRequestDispatcher("loaisach2.jsp").forward(request, response);
                return;
            }
            switch(action) {
                case "SaveOrUpdate":
                    System.out.println("SaveOrUpdate");
                    maLoaiSach = Integer.parseInt(request.getParameter("maLoaiSach"));
                    String TenLoaiSach = request.getParameter("tenLoaiSach");
                    ls = new LoaiSach(maLoaiSach, TenLoaiSach);
                    if (dao.getById(maLoaiSach) == null) {
                        System.out.println("add ddc chua");
                        dao.add(ls);
                    } else {
                        dao.update(ls);
                    }
                    System.out.println("size"+dao.getAll());
                    request.getRequestDispatcher("loaisach2.jsp").forward(request, response);
                    break;
                case "List":
                    request.setAttribute("LIST_LOAISACH", dao.getAll());
                    request.getRequestDispatcher("loaisach_view.jsp").forward(request, response);
                    break;
                case "AddOrEdit":
                    maLoaiSach = Integer.parseInt(request.getParameter("maLoaiSach"));
                    ls = dao.getById(maLoaiSach);
                    if (ls == null) {
                        ls = new LoaiSach(0, "");
                    }
                    request.setAttribute("LOAISACH", ls);
                    request.setAttribute("ACTION", "SaveOrUpdate");
                    request.getRequestDispatcher("loaisach2.jsp").forward(request, response);
                    break;
                case "delete":
                    maLoaiSach = Integer.parseInt(request.getParameter("maLoaiSach"));
                    ls = dao.getById(maLoaiSach);
                    if (ls != null) {
                        dao.delete(maLoaiSach);
                    }
                    request.setAttribute("LIST_LOAISACH", dao.getAll());
                    request.getRequestDispatcher("loaisach_view.jsp").forward(request, response);
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
