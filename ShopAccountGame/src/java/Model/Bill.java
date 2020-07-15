package Model;

import java.sql.Date;

/**
 *
 * @author Hao Nguyen
 */
public class Bill {

    private int bId;
    private String uFullname;
    private int pId;
    private String aFullname;
    private double pPrice;
    private double bTotalPrice;
    private Date bDateBy;
    private String uEmail;
    private String Note;

    public Bill(int bId, String uFullname, int pId, String aFullname, double pPrice, double bTotalPrice, Date bDateBy, String uEmail, String Note) {
        this.bId = bId;
        this.uFullname = uFullname;
        this.pId = pId;
        this.aFullname = aFullname;
        this.pPrice = pPrice;
        this.bTotalPrice = bTotalPrice;
        this.bDateBy = bDateBy;
        this.uEmail = uEmail;
        this.Note = Note;
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

    public String getaFullname() {
        return aFullname;
    }

    public void setaFullname(String aFullname) {
        this.aFullname = aFullname;
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

    public Date getbDateBy() {
        return bDateBy;
    }

    public void setbDateBy(Date bDateBy) {
        this.bDateBy = bDateBy;
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
