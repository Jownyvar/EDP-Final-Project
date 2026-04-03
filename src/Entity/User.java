package Entity;

public class User {
    
    private final String voterID;
    private final String fname;
    private final String mname;
    private final String lname;
    private final String sex;
    private final String college;
    private final String dateOfBirth;
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
