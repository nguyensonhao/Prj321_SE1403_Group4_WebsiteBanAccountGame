/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Product;
import ModelDao.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

/**
 *
 * @author Quang Hiển
 */
public class ADMController extends HttpServlet {

    HttpSession session;

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet adminController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet adminController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        String page = request.getParameter("page");
        if (page == null) {
            request.getRequestDispatcher("admin/Index.jsp").forward(request, response);

        } else {
            doPost(request, response);
        }

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
        String page = request.getParameter("page");
        if (page.equals("edit_product")) {
            String name = request.getParameter("name");
            String price = request.getParameter("price");
            String type = request.getParameter("type");
            String codeproduce = request.getParameter("codeproduce");
            String description = request.getParameter("description");
            String priceSale = request.getParameter("sale");
            if (request.getParameter("id") != null) {
                Product p = new Product();
                int id = Integer.parseInt(request.getParameter("id"));
                p.setpId(id);
                new ProductDAO().updateProduct(p);
            }
            response.sendRedirect("admin/IndexADM.jsp");
//            request.getRequestDispatcher(" IndexADM.jsp").forward(request, response);
        }
        if (page.equals("edit")) {
            int id = Integer.parseInt(request.getParameter("id"));
            ProductDAO product = new ProductDAO();
            Product p = null;
            p = product.getProduct(id);
            getServletContext().setAttribute("p", p);

//            request.getRequestDispatcher("admin/EditProduct.jsp").forward(request, response);
            response.sendRedirect("admin/EditProduct.jsp");
        }

        if (page.equals("delete")) {
            int id = Integer.parseInt(request.getParameter("id"));
            ProductDAO getDB = new ProductDAO();
            getDB.deleteProduct(id);
            response.sendRedirect("admin/IndexADM.jsp");
        }

        if (page.equals("add_product")) {
            String name = request.getParameter("name");
            String price = request.getParameter("price");
            String type = request.getParameter("type");
            String description = request.getParameter("description");
            String codeproduce = request.getParameter("codeproduce");
            String image = request.getParameter("image");
            String priceSale = request.getParameter("Sale");

            Product p = new Product();

            p.setpName(name);
            p.setpPrice(Integer.parseInt(price));
            p.setpType(type);
            p.setDescription(description);
            p.setCodeProduce(codeproduce);
            p.setPpriceSale(Integer.parseInt(priceSale));
            p.setpLImage(image);

            ProductDAO product = new ProductDAO();

            product.addProduct(p);
            response.sendRedirect("admin/IndexADM.jsp");
        }

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
