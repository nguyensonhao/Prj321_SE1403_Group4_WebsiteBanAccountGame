package ModelDao;

import Model.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hao Nguyen
 */
public class DBConection {
     Connection conn;

    public  DBConection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopacc", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(DBConection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConection.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    Connection getConnection() {
        return conn ;
    }
   
}
