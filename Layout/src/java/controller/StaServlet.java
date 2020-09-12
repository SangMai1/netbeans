/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import common.DateHelper;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Depart;
import model.Staffs;
import model.StaffsDAO;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author SANG
 */
@WebServlet(name = "StaServlet", urlPatterns = {"/StaServlet"})
public class StaServlet extends HttpServlet {

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
            String id;
            StaffsDAO dao = new StaffsDAO();
            Staffs sta = null;
            String fileName = null;
            if (action == null || action.equals("")) {
                request.setAttribute("STAFFS", new Staffs());
                request.setAttribute("ACTION", "SaveOrUpdate");
                request.getRequestDispatcher("layout_main.jsp").forward(request, response);
            }
            System.out.println("save"+action);
            switch(action) {
                case "SaveOrUpdate":
                    System.out.println("aaaaaaaaaaaaaa");
                    try {
                        DiskFileItemFactory factory = new DiskFileItemFactory();
                        ServletContext servletContext = this.getServletConfig().getServletContext();
                        File repository = (File) servletContext.getAttribute("javax.servlet.context.tempdir");
                        factory.setRepository(repository);
                        ServletFileUpload upload = new ServletFileUpload(factory);
                        List<FileItem> items = upload.parseRequest(request);
                        Iterator<FileItem> iter = items.iterator();
                        HashMap<String, String> fields = new HashMap<>();
                        System.out.println("gggggggg"+fields);
                        while (iter.hasNext()) {
                            FileItem item = iter.next();
                            if (item.isFormField()) {
                                fields.put(item.getFieldName(), item.getString());
                                String name = item.getFieldName();
//                                System.out.println("name: " + name);
                                String value = item.getString();
//                                System.out.println("value: "+ value);
                                System.out.println("=>" + fields.get("name"));
                            } else {
                                fileName = item.getName();
                                System.out.println("filename:" + fileName);
                                if (fileName == null || fileName.equals("")) {
                                    break;
                                } else {
                                    System.out.println("fileName == not null" + fileName);
                                    Path path = Paths.get(fileName);
                                    String storePath = servletContext.getRealPath("/uploads");
                                    File uploadFile = new File(storePath + "/" + path.getFileName());
                                    item.write(uploadFile);
                                    System.out.println(storePath + "/" + path.getFileName());
                                }
                            }
                        }
                        
                            System.out.println("--ko tim thay--");
                            id = request.getParameter(fields.get("id"));
                            Date birthday = DateHelper.todate(request.getParameter("birthday"), "yyyy-MM-dd");
                            String email = request.getParameter("email");
                            boolean gender = request.getParameter("gender").equals("1");
                            String name = request.getParameter("name");
                            String notes = request.getParameter("notes");
                            String phone = request.getParameter("phone");
                            String photo = request.getParameter(fileName);
                            float salary = Float.valueOf(request.getParameter("salary"));
                            Depart depart_id = new Depart(request.getParameter("id"));
                            if (dao.getById(id) == null) {
                                dao.insert(sta);
                                System.out.println("----SAVE----");
                        }
                        

                        request.setAttribute("LIST_STAFFS", dao.getAll());
                        request.getRequestDispatcher("layout/view-staff.jsp").forward(request, response);
                        break;
                    } catch (Exception e) {
                    }
                    break;
                case "List":
                    request.setAttribute("LIST_STAFFS", dao.getAll());
                    request.getRequestDispatcher("layout_main.jsp").forward(request, response);
                    break;
                case "AddOrEdit":
                    id = request.getParameter("id");
                    sta = (id == null) ? null : dao.getById(id);
                    if (sta == null) {
                        sta = new Staffs("", DateHelper.now(), "", true, "", "", "", "", Float.parseFloat(""), new Depart("", ""));
                    }
                    request.setAttribute("LIST_DEPART", dao.getAll());
                    request.setAttribute("STAFFS", sta);
                    request.setAttribute("ACTION", "SaveOrUpdate");
                    request.getRequestDispatcher("layout/register-staff.jsp").forward(request, response);
                case "Delete":
                    id = request.getParameter("id");
                    sta = dao.getById(id);
                    if (sta != null) {
                        dao.delete(id);
                    }
                    request.setAttribute("STAFFS", sta);
                    request.getRequestDispatcher("layoutview-staffs.jsp").forward(request, response);
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
