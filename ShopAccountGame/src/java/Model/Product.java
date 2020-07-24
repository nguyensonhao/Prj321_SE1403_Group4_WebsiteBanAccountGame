package Model;

/**
 *
 * @author Hao Nguyen
 */


public class Product  {

    private int pId;
    private String pName;
    private int pPrice;
    private String pType;
    private String Description;
    private String codeProduce;
    private String pLImage;
    private int PpriceSale;
    private int quantity;
    private int desId;

    public Product() {
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

    public int getpPrice() {
        return pPrice;
    }

    public void setpPrice(int pPrice) {
        this.pPrice = pPrice;
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getCodeProduce() {
        return codeProduce;
    }

    public void setCodeProduce(String codeProduce) {
        this.codeProduce = codeProduce;
    }

    public String getpLImage() {
        return pLImage;
    }

    public void setpLImage(String pLImage) {
        this.pLImage = pLImage;
    }

    public int getPpriceSale() {
        return PpriceSale;
    }

    public void setPpriceSale(int PpriceSale) {
        this.PpriceSale = PpriceSale;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getDesId() {
        return desId;
    }

    public void setDesId(int desId) {
        this.desId = desId;
    }

    @Override
    public String toString() {
        return "Product{" + "pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + ", pType=" + pType + ", Description=" + Description + ", codeProduce=" + codeProduce + ", pLImage=" + pLImage + ", PpriceSale=" + PpriceSale + ", quantity=" + quantity + ", desId=" + desId + '}';
    }
}
