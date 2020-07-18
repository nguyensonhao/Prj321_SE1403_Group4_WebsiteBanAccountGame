/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

/**
 *
 * @author Quang Hiển
 */
public class UserDAO {
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
}
