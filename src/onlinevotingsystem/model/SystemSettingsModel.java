package onlinevotingsystem.model;

import java.sql.Statement;
import java.sql.ResultSet;

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

    public boolean resultRelease() {
        String sql = "SELECT SettingName, SettingValue FROM VotingSystemSettings";
        try {
            Statement st = DBConnect.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("SettingValue") == 1;
            }

        } catch (Exception e) {
            System.err.println("Error retrieving voting system settings: " + e.getMessage());
        }
        return false;
    }
}
