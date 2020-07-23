/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;


/**
 *
 * @author Hao Nguyen
 */
public class Cart implements Serializable{

    private int cId;
    private String cName;
    private int cPrice;
    private int cQuantity;
    private String cType;
    private String cLImage;

    public Cart() {
    }

    public Cart(int cId, String cName, int cPrice,int cQuantity, String cType, String cLImage) {
        this.cId = cId;
        this.cName = cName;
        this.cPrice = cPrice;
         this.cQuantity = cQuantity;
        this.cType = cType;
        this.cLImage = cLImage;
    }

    public int getcQuantity() {
        return cQuantity;
    }

    public void setcQuantity(int cQuantity) {
        this.cQuantity = cQuantity;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getcPrice() {
        return cPrice;
    }

    public void setcPrice(int cPrice) {
        this.cPrice = cPrice;
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType;
    }

    public String getcLImage() {
        return cLImage;
    }

    public void setcLImage(String cLImage) {
        this.cLImage = cLImage;
    }    
    public boolean check(ArrayList<Cart> cartlist, int bid2) {
        for (Cart bid : cartlist) {
            if (bid.getcId() == bid2) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Cart> remove(ArrayList<Cart> cartlist, int bid2) {
        for (Cart cid : cartlist) {
            if (cid.getcId() == bid2) {
                cartlist.remove(cid);
                break;
            }
        }
        return cartlist;
    }

}
