/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Depart;
import model.DepartDAO;

/**
 *
 * @author SANG
 */
@WebServlet(name = "DepartServlet", urlPatterns = {"/DepartServlet"})
public class DepartServlet extends HttpServlet {

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
            Depart d = null;
            DepartDAO dao = new DepartDAO();
            String action = request.getParameter("action");
            String id;
            if (action == null || action.equals("")) {
                request.setAttribute("Departs", new Depart());
                request.setAttribute("ACTION", "SaveOrUpdate");
                request.getRequestDispatcher("view-parts-user.jsp").forward(request, response);
                return;
            }
            
            switch(action) {
                case "SaveOrUpdate":
                    System.out.println("SaveOrUpdate");
                    id = request.getParameter("id");
                    String name = request.getParameter("name");
                    d = new Depart(id, name);
                    if (dao.findByID(id) == null) {
                        dao.insert(d);
                    } else {
                        dao.update(d);
                    }
                    System.out.println("size:"+dao.getAll());
                    request.getRequestDispatcher("dang-ki.jsp").forward(request, response);
                    break;
                case "List":
                    request.getRequestDispatcher("view-parts-user.jsp").forward(request, response);
                    break;
                case "AddOrEdit":
                    id = request.getParameter("id");
                    d = dao.findByID(id);
                    if (d == null) {
                        d = new Depart("", "");
                    }
                    request.setAttribute("Departs", d);
                    request.setAttribute("ACTION", "SaveOrUpdate");
                    request.getRequestDispatcher("dang-ki.jsp").forward(request, response);
                    break;
                case "Delete":
                    id = request.getParameter("id");
                    d = dao.findByID(id);
                    if (d != null) {
                        dao.delete(id);
                    }
                    request.getRequestDispatcher("view-parts-user.jsp").forward(request, response);
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
