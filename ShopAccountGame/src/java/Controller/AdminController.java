/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Product;
import ModelDao.fetchDB;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author Quang Hiển
 */
@WebServlet(name = "Admin", urlPatterns = {"/Admin"})
public class AdminController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    
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
//        String page = request.getParameter("page");
//        if (page == null) {
//            request.getRequestDispatcher("admin/login.jsp").forward(request, response);;
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
//        if (page.equals("admin-login-form")) {
//            String username = request.getParameter("username");
//            String password = request.getParameter("password");
//
//            if (username.equals("admin") && password.equals("admin@1234")) {
//                request.getRequestDispatcher("admin/index.jsp").forward(request, response);
//
//            } else {
//                request.setAttribute("msg", "Invalid Crediantials");
//                request.setAttribute("username", username);
//                request.getRequestDispatcher("admin/login.jsp").forward(request, response);
//
//            }
//        }

        if (page.equals("delete")) {
            String id = request.getParameter("id");
            fetchDB getDB = new fetchDB();
            try {
                getDB.deleteProduct(id);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            JOptionPane.showMessageDialog(null, "Product deleted successfully", "Info", JOptionPane.INFORMATION_MESSAGE);
            request.getRequestDispatcher("admin/IndexADM.jsp").forward(request, response);

        }

//        if (page.equals("index")) {
//            request.getRequestDispatcher("IndexADM.jsp").forward(request, response);
//        }
//
//        if (page.equals("addproduct")) {
//            request.getRequestDispatcher("admin/AddProduct.jsp").forward(request, response);
//        }

        if (page.equals("edit")) {
            String id = request.getParameter("id");
            fetchDB account = new fetchDB();
            Product p = null;
            try {
                p = account.getProduct(id);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            request.setAttribute("p", p);
            request.getRequestDispatcher("admin/EditProduct.jsp").forward(request, response);
        }
        if (page.equals("edit_product")) {
            String id = request.getParameter("pId");
            String name = request.getParameter("pName");
            String price = request.getParameter("pPrice");
            String type = request.getParameter("pType");
            String description = request.getParameter("Description");
            String codeproduce = request.getParameter("codeProduce");
            String image = request.getParameter("pLImage");
            String priceSale = request.getParameter("PpriceSale");

            Product p = new Product();
            p.setpId(Integer.parseInt(id));
            p.setpName(name);
            p.setpPrice(Integer.parseInt(price));
            p.setpType(type);
            p.setDescription(description);
            p.setCodeProduce(codeproduce);
            p.setpLImage(image);
            p.setPpriceSale(Integer.parseInt(priceSale));

            fetchDB account = new fetchDB();
            try {
                account.updateProduct(p);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, "Product details updated successfully", "Info", JOptionPane.INFORMATION_MESSAGE);
            request.getRequestDispatcher("admin/IndexADM.jsp").forward(request, response);
        }

        if (page.equals("add_product")) {
            String id = request.getParameter("id");
            String name = request.getParameter("name");
            String price = request.getParameter("price");
            String type = request.getParameter("type");
            String description = request.getParameter("description");
            String codeproduce = request.getParameter("codeproduce");
            String image = request.getParameter("image");
            String priceSale = request.getParameter("Sale");

            Product p = new Product();
            p.setpId(Integer.parseInt(id));
            p.setpName(name);
            p.setpPrice(Integer.parseInt(price));
            p.setpType(type);
            p.setDescription(description);
            p.setCodeProduce(codeproduce);
            p.setPpriceSale(Integer.parseInt(priceSale));
            p.setpLImage("img/" + image);

            fetchDB account = new fetchDB();
            try {
                account.addProduct(p);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, "Product added Successfully", "Info", JOptionPane.INFORMATION_MESSAGE);
            request.getRequestDispatcher("admin/IndexADM.jsp").forward(request, response);
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
