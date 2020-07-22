/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Product;
import Model.User;
import ModelDao.DBConection;
import ModelDao.ProductDAO;
import ModelDao.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
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
 * @author NhatCuong
 */
public class LoginController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    ArrayList<Product> list = new ArrayList<>();
    static ArrayList<String> cartlist = new ArrayList<>();
    ArrayList<User> userList = new ArrayList<>();
    HttpSession session;
    DBConection db = new DBConection();

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
            out.println("<title>Servlet Controller</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controller at " + request.getContextPath() + "</h1>");
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
        if (page.equals("login-form")) {
            String username = request.getParameter("txtUser");
            String password = request.getParameter("txtPassword");
            UserDAO udao = new UserDAO();
            User user = new User();
            user.setUserName(username);
            user.setPasWord(password);
            String status;
            status = udao.checkUser(user);
            if (status.equals("Admin_Role")) {
                session = request.getSession();
                session.setAttribute("Admin", username);
                getServletContext().setAttribute("username", username);
                response.sendRedirect("admin/IndexADM.jsp");
            } else if (status.equals("User_Role")) {
                session = request.getSession();
                session.setMaxInactiveInterval(10 * 60);
                session.setAttribute("User", username);
                getServletContext().setAttribute("username", username);
                response.sendRedirect("index.jsp");
            } else {
                response.sendRedirect("login.jsp");
            }
        }
        if (page.equals("registration")) {
            int rId = Integer.parseInt(request.getParameter("role"));
            String uFullname = request.getParameter("fullname");
            String uUser = request.getParameter("username");
            String pass1 = request.getParameter("pass1");
            String pass2 = request.getParameter("pass2");
            int age = Integer.parseInt(request.getParameter("age"));
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date uBirthday = Date.valueOf(request.getParameter("birthday"));
            String uPhone = request.getParameter("phone");
            String uEmail = request.getParameter("email");
            String uAddress = request.getParameter("address");

            if (pass1.equals(pass2)) {
                User u = new User();
                u.setuFullName(uFullname);
                u.setUserName(uUser);
                u.setPasWord(pass1);
                u.setuAge(age);
                u.setuBirthday(uBirthday);
                u.setuEmail(uEmail);
                u.setuPhone(uPhone);
                u.setuAdrress(uAddress);
                u.setRoles(rId);
                UserDAO uDAO = new UserDAO();
                uDAO.addUser(u);
                request.setAttribute("user", uUser);
                request.setAttribute("msg", "Account created successfully, Please Login!");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            } else {
                request.setAttribute("msg", "The two passwords do not match");
                request.setAttribute("name", uFullname);
                request.setAttribute("email", uEmail);
                request.setAttribute("username", uUser);
                request.getRequestDispatcher("signup.jsp").forward(request, response);
            }

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
