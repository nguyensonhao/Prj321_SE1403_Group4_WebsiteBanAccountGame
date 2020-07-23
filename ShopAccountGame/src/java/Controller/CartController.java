 package Controller;

import Model.Bill;
import Model.Cart;
import Model.Product;
import ModelDao.BillDao;
import ModelDao.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Hao Nguyen
 */
public class CartController extends HttpServlet {
 private static final long serialVersionUID = 1L;
    ArrayList<Product> list = new ArrayList<>();
    static ArrayList<Cart> cartlist = new ArrayList<>();

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
        if (page == null || page.equals("index")) {
            request.getRequestDispatcher("index.jsp").forward(request, response);
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
        if (page.equals("addtocart")) {
            session = request.getSession();
            String action = request.getParameter("action");
            int id = Integer.parseInt(request.getParameter("id"));
            Cart cart = new Cart();
            boolean check = cart.check(cartlist, id);
            if (check) {
                response.sendRedirect("index.jsp");
            } else {
                Product product = new ProductDAO().getProduct(id);
                cart.setcId(product.getpId());
                cart.setcName(product.getpName());
                cart.setcPrice(product.getpPrice());
                cart.setcQuantity(product.getQuantity());
                cart.setcType(product.getpType());
                cart.setcLImage(product.getpLImage());
                cartlist.add(cart);
                session.setAttribute("cartlist", cartlist);
                if (action.equals("showcart")) {
                    request.getRequestDispatcher("cart.jsp").forward(request, response);
                }if (action.equals("index")) {
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }
            }

        }
        if (page.equals("remove")) {
            int id = Integer.parseInt(request.getParameter("id"));
            Cart cart = new Cart();
            cartlist = cart.remove(cartlist, id);
            session = request.getSession();
            session.setAttribute("cartlist", cartlist);
            request.getRequestDispatcher("cart.jsp").forward(request, response);
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
