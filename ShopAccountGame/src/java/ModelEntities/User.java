package ModelEntities;

import java.sql.Date;

/**
 *
 * @author Hao Nguyen
 */
public class User {
    private int uId ;
    private String uFullName;
    private String uUserName;
    private String uPassWord;
    private int uAge;
    private int uPhone;
    private String uEmail;
    private String uAdress;
    private Date uBirthday;

    public User() {
    }

    public User(int uId, String uFullName, String uUserName, String uPassWord, int uAge, int uPhone, String uEmail, String uAdress, Date uBirthday) {
        this.uId = uId;
        this.uFullName = uFullName;
        this.uUserName = uUserName;
        this.uPassWord = uPassWord;
        this.uAge = uAge;
        this.uPhone = uPhone;
        this.uEmail = uEmail;
        this.uAdress = uAdress;
        this.uBirthday = uBirthday;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuFullName() {
        return uFullName;
    }

    public void setuFullName(String uFullName) {
        this.uFullName = uFullName;
    }

    public String getUserName() {
        return uUserName;
    }

    public void setUserName(String uUserName) {
        this.uUserName = uUserName;
    }

    public String getPasWord() {
        return uPassWord;
    }

    public void setPasWord(String uPassWord) {
        this.uPassWord = uPassWord;
    }

    public int getuAge() {
        return uAge;
    }

    public void setuAge(int uAge) {
        this.uAge = uAge;
    }

    public int getuPhone() {
        return uPhone;
    }

    public void setuPhone(int uPhone) {
        this.uPhone = uPhone;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getuAdress() {
        return uAdress;
    }

    public void setuAdress(String uAdress) {
        this.uAdress = uAdress;
    }

    public Date getuBirthday() {
        return uBirthday;
    }

    public void setuBirthday(Date uBirthday) {
        this.uBirthday = uBirthday;
    }
    
    
}
