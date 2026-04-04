package onlinevotingsystem.model;

import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Vector;

public class VotesModel {

    public int getTotalVotes() {
        String sql = "SELECT COUNT(DISTINCT VoterID) AS total_votes FROM " + DBTables.VOTES;
        try {
            Statement st = DBConnect.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("total_votes");
            }
        } catch (Exception e) {
            System.err.println("Error retrieving complete percentage: " + e.getMessage());
        }
        return 0;
    }

    public Vector<Vector<String>> winningCandidates() {
        Vector<Vector<String>> winners = new Vector<>();
        String sql = "EXEC GetWinningCandidates";
        try {
            Statement st = DBConnect.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Vector<String> row = new Vector<>();
                row.add(rs.getString("PositionName"));
                row.add(rs.getString("LastName"));
                row.add(rs.getString("FirstName"));
                row.add(rs.getString("MiddleName"));
                row.add(rs.getString("TotalVotes"));
                winners.add(row);
            }
        } catch (Exception e) {
            System.err.println("Error retrieving winning candidates: " + e.getMessage());
        }
        return winners;
    }

}
