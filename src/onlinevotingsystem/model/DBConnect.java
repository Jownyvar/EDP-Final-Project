package onlinevotingsystem.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

    String databaseName = "OnlineVotingSystem";
    String user = "voting_database";
    String password = "admin123";
    public static Connection con;

    public DBConnect() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=" + databaseName + ";encrypt=true;trustServerCertificate=true";
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Successfully connected.");
        } catch (Exception e) {
            System.err.println("Error connection: " + e.getMessage());
        }
    }
}
