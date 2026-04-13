package onlinevotingsystem.model;

import java.util.Vector;
import java.sql.Statement;
import java.sql.ResultSet;

public class PositionsModel {

    public Vector<String> availablePositions() {
        Vector<String> positions = new Vector<>();
        String sql = "SELECT * FROM Positions";
        try {
            Statement st = DBConnect.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                positions.add(rs.getString("PositionName"));
            }
        } catch (Exception e) {
            System.err.println("Error retrieving positions: " + e.getMessage());
        }
        return positions;
    }

    public Vector<Vector<String>> maxVotesPerPosition() {
        Vector<Vector<String>> maxVotes = new Vector<>();
        String sql = "SELECT * FROM Positions";
        try {
            Statement st = DBConnect.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Vector<String> row = new Vector<>();
                row.add(rs.getString("PositionName"));
                row.add(rs.getString("MaxVotesPerVoter"));
                maxVotes.add(row);
            }
        } catch (Exception e) {
            System.err.println("Error retrieving max votes per position: " + e.getMessage());
        }
        return maxVotes;
    }
}
