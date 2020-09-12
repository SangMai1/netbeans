/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.LoaiSachDAO;
import daos.SachDAO;
import helper.DateHelper;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.LoaiSach;
import models.Sach;

/**
 *
 * @author SANG
 */
@WebServlet(name = "SachServlet", urlPatterns = {"/SachServlet"})
public class SachServlet extends HttpServlet {

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
            Sach s = null;
            SachDAO dao = new SachDAO();
            LoaiSachDAO lsdao = new LoaiSachDAO();
            String action = request.getParameter("action");
            String maSach;
            if (action == null || action.equals("")) {
                request.setAttribute("SACH", new Sach());
                request.setAttribute("ACTION", "SaveOrUpdate");
                request.getRequestDispatcher("sach.jsp").forward(request, response);
                return;
            }
            switch(action){
                case "SaveOrUpdate":
                    maSach = request.getParameter("maSach");
                    String tenSach = request.getParameter("tenSach");
                    Date ngayNhap = DateHelper.todate(request.getParameter("ngayNhap"));
                    int soLuong = Integer.parseInt(request.getParameter("soLuong"));
                    double giaTien = Double.parseDouble(request.getParameter("giaTien"));
                    int loaiSach = Integer.parseInt(request.getParameter("loaiSach"));
                    s = new Sach(maSach, new LoaiSach(loaiSach), tenSach, ngayNhap, giaTien, soLuong);
                    if (dao.getById(maSach) == null) {
                        dao.add(s);
                    } else {
                        dao.update(s);
                    }
                    System.out.println("size"+dao.getAll());
                    request.setAttribute("LIST_LOAISACH", lsdao.getAll());
                    request.getRequestDispatcher("sach.jsp").forward(request, response);
                    break;
                case "List":
                    
                    request.setAttribute("LIST_SACH", dao.getAll());
                    request.getRequestDispatcher("sach_view.jsp").forward(request, response);
                    break;
                case "AddOrEdit":
                    maSach = request.getParameter("maSach");
                    s = dao.getById(maSach);
                    if (s == null) {
                        s = new Sach("", new LoaiSach(0, ""),"", DateHelper.now(), 0.0, 0);
                    }
                    request.setAttribute("SACH", s);
                    request.setAttribute("ACTION", "SaveOrUpdate");
                    request.getRequestDispatcher("sach.jsp").forward(request, response);
                    break;
                case "delete":
                    maSach = request.getParameter("maSach");
                    s = dao.getById(maSach);
                    if (s != null) {
                        dao.delete(maSach);
                    }
                    request.setAttribute("LIST_SACH", dao.getAll());
                    request.getRequestDispatcher("sach_view.jsp").forward(request, response);
                    break;
                case "search":
                    String tenSac = request.getParameter("ten");
                    request.setAttribute("LIST_SACH", dao.getOne(tenSac));
                    request.getRequestDispatcher("sach_view.jsp").forward(request, response);
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
