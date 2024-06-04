package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class preparedStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String hostname = "localhost";
        int port = 3306;
        String username = "root";
        String password = "root";
        String databaseName = "classicmodels"; // Change this to your database name
        
        // JDBC URL for MySQL database
        String jdbcUrl = "jdbc:mysql://" + hostname + ":" + port + "/" + databaseName ;

        // SQL query to execute
        String query = "SELECT * FROM orderdetails WHERE orderNumber = ? AND quantityOrdered > ?"; // Corrected query string

        // Establishing the database connection
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connected to the database!");
            
            // Perform database operations here
            
            PreparedStatement statement = connection.prepareStatement(query);
           
            
         // Set the parameter value
            int oNum = 10100 ; // Example OrderNumber
            int quantity = 25;
            statement.setInt(1, oNum);
            statement.setInt(2, quantity);
            
            ResultSet resultSet = statement.executeQuery();
            
         // Displaying the results
            while (resultSet.next()) {
                // Assuming the table has two columns named "column1" and "column2"
                int column1Value = resultSet.getInt("orderNumber");
                int column2Value = resultSet.getInt("quantityOrdered");
                System.out.println("Column1: " + column1Value + ", Column2: " + column2Value);
            }
              
            // Close the connection
            connection.close();
            System.out.println("Connection closed.");
        } catch (SQLException e) {
            System.out.println("Connection to the database failed: " + e.getMessage());
        }
	}

}
