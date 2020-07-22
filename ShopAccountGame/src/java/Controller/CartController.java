package Controller;

import Model.Bill;
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
@WebServlet(name = "CartController", urlPatterns = {"/CartController"})
public class CartController extends HttpServlet {

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
            if(request.getParameter("id")!=null && request.getParameter("sl")!=null){
                HttpSession session = request.getSession();
                ProductDAO pdao = new ProductDAO();
                Product p = pdao.getProduct(Integer.parseInt(request.getParameter("id")));
                
                BillDao bill = new BillDao();
                bill.insert(new Bill(p.getpName(),p.getQuantity(),p.getpLImage(), p.getDescription(),p.getpPrice(), new Date()));
                int quantity1 = Integer.parseInt(request.getParameter("sl"));
                ArrayList<Product> pr = pdao.getALL();
                session.setAttribute("Product", pr);
                if(quantity1 -1 < 0){
                    out.print("<script>alert('Quantity purchased cannot be greater than quantity in stock');</script>");
                    //back to slide buy product
                    out.print("<script>location.href='index.jsp';</script>");
                }else{
                    int id = Integer.parseInt(request.getParameter("id"));
                    pdao.updateBill(id, pdao.getProduct(id).getQuantity());
                    
                    if(session.getAttribute("cart")== null){
                        ArrayList<Product> cart = new ArrayList<>();
                        Product product = pdao.getProduct(id);
                        product.setQuantity(1);
                        cart.add(product);
                        request.getSession().setAttribute("cart", cart);
                                
                    }else{
                        ArrayList<Product> cart = (ArrayList<Product>) session.getAttribute("cart");
                        int index =-1;
                        
                        // find Item exist in list cart
                        for(int i =0; i<cart.size(); i++){
                            if(cart.get(i).getpId()==id){
                                index = i;
                                break;
                            }
                        }
                        
                         //if not exist, create new item then add it to cart
                        if(index ==-1){
                           Product product = pdao.getProduct(id);
                           product.setQuantity(1);
                           cart.add(product);
                        }else{
                            int quantity = cart.get(index).getQuantity()+1;
                            cart.get(index).setQuantity(quantity);
                        }
                        request.getSession().setAttribute("cart", cart);
                    }
                }
            }
            //response.sendRedirect("cart.jsp");
//            request.getRequestDispatcher("/cart.jsp").forward(request, response);
            response.sendRedirect("./cart.jsp");
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
