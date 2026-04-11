package onlinevotingsystem.model;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;

public class VotesModel {

    public void submitVote(String voterID, Vector<String> candidateIDVector) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        String formatDate = now.format(dtf);

        String sql = "INSERT INTO Votes (VoterID, CandidateID, VoteTimeStamp) VALUES (?,?,?)";
        String sql2 = "UPDATE Voters SET HasVoted = 1 WHERE VoterID = ?";
        try {
            PreparedStatement pst = DBConnect.con.prepareStatement(sql2);
            pst.setString(1, voterID);
            pst.executeUpdate();
        } catch (Exception e) {
            System.err.println("Error updating Voter's HasVoted: " + e.getMessage());
            return;
        }
        for (String candidateID : candidateIDVector) {
            try {
                PreparedStatement pst = DBConnect.con.prepareStatement(sql);
                pst.setString(1, voterID);
                pst.setString(2, candidateID);
                pst.setString(3, formatDate);
                pst.executeUpdate();
            } catch (Exception e) {
                System.err.println("Error in adding user's vote: " + e.getMessage());
            }
        }
    }

    public boolean userHasVoted(String voterID) {
        String sql = "SELECT HasVoted FROM " + DBTables.VOTERS + " WHERE VoterID = ?";
        try {
            PreparedStatement pst = DBConnect.con.prepareStatement(sql);
            pst.setString(1, voterID);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getInt("HasVoted") == 1;
            }
        } catch (Exception e) {
            System.err.println("Error retrieving has voted checker: " + e.getMessage());
        }
        return false;
    }

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

    public Vector<Vector<String>> winnerCandidates() {
        Vector<Vector<String>> winners = new Vector<>();
        String sql = "SELECT * FROM ViewElectionWinners";
        try {
            Statement st = DBConnect.con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Vector<String> candidate = new Vector<>();
                candidate.add(rs.getString("Position"));
                candidate.add(rs.getString("LastName"));
                candidate.add(rs.getString("FirstName"));
                candidate.add(rs.getString("MiddleName"));
                candidate.add(rs.getString("Party"));
                candidate.add(rs.getString("Vote Count"));
                winners.add(candidate);
            }
        } catch (Exception e) {
            System.err.println("Error retrieving winner candidates: " + e.getMessage());
        }
        return winners;
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
