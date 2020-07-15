package ModelDao;

import ModelEntities.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hao Nguyen
 */
public class ProductDao {

    private Connection connection;

    public ProductDao() {
        DBConection dBConection = new DBConection();
        connection = dBConection.getConnection();
    }

    public boolean insert(Product p) {

        try {
            String sql = "INSERT INTO `product`(`pId`, `pName`, `pPrice`, `pType`, `pQuantity`, `pDescription`, `codeProduce`, `PpriceSale`, `pImage`) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt   (1, p.getpId());
            ps.setString(2, p.getpName());
            ps.setDouble(3, p.getpPrice());
            ps.setString(4, p.getpType());
            ps.setInt   (5, p.getpQuantity());
            ps.setString(6, p.getpDescription());
            ps.setString(7, p.getCodeProduce());
            ps.setDouble(8, p.getpPriceSale());
            ps.setString(9, p.getpImage());

            return ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }
    
    public ResultSet getProducts(){
        try {
            String sql = "SELECT * FROM `product`";
            PreparedStatement ps = connection.prepareStatement(sql);
            
            return ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Product getProduct(int pId){
       
        try {
            String sql = "SELECT `pName`, `pPrice`, `pType`, `pQuantity`, `pDescription`, `codeProduce`, `PpriceSale`, `pImage` FROM `product` WHERE  `pId`";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, pId);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                 return new Product(pId, rs.getString("pName"),
                        rs.getDouble("pPrice"), rs.getString("pType"), rs.getInt("pQuantity"), rs.getString("pDescription"),rs.getString("codeProduce"),rs.getDouble("PpriceSale"),rs.getString("pImage"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
//    public boolean update(int id, int quantity ){
//        String sql = "UPDATE `product` SET `pId`=[value-1],`pName`=[value-2],`pPrice`=[value-3],`pType`=[value-4],`pQuantity`=[value-5],`pDescription`=[value-6],`codeProduce`=[value-7],`PpriceSale`=[value-8],`pImage`=[value-9] WHERE 1";
//    }
}
