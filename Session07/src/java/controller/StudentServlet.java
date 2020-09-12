/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import common.DateHelper;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Major;
import model.MajorDAO;
import model.Student;
import model.StudentDAO;

/**
 *
 * @author SANG
 */
@WebServlet(name = "StudentServlet", urlPatterns = {"/StudentServlet"})
public class StudentServlet extends HttpServlet {

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
           
            Student st = null;
            StudentDAO dao = new StudentDAO();

            String action = request.getParameter("action");
            String id;
            if (action == null || action.equals("")) {
                request.setAttribute("STUDENT", new Student());
                request.setAttribute("ACTION", "SaveOrUpdate");
                request.getRequestDispatcher("view-student.jsp").forward(request, response);
                return;
            }
            
            switch(action) {
                case "SaveOrUpdate":
                    id = request.getParameter("id");
                    String name = request.getParameter("name");
                    Date birthday = DateHelper.todate(request.getParameter("birthday"));
                    int major = Integer.parseInt(request.getParameter("major"));
                    st = new Student(id, name, birthday, new Major(major));
//                    dao.save(user);
                    if (dao.findByID(id) == null) {
                        System.out.println(st.toString());
                        dao.insert(st);
                    } else {
                        dao.update(st);
                    }
                    System.out.println("size"+dao.getAll().size());
                    request.getRequestDispatcher("register-student.jsp").forward(request, response);
                    break;
                case "List":
//                    request.getRequestDispatcher("view-user.jsp").forward(request, response);
                    request.setAttribute("LIST_STUDENT", dao.getAll());
                    request.getRequestDispatcher("view-student.jsp").forward(request, response);
                    break;
                case "AddOrEdit":
                    id = request.getParameter("id");
                    st = (id == null) ? null : dao.findByID(id);
                    if (st == null) {
                        st = new Student("", "", DateHelper.now(), new Major(0, ""));
                    }
                    request.setAttribute("LIST_MAJOR", dao.getAll());
                    request.setAttribute("STUDENT", st);
                    request.setAttribute("ACTION", "SaveOrUpdate");
                    request.getRequestDispatcher("register-student.jsp").forward(request, response);
                case "Delete":
                    id = request.getParameter("id");
                    st = dao.findByID(id);
                    if (st != null) {
                        dao.delete(id);
                    }
                    request.setAttribute("STUDENT", st);
                    request.getRequestDispatcher("view-student.jsp").forward(request, response);
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
