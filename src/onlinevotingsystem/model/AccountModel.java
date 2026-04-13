package onlinevotingsystem.model;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountModel {

    public boolean saveAccount(String fName, String mName, String lName, String email, String password, String gender, String college, String birthdate) {
        String sql = "INSERT INTO " + DBTables.VOTERS + " (FirstName, MiddleName, LastName, Sex, College, DateOfBirth) VALUES (?,?,?,?,?,?)";
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
            return true;
        } catch (SQLException e) {
            System.err.println("Error registering account: " + e.getMessage());
        }
        return false;
    }

    public int totalRegisteredVoters() {
        String sql = "SELECT COUNT(*) AS registered_voters FROM " + DBTables.ACCOUNTS;
        try {
            Statement st = DBConnect.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                return rs.getInt("Registered_Voters");
            }
        } catch (Exception e) {
            System.out.println("Error retrieving number of registered voters: " + e.getMessage());
        }
        System.out.println("No");
        return 0;
    }
}
