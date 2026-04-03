package Entity;

public class User {
    
    private final String voterID;
    private String fname;
    private String mname;
    private String lname;
    private String sex;
    private String college;
    private String dateOfBirth;
    private final String accountType;

    public User(String voterID, String fname, String mname, String lname, String sex, String college, String dateOfBirth, String accountType) {
        this.voterID = voterID;
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.sex = sex;
        this.college = college;
        this.dateOfBirth = dateOfBirth;
        this.accountType = accountType;
    }

    public void setFName(String fname) {
        this.fname = fname;
    }

    public void setMName(String mname) {
        this.mname = mname;
    }

    public void setLName(String lname) {
        this.lname = lname;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getVoterID() {
        return voterID;
    }

    public String getFname() {
        return fname;
    }

    public String getMname() {
        return mname;
    }

    public String getLname() {
        return lname;
    }

    public String getSex() {
        return sex;
    }

    public String getCollege() {
        return college;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAccountType() {
        return accountType;
    }


    
    
}
