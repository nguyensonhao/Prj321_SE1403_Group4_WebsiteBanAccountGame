package Model;

import java.sql.Date;

/**
 *
 * @author Hao Nguyen
 */
public class User {
    private int uId ;
    private String uFullName;
    private String userName;
    private String pasWord;
    private int uAge;
    private String uPhone;
    private String uEmail;
    private String uAdrress;
    private Date uBirthday;
    private int roles ;
    

    public User() {
    }

    public User(int uId, String uFullName, String userName, String pasWord, int uAge, String uPhone, String uEmail, String uAdrress, Date uBirthday, int roles) {
        this.uId = uId;
        this.uFullName = uFullName;
        this.userName = userName;
        this.pasWord = pasWord;
        this.uAge = uAge;
        this.uPhone = uPhone;
        this.uEmail = uEmail;
        this.uAdrress = uAdrress;
        this.uBirthday = uBirthday;
        this.roles = roles;
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

    public int getuAge() {
        return uAge;
    }

    public void setuAge(int uAge) {
        this.uAge = uAge;
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getuAdrress() {
        return uAdrress;
    }

    public void setuAdrress(String uAdrress) {
        this.uAdrress = uAdrress;
    }

    public Date getuBirthday() {
        return uBirthday;
    }

    public void setuBirthday(Date uBirthday) {
        this.uBirthday = uBirthday;
    }

    public int getRoles() {
        return roles;
    }

    public void setRoles(int roles) {
        this.roles = roles;
    }


   
    
}
