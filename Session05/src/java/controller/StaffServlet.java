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
import model.DepartDAO;
import model.Staffs;
import model.StaffsDAO;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author SANG
 */
@WebServlet(name = "StaffServlet", urlPatterns = {"/StaffServlet"})
public class StaffServlet extends HttpServlet {

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
            Staffs sta = null;
            StaffsDAO dao = new StaffsDAO();
            DepartDAO dpdao = new DepartDAO();
            String id = null;
            String fileName = null;
            String action = request.getParameter("action");
            if (action == null || action.equals("")) {
                request.setAttribute("STAFFS", new Staffs());
                request.setAttribute("ACTION", "SaveOrUpdate");
                request.setAttribute("STAFFS", dao.getAll());
                request.getRequestDispatcher("view-staffs-user.jsp").forward(request, response);
                return;
            }
            
            switch(action) {
                case "SaveOrUpdate":
                    try {
                        // Create a factory for disk-based file items
                        DiskFileItemFactory factory = new DiskFileItemFactory();
                        // Configure a repository (to ensure a secure temp location is used)
                        ServletContext servletContext = this.getServletConfig().getServletContext();
                        File repository = (File) servletContext.getAttribute("javax.servlet.context.tempdir");
                        factory.setRepository(repository);
                        // Create a new file upload handler
                        ServletFileUpload upload = new ServletFileUpload(factory);
                        // Parse the request
                        List<FileItem> items = upload.parseRequest(request);
                        // Process the uploaded items
                        Iterator<FileItem> iter = items.iterator();
                        HashMap<String,String> fields =  new  HashMap<>();
                        while (iter.hasNext()) {
                            FileItem item = iter.next();
                            if (item.isFormField()) {
                                fields.put(item.getFieldName(), item.getString());
                                String name = item.getFieldName();
                                System.out.println("name: " + name);
                                String value = item.getString();
                                System.out.println("value: "+ value);
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
                        id = fields.get("id");
                        sta = dao.getById(id);
                        if (sta == null) {
                            System.out.println("k tim thay");
                            Staffs staNew = new Staffs();
                            staNew.setId(fields.get("id"));
                            staNew.setName(fields.get("name"));
                            staNew.setBirthday(DateHelper.todate(fields.get("birthday")));
                            staNew.setEmail(fields.get("email"));
                            staNew.setPhone(fields.get("phone"));
                            int gt = Integer.parseInt(fields.get("gender"));
                            if (gt > 0) {
                                staNew.setGender(true);
                            } else {
                                staNew.setGender(false);
                            }
                            staNew.setNotes(fields.get("notes"));
                            staNew.setPhoto(fileName);
                            staNew.setSalary(Float.parseFloat(fields.get("salary")));
                            staNew.setDepart_id(new Depart(fields.get("depart_id")));
                            dao.insert(staNew);
                            System.out.println("save"); 
                            
                        } else {
                            System.out.println("tim thay");
                            Staffs staNew = new Staffs();
                            staNew.setId(fields.get("id"));
                            staNew.setName(fields.get("name"));
                            staNew.setBirthday(DateHelper.todate(fields.get("birthday")));
                            staNew.setEmail(fields.get("email"));
                            staNew.setPhone(fields.get("phone"));
                            int gt = Integer.parseInt(fields.get("gender"));
                            if (gt > 0) {
                                staNew.setGender(true);
                            } else {
                                staNew.setGender(false);
                            }
                            staNew.setNotes(fields.get("notes"));
                            staNew.setPhoto(fileName);
                            staNew.setSalary(Float.parseFloat(fields.get("salary")));
                            staNew.setDepart_id(new Depart(fields.get("depart_id")));
                            if (fileName == null || fileName.equals("")) {
                                System.out.println("file not null"+fileName);
                                staNew.setPhoto(sta.getPhoto());
                            } else {
                                staNew.setPhoto(fileName);
                            }
                            dao.update(sta);
                            System.out.println("update");
                        }
                    } catch (Exception e) {
                        System.out.println("eeeeeeror"+e.toString());
                    }
                    request.getRequestDispatcher("register-staffs-user.jsp").forward(request, response);
                    break;
                case "List":
                    request.setAttribute("LIST_STAFFS", dao.getAll());
                    request.getRequestDispatcher("view-staffs-user.jsp").forward(request, response);
                    break;
                case "AddOrEdit":
                    id = request.getParameter("id");
                    sta = dao.getById(id);
                    if (sta == null) {
                        sta = new Staffs("", DateHelper.now(), "", true, "", "", "", "", Float.parseFloat(""), null);
                    }
//                    request.setAttribute("LIST_DEPART", dao.getAll());
                    request.setAttribute("STAFFS", sta);
                    request.setAttribute("ACTION", "SaveOrUpdate");
                    request.getRequestDispatcher("register-staffs-user.jsp").forward(request, response);
                    break;
                case "Delete":
                    id = request.getParameter("id");
                    sta = dao.getById(id);
                    if (sta != null) {
                        dao.delete(id);
                    }
                    request.setAttribute("LIST_STAFFS", dao.getAll());
                    request.getRequestDispatcher("view-staffs-user.jsp").forward(request, response);
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
