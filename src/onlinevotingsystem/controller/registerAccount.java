package onlinevotingsystem.controller;

import onlinevotingsystem.model.DBConnect;
import onlinevotingsystem.model.DBTables;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class registerAccount {

    private final String fName;
    private final String mName;
    private final String lName;
    private final String email;
    private final String password;
    private final String gender;
    private final String college;
    private final String birthdate;

    public registerAccount(String fName, String mName, String lName, String email, String password, String gender, String college, String birthdate) {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.college = college;
        this.birthdate = birthdate;
    }

    public void saveAccount() {
        String sql = "INSERT INTO " + DBTables.VOTERS + " VALUES (?,?,?,?,?,?)";
        String sql2 = "INSERT INTO " + DBTables.ACCOUNTS + " (VoterID, Email, Password) VALUES (?,?,?)";
        try {
            PreparedStatement pst = DBConnect.con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setString(1, fName);
            pst.setString(2, mName);
            pst.setString(3, lName);
            pst.setString(4, gender);
            pst.setString(5, college);
            pst.setString(6, birthdate);

            pst.executeUpdate();

            ResultSet rs = pst.getGeneratedKeys();
            long voterID = -1;

            if (rs.next()) {
                voterID = rs.getLong(1);
            }

            PreparedStatement pst2 = DBConnect.con.prepareStatement(sql2);
            pst2.setString(1, voterID + "");
            pst2.setString(2, email);
            pst2.setString(3, password);
            pst2.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error registering account: " + e.getMessage());
        }
    }

}
