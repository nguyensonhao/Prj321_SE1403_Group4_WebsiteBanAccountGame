package ModelEntities;
/**
 *
 * @author Hao Nguyen
 */
public class Admin {

    private int aId;
    private String aFullName;
    private String aUserName;
    private String aPassWord;
    private String uEmail;
    private int rId;

    public Admin() {
    }

    public Admin(int aId, String aFullName, String aUserName, String aPassWord, String uEmail, int rId) {
        this.aId = aId;
        this.aFullName = aFullName;
        this.aUserName = aUserName;
        this.aPassWord = aPassWord;
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
        return aUserName;
    }

    public void setUserName(String aUserName) {
        this.aUserName = aUserName;
    }

    public String getPassWord() {
        return aPassWord;
    }

    public void setPassWord(String pasWord) {
        this.aPassWord = pasWord;
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
