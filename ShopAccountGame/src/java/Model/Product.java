package Model;

/**
 *
 * @author Hao Nguyen
 */
public class Product {
    private int pId ;
    private  String pName;
    private double pPrice;
    private String pType;
    private int pAmount;
    private String Description;
    private String pUserName;
    private String pPassWord ;

    public Product() {
    }

    public Product(int pId, String pName, double pPrice, String pType, int pAmount, String Description, String pUserName, String pPassWord) {
        this.pId = pId;
        this.pName = pName;
        this.pPrice = pPrice;
        this.pType = pType;
        this.pAmount = pAmount;
        this.Description = Description;
        this.pUserName = pUserName;
        this.pPassWord = pPassWord;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public double getpPrice() {
        return pPrice;
    }

    public void setpPrice(double pPrice) {
        this.pPrice = pPrice;
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    public int getpAmount() {
        return pAmount;
    }

    public void setpAmount(int pAmount) {
        this.pAmount = pAmount;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getpUserName() {
        return pUserName;
    }

    public void setpUserName(String pUserName) {
        this.pUserName = pUserName;
    }

    public String getpPassWord() {
        return pPassWord;
    }

    public void setpPassWord(String pPassWord) {
        this.pPassWord = pPassWord;
    }
    
   
    
}
