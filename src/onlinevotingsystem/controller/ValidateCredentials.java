package onlinevotingsystem.controller;

import Entity.User;
import onlinevotingsystem.model.DBConnect;
import onlinevotingsystem.model.DBTables;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ValidateCredentials {

    private final String email;
    private final String password;

    private String voterID;
    private String fname;
    private String mname;
    private String lname;
    private String sex;
    private String college;
    private String dateOfBirth;
    private String accountType;
    
    public ValidateCredentials(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User isCorrect() {
        try {
            String sql = "SELECT a.AccountID, v.VoterID, v.FirstName, v.MiddleName, v.LastName, v.Sex, v.College, v.DateOfBirth, a.Email, a.Password, a.Type "
                    + "FROM " + DBTables.VOTERS + " v "
                    + "JOIN " + DBTables.ACCOUNTS + " a ON v.VoterID = a.VoterID";

            Statement st = DBConnect.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                if (rs.getString("email").equals(email) && rs.getString("password").equals(password)) {
                    return new User(
                            rs.getString("VoterID"),
                            rs.getString("FirstName"),
                            rs.getString("MiddleName"),
                            rs.getString("LastName"),
                            rs.getString("Sex"),
                            rs.getString("College"),
                            rs.getString("DateOfBirth"),
                            rs.getString("Type")
                    );
                }
            }
        } catch (SQLException e) {
            System.err.println("Error validating credentials: " + e.getMessage());
        }
        return null;
    }


}
