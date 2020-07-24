/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Product;
import Model.User;
import ModelDao.ProductDAO;
import ModelDao.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
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
        if(page.equals("home")){
            response.sendRedirect("index.jsp");
        }
        if (page.equals("logout")) {
            request.getSession();
            session.removeAttribute("username");
            session.removeAttribute("cartlist");
            response.sendRedirect("login.jsp");
        }
        if (page.equals("edit_product")) {
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            int price = Integer.parseInt(request.getParameter("price"));
            String type = request.getParameter("type");
            String codeproduce = request.getParameter("codeproduce");
            String description = request.getParameter("description");
            int priceSale = Integer.parseInt(request.getParameter("sale"));

            Product p = new Product();
            p.setpId(id);
            p.setpName(name);
            p.setpPrice(price);
            p.setpType(type);
            p.setCodeProduce(codeproduce);
            p.setDescription(description);
            p.setPpriceSale(priceSale);
            new ProductDAO().updateProduct(p);
            response.sendRedirect("admin/IndexADM.jsp");
//            request.getRequestDispatcher(" IndexADM.jsp").forward(request, response);
        }
        if (page.equals("edit")) {
            int id = Integer.parseInt(request.getParameter("id"));
            ProductDAO product = new ProductDAO();
            Product p = null;
            p = product.getProduct(id);
            getServletContext().setAttribute("p", p);

            //   request.getRequestDispatcher("admin/EditProduct.jsp").forward(request, response);
            response.sendRedirect("admin/EditProduct.jsp?");
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
        if (page.equals("edit_u")) {
            int id = Integer.parseInt(request.getParameter("uid"));
            String role = request.getParameter("role");
            if(role.equals("admin")){
                out.print("<script>alert('Admin is Cannot Edit');</script>");
                response.sendRedirect("admin/ManageUsers.jsp");
                 
            }else{
            UserDAO uDao = new UserDAO();
            User u = null;
            u = uDao.getUser(id);
            getServletContext().setAttribute("u", u);
            response.sendRedirect("admin/EditUser.jsp");
            }
        }
        if (page.equals("edit_user")) {
            int id = Integer.parseInt(request.getParameter("id"));
            String uFullName = request.getParameter("fullname");
            String userName = request.getParameter("username");
            String pasWord = request.getParameter("password");
            int uAge = Integer.parseInt(request.getParameter("age"));
            String uPhone = request.getParameter("phone");
            String uEmail = request.getParameter("email");
            String uAdrress = request.getParameter("address");    
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date birthday = Date.valueOf(request.getParameter("birthDay"));
            int roles = Integer.parseInt(request.getParameter("role"));
            User u = new User();
            u.setuId(id);
            u.setuFullName(uFullName);
            u.setUserName(userName);
            u.setPasWord(pasWord);
            u.setuAge(uAge);
            u.setuPhone(uPhone);
            u.setuEmail(uEmail);
            u.setuAdrress(uAdrress);
            u.setuBirthday(birthday);
            u.setRoles(roles);
             if( roles== 1){
                 new UserDAO().InsertAdmin(u);
            }
            new UserDAO().updateUser(u);
            

            response.sendRedirect("admin/ManageUsers.jsp");
//            request.getRequestDispatcher(" IndexADM.jsp").forward(request, response);
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
