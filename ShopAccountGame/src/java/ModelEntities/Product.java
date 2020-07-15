package ModelEntities;

/**
 *
 * @author Hao Nguyen
 */
public class Product {
    private int pId ;
    private String pName;
    private double pPrice;
    private String pType;
    private int pQuantity;
    private String pDescription;
    private String codeProduce;
    private double pPriceSale;
    private String pImage;

    public Product() {
    }

    public Product(int pId, String pName, double pPrice, String pType, int pQuantity, String pDescription, String codeProduce, double pPriceSale, String pImage) {
        this.pId = pId;
        this.pName = pName;
        this.pPrice = pPrice;
        this.pType = pType;
        this.pQuantity = pQuantity;
        this.pDescription = pDescription;
        this.codeProduce = codeProduce;
        this.pPriceSale = pPriceSale;
        this.pImage = pImage;
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

    public int getpQuantity() {
        return pQuantity;
    }

    public void setpQuantity(int pQuantity) {
        this.pQuantity = pQuantity;
    }

    public String getpDescription() {
        return pDescription;
    }

    public void setpDescription(String pDescription) {
        this.pDescription = pDescription;
    }

    public String getCodeProduce() {
        return codeProduce;
    }

    public void setCodeProduce(String codeProduce) {
        this.codeProduce = codeProduce;
    }

    public double getpPriceSale() {
        return pPriceSale;
    }

    public void setpPriceSale(double pPriceSale) {
        this.pPriceSale = pPriceSale;
    }

    public String getpImage() {
        return pImage;
    }

    public void setpImage(String pImage) {
        this.pImage = pImage;
    }
}