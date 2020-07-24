package ModelDao;

import Model.Bill;
import Model.Cart;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hao Nguyen
 */
public class BillDao {

    Connection conn;

    public BillDao() {
        DBConection dBConection = new DBConection();
        conn = dBConection.getConnection();
    }

    public int insertBill(Bill b) {
        try {

            String sql = "INSERT INTO `bill`(`pName`, `bQuantity`, `pType`, `pPrice`, `bTotalPrice`, `uEmail`, `bDateBuy`,`codeProduce`) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, b.getpName());
            ps.setInt(2, b.getbQuantity());
            ps.setString(3, b.getpType());
            ps.setInt(4, b.getpPrice());
            ps.setInt(5, b.getbTotalPrice());
            ps.setString(6, b.getuEmail());
            ps.setDate(7, (Date) b.getbDateBuy());
            ps.setString(8, b.getCodeProduce());

            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BillDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    //get table bill
    public Bill getCurrentBill() {

        try {
            String sql = "SELECT * FROM `bill`";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.last()) {
                return new Bill(rs.getInt("bId"), rs.getString("pName"), rs.getInt("bQuantity"), rs.getString("pType"), rs.getInt("pPrice"),
                        rs.getInt("bTotalPrice"), rs.getDate("bDateBuy"), rs.getString("uEmail"), rs.getString("codeProduce"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
