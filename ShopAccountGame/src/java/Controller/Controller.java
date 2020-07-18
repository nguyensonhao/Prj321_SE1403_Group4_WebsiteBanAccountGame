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
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
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
public class Controller extends HttpServlet {
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
//        if (page == null || page.equals("index")) {
//            ProductDAO getDB = new ProductDAO();
//            try {
//                list = getDB.CreatedProduct();
//            } catch (SQLException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//
//            session = request.getSession();
//            //  session.setAttribute("cartlist", cartlist);
//            session.setAttribute("list", list);
//
//            request.getRequestDispatcher("index.jsp").forward(request, response);
//        } else {
//            doPost(request, response);
//        }
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
         if (page.equals("LienMinh") || page.equals("Lien Quan") || page.equals("FiFA") || page.equals("all-products")) {
            ProductDAO getDB = new ProductDAO();          
                list = getDB.getALL();
            request.setAttribute("list", list);

            if (page.equals("Lien Minh")) {
                request.getRequestDispatcher("#.jsp").forward(request, response);
            }
            if (page.equals("Lien Quan ")) {
                request.getRequestDispatcher("#.jsp").forward(request, response);
            }
            if (page.equals("FiFa")) {
                request.getRequestDispatcher("#.jsp").forward(request, response);
            }

            if (page.equals("All-Products")) {
                request.getRequestDispatcher("all-products.jsp").forward(request, response);
            }
        }
         if (page.equals("showcart")) {
            request.getRequestDispatcher("cart.jsp").forward(request, response);
        }
         if (page.equals("addtocart")) {
            String id = request.getParameter("id");
            String action = request.getParameter("action");
            Product p = new Product();
            boolean check = p.check(cartlist, id);

            if (check) {
                JOptionPane.showMessageDialog(null, "Product is already added to Cart", "Info", JOptionPane.INFORMATION_MESSAGE);
            } else {
                cartlist.add(id);
                JOptionPane.showMessageDialog(null, "Product successfully added to Cart", "Info", JOptionPane.INFORMATION_MESSAGE);
            }

            if (action.equals("index")) {
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
            if (action.equals("allproducts")) {
                request.getRequestDispatcher("all-products.jsp").forward(request, response);
            }
            if (action.equals("clothing")) {
                request.getRequestDispatcher("clothing.jsp").forward(request, response);
            }
            if (action.equals("home-decor")) {
                request.getRequestDispatcher("home-decor.jsp").forward(request, response);
            }
            if (action.equals("laptops")) {
                request.getRequestDispatcher("laptops.jsp").forward(request, response);
            }
            if (action.equals("mobiles")) {
                request.getRequestDispatcher("mobiles.jsp").forward(request, response);
            }
        }
         if (page.equals("remove")) {
            String id = request.getParameter("id");
            Product p = new Product();
            cartlist = p.remove(cartlist, id);

            session = request.getSession();
            session.setAttribute("cartlist", cartlist);
            request.getRequestDispatcher("cart.jsp").forward(request, response);
        }
          if (page.equals("price-sort")) {
            String price = request.getParameter("sort");
            String action = request.getParameter("action");
            Product p = new Product();
            if (price.equals("low-to-high")) {
                list = p.lowtohigh(list);
            } else {
                list = p.hightolow(list);
            }

            session.setAttribute("list", list);

            if (action.equals("index")) {
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
            if (action.equals("all-products")) {
                request.getRequestDispatcher("all-products.jsp").forward(request, response);
            }
            if (action.equals("mobiles")) {
                request.getRequestDispatcher("mobiles.jsp").forward(request, response);
            }
            if (action.equals("laptops")) {
                request.getRequestDispatcher("laptops.jsp").forward(request, response);
            }
            if (action.equals("clothing")) {
                request.getRequestDispatcher("clothing.jsp").forward(request, response);
            }
            if (action.equals("home-decor")) {
                request.getRequestDispatcher("home-decor.jsp").forward(request, response);
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
