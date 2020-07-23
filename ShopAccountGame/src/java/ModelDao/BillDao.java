package ModelDao;

import Model.Bill;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hao Nguyen
 */
public class BillDao {

    private Connection connection;

    public BillDao() {
        DBConection dBConection = new DBConection();
        connection = dBConection.getConnection();
    }

    public boolean insert(Bill b) {
        try {
            String sql = "INSERT INTO `bill`( `uId`, `pName`, `bQuantity`, `pImage`, `pDescription`, `pId`, `pPrice`, `bTotalPrice`, `bDateBuy`, `uEmail`, `bNote`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, b.getuId());
            ps.setString(2, b.getpName());
            ps.setInt(3, b.getbQuantity());
            ps.setString(4, b.getpLImage());
            ps.setString(5, b.getpDescription());
            ps.setInt(6, b.getpId());
            ps.setDouble(7, b.getpPrice());
            ps.setDouble(8, b.getbTotalPrice());
            ps.setDate(9, Date.valueOf(LocalDate.now()));
            ps.setString(10, b.getuEmail());
            ps.setString(11, b.getNote());

            return ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(BillDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    //get table bill
    public Bill getCurrentBill() {

        try {
            String sql = "SELECT * FROM `bill`";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.last()) {
                return new Bill(rs.getInt("bId"),rs.getInt("uId"),rs.getString("pName"), rs.getInt("bQuantity"),rs.getString("pImage"),rs.getString("pDescription"),rs.getInt("pId"),rs.getDouble("pPrice"),
                        rs.getDouble("bTotalPrice"),rs.getDate("bDateBuy"),rs.getString("uEmail"), rs.getString("bNote"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
