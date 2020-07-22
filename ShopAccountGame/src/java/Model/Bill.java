package Model;

import java.util.Date;


/**
 *
 * @author Hao Nguyen
 */
public class Bill {

    private int bId;
    private int uId;
    private String pName;
    private int bQuantity;
    private String pLImage;
    private String pDescription;
    private int pId;
    private double pPrice;
    private double bTotalPrice;
    private Date bDateBuy;
    private String uEmail;
    private String Note;

    public Bill(){
        
    }

    public Bill(int bId, int uId, String pName, int bQuantity, String pLImage, String Description, int pId, double pPrice, double bTotalPrice, Date bDateBuy, String uEmail, String Note) {
        this.bId = bId;
        this.uId = uId;
        this.pName = pName;
        this.bQuantity = bQuantity;
        this.pLImage = pLImage;
        this.pDescription = Description;
        this.pId = pId;
        this.pPrice = pPrice;
        this.bTotalPrice = bTotalPrice;
        this.bDateBuy = bDateBuy;
        this.uEmail = uEmail;
        this.Note = Note;
    }
    
    public Bill(String pName, int bQuantity, String pLImage, String Description, double pPrice, Date bDateBuy) {
        this.pName = pName;
        this.bQuantity = bQuantity;
        this.pLImage = pLImage;
        this.pDescription = Description;
        this.pPrice = pPrice;
        this.bDateBuy = bDateBuy;
    }


    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getbQuantity() {
        return bQuantity;
    }

    public void setbQuantity(int bQuantity) {
        this.bQuantity = bQuantity;
    }

    public String getpLImage() {
        return pLImage;
    }

    public void setpLImage(String pLImage) {
        this.pLImage = pLImage;
    }

    public String getpDescription() {
        return pDescription;
    }

    public void setpDescription(String Description) {
        this.pDescription = Description;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public double getpPrice() {
        return pPrice;
    }

    public void setpPrice(double pPrice) {
        this.pPrice = pPrice;
    }

    public double getbTotalPrice() {
        return bTotalPrice;
    }

    public void setbTotalPrice(double bTotalPrice) {
        this.bTotalPrice = bTotalPrice;
    }

    public Date getbDateBuy() {
        return bDateBuy;
    }

    public void setbDateBuy(Date bDateBuy) {
        this.bDateBuy = bDateBuy;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String Note) {
        this.Note = Note;
    }

    

    
}
