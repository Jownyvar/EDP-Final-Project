package onlinevotingsystem.model;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
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

    public Vector<Vector<String>> candidatesWithVotes() {
        Vector<Vector<String>> candidates = new Vector<>();
        String sql = "EXEC GetCandidatesWithVotes";
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
                candidates.add(row);
            }
        } catch (Exception e) {
            System.err.println("Error retrieving winning candidates: " + e.getMessage());
        }
        return candidates;
    }

    public Vector<Vector<String>> votesLog() {
        Vector<Vector<String>> log = new Vector<>();
        String sql = "EXEC GetVoterLog";
        try {
            Statement st = DBConnect.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Vector<String> row = new Vector<>();
                row.add(rs.getString("VoteID"));
                row.add(rs.getString("VoterID"));
                row.add(rs.getString("PositionName"));
                row.add(rs.getString("FirstName"));
                row.add(rs.getString("MiddleName"));
                row.add(rs.getString("LastName"));
                row.add(rs.getString("VoteTimeStamp"));
                log.add(row);
            }
        } catch (Exception e) {
            System.err.println("Error retrieving votes log: " + e.getMessage());
        }
        return log;
    }

    public Vector<Vector<String>> filteredCandidatesWithVotes(String position) {
        Vector<Vector<String>> candidates = new Vector<>();
        String sql = "EXEC GetCandidatesWithVotesByPosition ?";
        try {
            PreparedStatement pst = DBConnect.con.prepareStatement(sql);
            pst.setString(1, position);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Vector<String> row = new Vector<>();
                row.add(rs.getString("PositionName"));
                row.add(rs.getString("LastName"));
                row.add(rs.getString("FirstName"));
                row.add(rs.getString("MiddleName"));
                row.add(rs.getString("TotalVotes"));
                candidates.add(row);
            }
        } catch (Exception e) {
            System.err.println("Error retrieving candidates with filtered position: " + e.getMessage());
        }
        return candidates;
    }

}
