package onlinevotingsystem.controller;

import onlinevotingsystem.model.DBConnect;
import onlinevotingsystem.model.DBTables;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ValidateCredentials {

    private final String email;
    private final String password;
    private String fname;
    private String mname;
    private String lname;
    private String accountType;

    public ValidateCredentials(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public boolean isCorrect() {
        try {
            String sql = "SELECT a.AccountID, v.VoterID, v.FirstName, v.MiddleName, v.LastName, v.Sex, v.College, v.DateOfBirth, a.Email, a.Password, a.Type "
                    + "FROM " + DBTables.VOTERS + " v "
                    + "JOIN " + DBTables.ACCOUNTS + " a ON v.VoterID = a.VoterID";

            Statement st = DBConnect.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                if (rs.getString("email").equals(email) && rs.getString("password").equals(password)) {
                    fname = rs.getString("FirstName");
                    mname = rs.getString("MiddleName");
                    lname = rs.getString("LastName");
                    accountType = rs.getString("Type");
                    return true;
                }
            }
        } catch (SQLException e) {
            System.err.println("Error validating credentials: " + e.getMessage());
        }
        return false;
    }

    public String getEmail() {
        return email;
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

    public String getAccountType() {
        return accountType;
    }

}
