package org.brodowsky.jungs.evo;

import java.sql.*;

public class TrySqlMain {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/evo";
        String user = "evo";
        String password = "uabvc";
        String insert = "INSERT INTO tier_arten (name) VALUES (?)";
        String query = "SELECT id, name FROM tier_arten";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = con.prepareStatement(insert);
             PreparedStatement preparedQuery = con.prepareStatement(query);
             ResultSet resultSet = preparedQuery.executeQuery()) {
             preparedStatement.setString(1, "Fuchs");
             preparedStatement.executeUpdate();

             while (resultSet.next()) {
                 System.out.print(resultSet.getInt(1));
                 System.out.print(", ");
                 System.out.println(resultSet.getString(2));
             }
        } catch (SQLException ex) {
            System.err.println(ex);
            System.exit(1);
        }

    }
}
