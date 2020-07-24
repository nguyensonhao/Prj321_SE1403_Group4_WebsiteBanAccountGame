package Controller;

import Model.Bill;
import Model.Cart;
import Model.Product;
import Model.User;
import ModelDao.BillDao;
import ModelDao.ProductDAO;
import ModelDao.UserDAO;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
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
@WebServlet(name = "PaymentController", urlPatterns = {"/PaymentController"})
public class PaymentController extends HttpServlet {

    ArrayList<Cart> cartlist = new ArrayList<>();
    ArrayList<User> userlist = new ArrayList<>();
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
        session = request.getSession();
        String page = request.getParameter("page");
        if (page.equals("check_email")) {
            UserDAO pdAO = new UserDAO();
            int id = Integer.parseInt(session.getAttribute("uid").toString());
            String emailUser = pdAO.getUser(id).getuEmail();
            String newEmail = request.getParameter("Gmail");
            if (newEmail.equals(emailUser)) {
                session.setAttribute("email", newEmail);
                request.getRequestDispatcher("Payment.jsp").forward(request, response);
            } else {
                session.setAttribute("erorr", "Email khong ton tai");
                request.getRequestDispatcher("Payment.jsp").forward(request, response);
            }
        }
         if (page.equals("show cart")){
             session = request.getSession();
              request.getRequestDispatcher("Payment.jsp").forward(request, response);
         }
        if (page.equals("Thanhtoan")) {
            session = request.getSession();
            UserDAO udAO = new UserDAO();
            userlist = udAO.getUserAll();
            String username = session.getAttribute("User").toString();          
            UserDAO udao = new UserDAO();
            int uID = udao.getUid(username);
            User user = udao.getUser(uID);    
            BillDao bdao = new BillDao();
            Bill b = new Bill();
            if (username == null) {
                request.getRequestDispatcher("login.jsp").forward(request, response);
            } else {
                int cID = 0;
                udao.getUserAll();
                for(Cart ct: cartlist){
                   cID = ct.getcId();
                }
                Product p = new ProductDAO().getProduct(cID);
                int total = Integer.parseInt(request.getParameter("total"));
                cartlist = (ArrayList<Cart>) session.getAttribute("cartlist");
                for (Cart c : cartlist) {
                    b.setpName(c.getcName());
                    b.setbQuantity(c.getcQuantity());
                    b.setpType(c.getcType());
                    b.setpPrice(c.getcPrice());
                    b.setbTotalPrice(total);
                    b.setuEmail(user.getuEmail());
                    b.setbDateBuy(Date.valueOf(LocalDate.now()));
                    b.setCodeProduce(p.getCodeProduce());      
                    int order =bdao.insertBill(b);
                }
                
                cartlist.clear();
                
            }
             request.getRequestDispatcher("index.jsp").forward(request, response);

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
