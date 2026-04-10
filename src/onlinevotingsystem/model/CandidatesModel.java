package onlinevotingsystem.model;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Vector;

public class CandidatesModel {

    public Vector<Vector<String>> candidatesData() {
        Vector<Vector<String>> candidates = new Vector<>();
        String sql = "EXEC GetCandidatesData";
        try {
            Statement st = DBConnect.con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Vector<String> row = new Vector<>();
                row.add(rs.getString("CandidateID"));
                row.add(rs.getString("PositionName"));
                row.add(rs.getString("LastName"));
                row.add(rs.getString("FirstName"));
                row.add(rs.getString("MiddleName"));
                row.add(rs.getString("Party"));
                if (rs.getString("IsActive").equals("1")) {
                    row.add("Running");
                } else {
                    row.add("Removed");
                }
                candidates.add(row);
            }
        } catch (Exception e) {
            System.err.println("Error retrieving candidates data: " + e.getMessage());
        }
        return candidates;
    }

    public boolean addCandidate(String fName, String mName, String lName, String party, int position) {
        String sql = "INSERT INTO " + DBTables.CANDIDATES + " (FirstName, MiddleName, LastName, Party, PositionID) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement pst = DBConnect.con.prepareStatement(sql);
            pst.setString(1, fName);
            pst.setString(2, mName);
            pst.setString(3, lName);
            pst.setString(4, party);
            pst.setInt(5, position);
            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.println("Error adding candidate: " + e.getMessage());
        }
        return false;
    }

    public boolean removeCandidate(int candidateID) {
        String sql = "UPDATE " + DBTables.CANDIDATES + " SET IsActive = 0 WHERE candidateID = " + candidateID;

        try {
            Statement st = DBConnect.con.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            System.err.println("Error removing candidate: " + e.getMessage());
        }
        return false;
    }

    public boolean reinstateCandidate(int candidateID) {
        String sql = "UPDATE " + DBTables.CANDIDATES + " SET IsActive = 1 WHERE candidateID = " + candidateID;
        try {
            Statement st = DBConnect.con.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            System.err.println("Error reinstating candidate: " + e.getMessage());
        }
        return false;
    }

    public Vector<Vector<String>> searchCandidateName(String candidateName) {
        Vector<Vector<String>> searchedCandidates = new Vector<>();
        String sql = "EXEC GetCandidateName ?";
        try {
            PreparedStatement pst = DBConnect.con.prepareStatement(sql);
            pst.setString(1, candidateName);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Vector<String> row = new Vector<>();
                row.add(rs.getString("CandidateID"));
                row.add(rs.getString("PositionName"));
                row.add(rs.getString("LastName"));
                row.add(rs.getString("FirstName"));
                row.add(rs.getString("MiddleName"));
                row.add(rs.getString("Party"));
                if (rs.getString("IsActive").equals("1")) {
                    row.add("Running");
                } else {
                    row.add("Removed");
                }
                searchedCandidates.add(row);
            }
        } catch (Exception e) {
            System.err.println("Error searching candidate name: " + e.getMessage());
        }
        return searchedCandidates;
    }

    public boolean updateCandidate(int candidateID, String fName, String mName, String lName, String party, int position) {
        String sql = "UPDATE " + DBTables.CANDIDATES + " SET FirstName = ?, MiddleName = ?, LastName = ?, Party = ?, PositionID = ? WHERE candidateID = ?";
        try {
            PreparedStatement pst = DBConnect.con.prepareCall(sql);
            pst.setString(1, fName);
            pst.setString(2, mName);
            pst.setString(3, lName);
            pst.setString(4, party);
            pst.setInt(5, position);
            pst.setInt(6, candidateID);
            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.println("Error updating candidate: " + e.getMessage());
        }
        return false;
    }

    public int registeredTotalCandidates() {
        String sql = "SELECT COUNT(*) AS total_candidates FROM Candidates";
        try {
            Statement st = DBConnect.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("total_candidates");
            }
        } catch (Exception e) {
            System.err.println("Error retrieving total candidates");
        }
        return 0;
    }

    public Vector<String> candidateParty() {
        Vector<String> partyVector = new Vector<>();
        String sql = "SELECT DISTINCT Party FROM Candidates";
        try {
            Statement st = DBConnect.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                partyVector.add(rs.getString("Party"));
            }
        } catch (Exception e) {
            System.err.println("Error retrieving parties: " + e.getMessage());
        }
        return partyVector;
    }

    public Vector<Vector<String>> filterCandidateData(String position, String party) {
        Vector<Vector<String>> candidateVector = new Vector<>();
        String sql = "EXEC FilterCandidates ?, ?";
        try {
            PreparedStatement st = DBConnect.con.prepareStatement(sql);
            st.setString(1, position);
            st.setString(2, party);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Vector<String> row = new Vector<>();
                row.add(rs.getString("CandidateID"));
                row.add(rs.getString("PositionName"));
                row.add(rs.getString("LastName"));
                row.add(rs.getString("FirstName"));
                row.add(rs.getString("MiddleName"));
                row.add(rs.getString("Party"));
                if (rs.getString("IsActive").equals("1")) {
                    row.add("Running");
                } else {
                    row.add("Removed");
                }
                candidateVector.add(row);
            }
        } catch (Exception e) {
            System.err.println("Error retrieving filtered candidate: " + e.getMessage());
        }
        return candidateVector;
    }
}
