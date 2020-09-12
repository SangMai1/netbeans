/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SANG
 */
@WebServlet(name = "ptb2Servlet", urlPatterns = {"/ptb2Servlet"})
public class ptb2Servlet extends HttpServlet {

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
            String action = request.getParameter("action");
            if(action == null || action.equals("")){
                RequestDispatcher rd = request.getRequestDispatcher("giaipt2.html");
                rd.forward(request, response);
            } else {
                if (action.equals("ketqua")) {
                    double a = Double.parseDouble(request.getParameter("numbera"));
                    double b = Double.parseDouble(request.getParameter("numberb"));
                    double c = Double.parseDouble(request.getParameter("numberc"));
                    if(a == 0){
                        if(b == 0){
                            if (c == 0) {
                                out.write("<p>"+ "PTVSN" + "</p>" );
                            } else {
                                out.write("<p>"+ "PTVN" + "</p>" );
                            }
                        }
                        else {
                            out.write("<p>"+ "Nghiem:" + -c/b + "</p>" );
                        }
                    }
                    else {
                        double detal = b * b - 4 * a * c;
                        if (detal < 0) {
                            out.write("<p>"+"PTVN" + "</p>");
                        }
                        if(detal == 0){
                            out.write("<p> PT da cho co nghiem kep" + -b/(2 * a) + "</p>");
                        }
                        if (detal > 0) {
                            double x1 = (-b + Math.sqrt(detal)) / (2 * a);
                            double x2 = (-b +-Math.sqrt(detal)) / (2 * a);
                            out.write("<p> Nghiem x1:" + x1 + "</p>");
                            out.write("<p> Nghiem x1:" + x2 + "</p>");
                        }
                    }
                }
                
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
