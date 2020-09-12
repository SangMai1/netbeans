/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Helper.DateHelper;
import daos.StaffDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import daos.UserDAO;
import models.Departs;
import models.Staffs;
import models.Users;

/**
 *
 * @author SANG
 */
@WebServlet(name = "UserServlet", urlPatterns = {"/UserServlet"})
public class UserServlet extends HttpServlet {

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
            StaffDAO dao = new StaffDAO();
            Staffs sta = null;
            sta = new Staffs();
            sta.setId("R99");
            sta.setDeparts(new Departs("3"));
            sta.setBirthday(DateHelper.todate("4020-12-12"));
            sta.setEmail("vansang@gmail.com");
            sta.setGender(false);
            sta.setNotes("ooooooooooo");
            sta.setName("Bai 5");
            sta.setPhone("18001090");
            sta.setPhoto("anh-sao-viet-sy-tran-8-ngoisao.vn-w720-h960.jpg");
            sta.setSalary(Double.parseDouble("9999"));
//            System.out.println("add thanh cong");
//            sta = new Staffs("R99", new Departs("Sang"), DateHelper.todate("2020-12-12"), "vansang@gmail.com", true, "kkkkk", "Bau 5", "12345", "images 1", Double.valueOf(111));
              dao.add(sta);
//              System.out.println("=>"+sta.toString());
//            for (Staffs s: dao.getAllById("ang")) {
//                System.out.println("=>"+s.toString());
//            }
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
