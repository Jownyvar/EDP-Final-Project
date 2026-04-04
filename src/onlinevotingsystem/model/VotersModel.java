package onlinevotingsystem.model;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Vector;

public class VotersModel {

    public Vector<Vector<String>> votersData() {
        Vector<Vector<String>> voters = new Vector<>();

        String sql = "SELECT v.VoterID, v.FirstName, v.MiddleName,v.LastName,v.Sex,v.College,v.DateOfBirth, COUNT(vo.VoterID) AS HasVoted\n"
                + "FROM " + DBTables.VOTERS + " v\n"
                + "LEFT JOIN " + DBTables.VOTES + " vo ON v.VoterID = vo.VoterID\n"
                + "GROUP BY v.VoterID, v.FirstName, v.MiddleName,v.LastName,v.Sex,v.College,v.DateOfBirth\n"
                + "ORDER BY v.VoterID";
        try {
            Statement st = DBConnect.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Vector<String> v = new Vector<>();
                v.add(rs.getString("VoterID"));
                v.add(rs.getString("FirstName"));
                v.add(rs.getString("MiddleName"));
                v.add(rs.getString("LastName"));
                v.add(rs.getString("Sex"));
                v.add(rs.getString("College"));
                v.add(rs.getString("DateOfBirth"));
                if (rs.getInt("HasVoted") > 0) {
                    v.add("Yes");
                } else {
                    v.add("No");
                }
                voters.add(v);
            }
        } catch (Exception e) {
            System.err.println("Error retrieving Voter's data: " + e.getMessage());
        }
        return voters;
    }

    public Vector<Vector<String>> searchVoterName(String voterName) {
        Vector<Vector<String>> voters = new Vector<>();

        String sql = "SELECT v.VoterID, v.FirstName, v.MiddleName,v.LastName,v.Sex,v.College,v.DateOfBirth, COUNT(vo.VoterID) AS HasVoted\n"
                + "FROM " + DBTables.VOTERS + " v\n"
                + "LEFT JOIN " + DBTables.VOTES + " vo ON v.VoterID = vo.VoterID\n"
                + "WHERE v.FirstName LIKE ? OR v.MiddleName LIKE ? OR  v.LastName LIKE ? \n"
                + "GROUP BY v.VoterID, v.FirstName, v.MiddleName,v.LastName,v.Sex,v.College,v.DateOfBirth\n"
                + "ORDER BY v.VoterID";
        try {
            PreparedStatement pst = DBConnect.con.prepareStatement(sql);
            pst.setString(1, voterName + "%");
            pst.setString(2, voterName + "%");
            pst.setString(3, voterName + "%");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Vector<String> v = new Vector<>();
                v.add(rs.getString("VoterID"));
                v.add(rs.getString("FirstName"));
                v.add(rs.getString("MiddleName"));
                v.add(rs.getString("LastName"));
                v.add(rs.getString("Sex"));
                v.add(rs.getString("College"));
                v.add(rs.getString("DateOfBirth"));
                if (rs.getInt("HasVoted") > 0) {
                    v.add("Yes");
                } else {
                    v.add("No");
                }
                voters.add(v);
            }
        } catch (Exception e) {
            System.err.println("Error searching voter's name: " + e.getMessage());
        }
        return voters;
    }

    public boolean updateInfo(String fName, String mName, String lName, String sex, String college, String dateOfBirth, long voterID) {
        String sql = "UPDATE " + DBTables.VOTERS + " SET "
                + "FirstName = ?, "
                + "MiddleName = ?, "
                + "LastName = ?, "
                + "Sex = ?, "
                + "College = ?, "
                + "DateOfBirth = ? "
                + "WHERE VoterID = ?";
        try {
            PreparedStatement pst = DBConnect.con.prepareStatement(sql);
            pst.setString(1, fName);
            pst.setString(2, mName);
            pst.setString(3, lName);
            pst.setString(4, sex);
            pst.setString(5, college);
            pst.setString(6, dateOfBirth);
            pst.setLong(7, voterID);
            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.println("Error updating info: " + e.getMessage());
        }
        return false;
    }
}
