package Model;

import java.sql.Date;

/**
 *
 * @author Hao Nguyen
 */
public class Admin {

    private int aId;
    private String aFullName;
    private String userName;
    private String pasWord;
    private String uEmail;
    private int rId;

    public Admin() {
    }

    public Admin(int aId, String aFullName, String userName, String pasWord, String uEmail, int rId) {
        this.aId = aId;
        this.aFullName = aFullName;
        this.userName = userName;
        this.pasWord = pasWord;
        this.uEmail = uEmail;
        this.rId = rId;
    }

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getaFullName() {
        return aFullName;
    }

    public void setaFullName(String aFullName) {
        this.aFullName = aFullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasWord() {
        return pasWord;
    }

    public void setPasWord(String pasWord) {
        this.pasWord = pasWord;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

}
