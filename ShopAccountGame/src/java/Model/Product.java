package Model;

/**
 *
 * @author Hao Nguyen
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Product implements Comparable<Product> {

    private int pId;
    private String pName;
    private int pPrice;
    private String pType;
    private String Description;
    private String codeProduce;
    private String pLImage;
    private int PpriceSale;

    public Product() {
    }

    public Product(int pId, String pName, int pPrice, String pType, String Description, String codeProduce, String pLImage, int PpriceSale) {
        this.pId = pId;
        this.pName = pName;
        this.pPrice = pPrice;
        this.pType = pType;
        this.Description = Description;
        this.codeProduce = codeProduce;
        this.pLImage = pLImage;
        this.PpriceSale = PpriceSale;
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

    @Override
    public String toString() {
        return "Product{" + "pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + ", pType=" + pType + ", Description=" + Description + ", codeProduce=" + codeProduce + ", pLImage=" + pLImage + ", PpriceSale=" + PpriceSale + '}';
    }

    public boolean check(ArrayList<String> cartlist, String id2) {
        for (String id : cartlist) {
            if (id.equals(id2)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> remove(ArrayList<String> cartlist, String id) {
        for (String cid : cartlist) {
            if (cid.equals(id)) {
                cartlist.remove(cid);
                break;
            }

        }

        return cartlist;
    }

    public ArrayList<Product> lowtohigh(ArrayList<Product> list) {
        Collections.sort(list);
        return list;
    }

    @Override
    public int compareTo(Product p) {
        return pPrice - p.pPrice;
    }

    public ArrayList<Product> hightolow(ArrayList<Product> list) {
        Collections.sort(list, new Temp());
        return list;

    }

}

class Temp implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o2.getpPrice() - o1.getpPrice();
    }

}
