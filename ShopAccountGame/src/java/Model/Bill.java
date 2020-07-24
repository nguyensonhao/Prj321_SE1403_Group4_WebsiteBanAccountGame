package Model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Hao Nguyen
 */
public class Bill implements Serializable {

    private int bId;
    private String pName;
    private int bQuantity;
    private String pType;
    private int pPrice;
    private int bTotalPrice;
    private Date bDateBuy;
    private String uEmail;
    private String codeProduce;

    public Bill() {

    }

    public Bill(int bId, String pName, int bQuantity, String pType, int pPrice, int bTotalPrice, Date bDateBuy, String uEmail, String codeProduce) {
        this.bId = bId;
        this.pName = pName;
        this.bQuantity = bQuantity;
        this.pType = pType;
        this.pPrice = pPrice;
        this.bTotalPrice = bTotalPrice;
        this.bDateBuy = bDateBuy;
        this.uEmail = uEmail;
        this.codeProduce = codeProduce;
    }

    public String getCodeProduce() {
        return codeProduce;
    }

    public void setCodeProduce(String codeProduce) {
        this.codeProduce = codeProduce;
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
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

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    public int getpPrice() {
        return pPrice;
    }

    public void setpPrice(int pPrice) {
        this.pPrice = pPrice;
    }

    public int getbTotalPrice() {
        return bTotalPrice;
    }

    public void setbTotalPrice(int bTotalPrice) {
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
}
