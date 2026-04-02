package onlinevotingsystem.model;

import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Vector;

public class VotersModel {

    public Vector<Vector<String>> votersData() {
        Vector<Vector<String>> voters = new Vector<Vector<String>>();

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
}
