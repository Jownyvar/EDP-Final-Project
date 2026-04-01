package onlinevotingsystem.controller;

import onlinevotingsystem.model.DBConnect;
import onlinevotingsystem.model.DBTables;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class validateCredentials {

    private final String email;
    private final String password;

    public validateCredentials(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public boolean isCorrect() {
        try {
            String sql = "SELECT email, password FROM " + DBTables.ACCOUNTS;

            Statement st = DBConnect.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                if (rs.getString("email").equals(email) && rs.getString("password").equals(password)) {
                    return true;
                }
            }
        } catch (SQLException e) {
            System.err.println("Error validating credentials: " + e.getMessage());
        }
        return false;
    }
}
