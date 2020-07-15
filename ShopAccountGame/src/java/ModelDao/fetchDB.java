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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Quang Hiển
 */
public class fetchDB {

    private Connection conn;
    ArrayList<Product> list = new ArrayList<>();

    public fetchDB() {
        DBConection dBConection = new DBConection();
        this.conn = dBConection.getConnection();
    }

    public ArrayList<Product> getALL() {

        try {
            String sql = "Select * from product WHERE 1";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("pId");
                String name = rs.getString("pName");
                int price = rs.getInt("pPrice");
                String type = rs.getString("pType");
                String Description = rs.getString("Description");
                String codeProduce = rs.getString("codeProduce");
                String image = rs.getString("pLImage");
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
            }

            return list;
        } catch (SQLException ex) {
            Logger.getLogger(fetchDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }


    public int deleteProduct(int id) {
        try {
            String sql = "DELETE FROM `product` WHERE pid=?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, id);
            return st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(fetchDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    public Product getProduct(int id) {
        try {
            String sql = "select * from product where pId=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
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
            return p;
        } catch (SQLException ex) {
            Logger.getLogger(fetchDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int updateProduct(Product p) {
        try {
            String sql = "UPDATE `product` SET `pName`=?,`pPrice`=?,`pType`=?,`pDescription`=?,`codeProduce`=?,`PpriceSale`=? WHERE pId=?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, p.getpName());
            st.setInt(2, p.getpPrice());
            st.setString(3, p.getpType());
            st.setString(5, p.getCodeProduce());
            st.setString(4, p.getDescription());
            st.setInt(6, p.getPpriceSale());
            st.setInt(7, p.getpId());
            return st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(fetchDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    public int addProduct(Product p) {

        try {
            String sql = "INSERT INTO `product`(`pName`, `pPrice`, `pType`, `pDescription`, `codeProduce`, `pImage`, `PpriceSale`) values(?,?,?,?,?,?,?)";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, p.getpName());
            st.setInt(2, p.getpPrice());
            st.setString(3, p.getpType());
            st.setString(5, p.getCodeProduce());
            st.setString(4, p.getDescription());
            st.setString(6, p.getpLImage());
            st.setInt(7, p.getPpriceSale());
            return st.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(fetchDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
