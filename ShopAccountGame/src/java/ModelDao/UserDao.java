/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import Model.User;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Nhat Cuong
 */
public class UserDao {

    private Connection con;
    private PreparedStatement pst;
    private Statement st;
    private ResultSet rs;
    private String str;
    private ArrayList<User> arr;
    
    public UserDao() throws SQLException {
        try {
            con = DBConnection.getConnection();
            st = con.createStatement();
            pst = null;
            rs = null;
            str = "";
        } catch (SQLException e) {
            throw new SQLException("PLEASE CONNECT TO DATABASE BEFORE START");
        }
    }
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                java.util.Date date = new java.util.Date();
    
    public ArrayList<User> LoadAccount() throws SQLException{
        ArrayList<User> listUser = new ArrayList<>();
        try {
            con = DBConnection.getConnection();
            st = con.createStatement();
            str ="SELECT * FROM `user`";
            rs = st.executeQuery(str);
            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    String FullName = rs.getString("uFullName");
                    String Name = rs.getString("userName");
                    String PassWord = rs.getString("uPassWord");
                    int Age = rs.getInt("uAge");
                    int Phone = rs.getInt("uPhone");
                    String Email = rs.getString("uEmail");
                    String Address = rs.getString("uAddress");
                    Date Birthday = rs.getDate("uBirthday");
                    
                    listUser.add(new User(FullName,PassWord,Age,Phone,Email,Address,Birthday));
                }
            }
        } catch (SQLException e) {
            throw new SQLException("Can't load games");
        }
        return listUser;
    }
    
    public void insertAccount(String uFullName, String userName, String uPassWord, int uAge, int uPhone, String uEmail, String uAdrress, Date uBirthday) throws SQLException {
        try {
            
            str = "INSERT INTO `user`(`uFullName`, `userName`, `uPassWord`, `uAge`, `uPhone`, `uEmail`, `uAddress`, `uBirthday`) VALUES (?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(str, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, uFullName);
            pst.setString(2, userName);
            pst.setString(3, uPassWord);
            pst.setInt(4, uAge);
            pst.setInt(5, uPhone);
            pst.setString(6, uEmail);
            pst.setString(7, uAdrress);
            pst.setDate(8, uBirthday);
            pst.executeUpdate();
            rs = pst.getGeneratedKeys();
            rs.next();
        } catch (SQLException e) {
            throw new SQLException("Can't insert account");
        }
    }
}
