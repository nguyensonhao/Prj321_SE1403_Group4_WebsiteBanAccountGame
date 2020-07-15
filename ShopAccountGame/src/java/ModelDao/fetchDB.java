/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import Model.Product;
import Model.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Quang Hiển
 */
public class fetchDB {

    //   Connection conn;
    private String username = "root";
    private String password = "";
    private String dbName = "shopacc";
    private String url = "jdbc:mysql://localhost:3306/" + dbName;
    private String driver = "com.mysql.jdbc.Driver";
    ArrayList<Product> list = new ArrayList<>();
    private Connection conn;

    private void dbConnect() {
        try {
            Class.forName(driver);

            conn = DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
//    public fetchDB() {
//        DBConection dBConection = new DBConection();
//        this.conn = dBConection.getConnection();
//    }

    private void dbClose() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

//    public void addUser(User user) throws SQLException {
//
//        String sql = "Insert into user(name,email,username,address,password) values(?,?,?,?,?)";
//        PreparedStatement st = conn.prepareStatement(sql);
//
//        st.setString(1, user.getName());
//        st.setString(2, user.getEmail());
//        st.setString(3, user.getUsername());
//        st.setString(4, user.getAddress());
//        st.setString(5, user.getPassword());
//
//        st.executeUpdate();
//        dbClose();
//    }
//    public boolean checkUser(String username, String password) throws SQLException {
//
//        int count = 0;
//        String sql = "Select * from user where username = ? and password = ?";
//        PreparedStatement st = con.prepareStatement(sql);
//
//        st.setString(1, username);
//        st.setString(2, password);
//
//        ResultSet rs = st.executeQuery();
//
//        while (rs.next()) {
//            count = 1;
//        }
//
//        dbClose();
//        if (count == 0) {
//            return false;
//        }
//
//        return true;
//    }
    public ArrayList<Product> CreatedProduct() throws SQLException {
        dbConnect();
        String sql = "Select * from product";
        PreparedStatement st = conn.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("pId");
            String name = rs.getString("pName");
            int price = rs.getInt("pPrice");
            String type = rs.getString("pType");
            String Description = rs.getString("pDescription");
            String codeProduce = rs.getString("codeProduce");
            String image = rs.getString("pImage");
            int PpriceSale = rs.getInt("PpriceSale");

            Product p = new Product();
            p.setpName(name);
            p.setpPrice(price);
            p.setpType(type);
            p.setDescription(Description);
            p.setCodeProduce(codeProduce);
            p.setpLImage(image);
            p.setPpriceSale(PpriceSale);
            list.add(p);
            p = null;

        }
        dbClose();
        return list;
    }

//    public ArrayList<User> fetchUser() throws SQLException {
//
//        String sql = "Select * from user";
//        PreparedStatement st = conn.prepareStatement(sql);
//        ResultSet rs = st.executeQuery();
//
//        while (rs.next()) {
//            String address = rs.getString("address");
//            String user = rs.getString("username");
//            String email = rs.getString("email");
//            String name = rs.getString("name");
//            int id = rs.getInt("id");
//            String password = rs.getString("password");
//
//            User u = new User();
//            u.setAddress(address);
//            u.setEmail(email);
//            u.setId(id);
//            u.setName(name);
//            u.setUsername(user);
//            u.setPassword(password);
//            userList.add(u);
//            u = null;
//
//        }
//
//        dbClose();
//        return userList;
//    }
    public void deleteProduct(String id) throws SQLException {
        dbConnect();
        String sql = "Delete from product where id=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, id);
        st.executeUpdate();
        dbClose();

    }

    public Product getProduct(String id) throws SQLException {
        dbConnect();
        String sql = "select * from product where id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, id);
        ResultSet rst = pstmt.executeQuery();
        Product p = new Product();
        while (rst.next()) {
            p.setpId(rst.getInt("pId"));
            p.setpName(rst.getString("pName"));
            p.setpPrice(rst.getInt("pPrice"));
            p.setpType(rst.getString("pType"));
            p.setDescription(rst.getString("pDescription"));
            p.setCodeProduce(rst.getString("codeProduce"));
            p.setpLImage(rst.getString("pImage"));
            p.setPpriceSale(rst.getInt("PpriceSale"));
        }
        dbClose();
        return p;
    }

    public void updateProduct(Product p) throws SQLException {
        dbConnect();
        String sql = "UPDATE `product` SET `pName`=?,`pPrice`=?,`pType`=?,`pDescription`=?,`codeProduce`=?,`PpriceSale`=? where id=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, p.getpName());
        st.setInt(2, p.getpPrice());
        st.setString(3, p.getpType());
        st.setString(5, p.getCodeProduce());
        st.setString(4, p.getDescription());
        st.setInt(6, p.getPpriceSale());
        st.executeUpdate();
        dbClose();
    }

    public void addProduct(Product p) throws SQLException {
        dbConnect();
        String sql = "INSERT INTO `product`(`pName`, `pPrice`, `pType`, `pDescription`, `codeProduce`, `pImage`, `PpriceSale`) values(?,?,?,?,?,?,?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, p.getpName());
        st.setInt(2, p.getpPrice());
        st.setString(3, p.getpType());
        st.setString(5, p.getCodeProduce());
        st.setString(4, p.getDescription());
        st.setString(6, p.getpLImage());
        st.setInt(7, p.getPpriceSale());
        st.executeUpdate();
        dbClose();
    }
}
