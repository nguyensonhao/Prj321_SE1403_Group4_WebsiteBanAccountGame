/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import Model.User;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NhatCuong
 */
public class UserDAO {

    ArrayList<User> userList = new ArrayList<>();
    private Connection conn;
    //   ArrayList<Product> list = new ArrayList<>();

    public UserDAO() {
        DBConection dBConection = new DBConection();
        this.conn = dBConection.getConnection();
    }

    public String checkUser(User u) {
        try {
            String username = u.getUserName();
            String password = u.getPasWord();
            int roleId = u.getRoles();
            MessageDigest alg = MessageDigest.getInstance("MD5");
            alg.reset();
            alg.update(password.getBytes());
            byte[] digest = alg.digest();
            StringBuffer hashedpasswd = new StringBuffer();
            String hx;
            for (int i = 0; i < digest.length; i++) {
                hx = Integer.toHexString(0xFF & digest[i]);
                //0x03 is equal to 0x3, but we need 0x03 for our md5sum
                if (hx.length() == 1) {
                    hx = "0" + hx;
                }
                hashedpasswd.append(hx);
            }
            password = hashedpasswd.toString();
            String userDB;
            String passDB;
            int uRole = 0;

            String sql = "SELECT userName,uPassWord,rId FROM `user`";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                userDB = rs.getString("userName");
                passDB = rs.getString("uPassWord");
                uRole = rs.getInt("rId");
                if (username.equals(userDB) && password.equals(passDB) && rs.getInt("rId") == 1) {
                    return "Admin_Role";
                } else if (username.equals(userDB) && password.equals(passDB) && rs.getInt("rId") == 2) {
                    return "User_Role";
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Invalid user credentials";
    }

    public User getUser(int userId) {
        try {
            String sql = "SELECT * FROM `user`where uId=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, userId);
            ResultSet rst = pstmt.executeQuery();
            User u = new User();
            while (rst.next()) {
                u.setuId(rst.getInt("uId"));
                u.setuFullName(rst.getString("uFullName"));
                u.setUserName(rst.getString("userName"));
                u.setPasWord(rst.getString("uPassWord"));
                u.setRoles(rst.getInt("rId"));
                u.setuAge(rst.getInt("uAge"));
                u.setuPhone(rst.getString("uPhone"));
                u.setuEmail(rst.getString("uEmail"));
                u.setuAdrress(rst.getString("uAddress"));
                u.setuBirthday(rst.getDate("uBirthday"));
            }
            return u;
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int updateUser(User u) {
        try {
            String sql = "UPDATE `user` SET `uFullName`=?,`userName`=?,`uPassWord`= MD5(?),"
                    + "`rId`=?,`uAge`=?,`uPhone`=?,"
                    + "`uEmail`=?,`uAddress`=?,`uBirthday`=? WHERE uId=?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, u.getuFullName());
            st.setString(2, u.getUserName());
            st.setString(3, u.getPasWord());
            st.setInt(4, u.getRoles());
            st.setInt(5, u.getuAge());
            st.setString(6, u.getuPhone());
            st.setString(7, u.getuEmail());
            st.setString(8, u.getuAdrress());
            st.setDate(9, (java.sql.Date) u.getuBirthday());
            st.setInt(10, u.getuId());

            return st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    public int addUser(User u) {
        try {
            String sql = "INSERT INTO `user`(`uFullName`, `userName`, `uPassWord`, `rId`, `uAge`, `uPhone`, `uEmail`, `uAddress`, `uBirthday`) values(?,?,MD5(?),?,?,?,?,?,?)ORDER BY uId ASC";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, u.getuFullName());
            st.setString(2, u.getUserName());
            st.setString(3, u.getPasWord());
            st.setInt(4, u.getRoles());
            st.setInt(5, u.getuAge());
            st.setString(6, u.getuPhone());
            st.setString(7, u.getuEmail());
            st.setString(8, u.getuAdrress());
            st.setDate(9, u.getuBirthday());
            return st.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

}
