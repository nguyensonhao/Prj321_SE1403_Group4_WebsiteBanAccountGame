package ModelEntities;

import java.sql.Date;

/**
 *
 * @author Hao Nguyen
 */
public class Bill {

    private int bId;
    private String uFullname;
    private int pId;
    private double pPrice;
    private double bTotalPrice;
    private Date bDateBuy;
    private String uEmail;
    private String bNote;

    public Bill(int bId, String uFullname, int pId, String aFullname, double pPrice, double bTotalPrice, Date bDateBuy, String uEmail, String bNote) {
        this.bId = bId;
        this.uFullname = uFullname;
        this.pId = pId;
        this.pPrice = pPrice;
        this.bTotalPrice = bTotalPrice;
        this.bDateBuy = bDateBuy;
        this.uEmail = uEmail;
        this.bNote = bNote;
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public String getuFullname() {
        return uFullname;
    }

    public void setuFullname(String uFullname) {
        this.uFullname = uFullname;
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

    public String getbNote() {
        return bNote;
    }

    public void setbNote(String bNote) {
        this.bNote = bNote;
    }

}
