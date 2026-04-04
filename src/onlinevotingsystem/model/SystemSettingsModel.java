package onlinevotingsystem.model;

import java.sql.Statement;

public class SystemSettingsModel {

    public void releaseResult() {
        String sql = "UPDATE VotingSystemSettings SET SettingValue = 1 WHERE SettingID = 1";
        try {
            Statement st = DBConnect.con.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.err.println("Error releasing result: " + e.getMessage());
        }
    }
}
