/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
import model.Infor;
import model.InforDAO;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author SANG
 */
@WebServlet(name = "InforServlet", urlPatterns = {"/InforServlet"})
public class InforServlet extends HttpServlet {

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
            InforDAO dao = new InforDAO();
            String id = request.getParameter("id");
            String fileName = null;
            Infor infor;
            if (action == null || action.equals("")) {
                request.setAttribute("LIST_INFOR", dao.getAll());
                request.getRequestDispatcher("view-infor.jsp").forward(request, response);
                return;
            }
            System.out.println("action:"+ action);
            switch (action) {
                case "List":
                    request.setAttribute("LIST_INFOR", dao.getAll());
                    request.getRequestDispatcher("view-infor.jsp").forward(request, response);
                    break;
                case "AddOrEdit":
                    id = request.getParameter("id");
                    infor = dao.findByID(id);
                    if (infor == null) {
                        request.setAttribute("INFOR", new Infor("", "", ""));
                    }
                    request.setAttribute("INFOR", infor);
                    request.setAttribute("ACTION", "SaveOrUpdate");
                    request.getRequestDispatcher("infor.jsp").forward(request, response);
                    break;
                case "SaveOrUpdate":
                    try {
                        DiskFileItemFactory factory = new DiskFileItemFactory();
                        ServletContext servletContext = this.getServletConfig().getServletContext();
                        File repository = (File) servletContext.getAttribute("javax.servlet.context.tempdir");
                        factory.setRepository(repository);
                        ServletFileUpload upload = new ServletFileUpload(factory);
                        List<FileItem> items = upload.parseRequest(request);
                        Iterator<FileItem> iter = items.iterator();
                        HashMap<String, String> fields = new HashMap<>();
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
                        id = fields.get("id");
                        infor = dao.findByID(id);
                        if (infor == null) {
                                System.out.println("--ko tim thay--");
                            Infor inforNew = new Infor();
                            inforNew.setId(fields.get("id"));
                            inforNew.setName(fields.get("name"));
//                                infor.setPhoto("abc.jpg");
                            inforNew.setPhoto(fileName);
                            dao.save(inforNew);
                            System.out.println("---Save---");
                        } else {
                            System.out.println("--tim thay");
                            Infor inforNew = new Infor();
                            inforNew.setId(fields.get("id"));
                            inforNew.setName(fields.get("name"));
                            if (fileName == null || fileName.equals("")) {
                                System.out.println("filename not null: "+fileName);
                                inforNew.setPhoto(infor.getPhoto());
                            } else {
                                inforNew.setPhoto(fileName);
                            }
                            dao.update(inforNew);
                            System.out.println("----Update----");
                        }

                        request.setAttribute("LIST_INFOR", dao.getAll());
                        request.getRequestDispatcher("view-infor.jsp").forward(request, response);
                        break;
                    } catch (Exception e) {
                    }
                case "Delete":
                    id = request.getParameter("id");
                    infor = dao.findByID(id);
                    if (infor != null) {
                        dao.delete(id);
                    }
                    request.setAttribute("INFOR", dao.getAll());
                    request.getRequestDispatcher("view-infor.jsp").forward(request, response);
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
