import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;



public class DBconnect {
	
	public static void main (String[] args) throws Exception {
		//Accessing driver from the JAR file
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/psi", "root", "root");
		
		PreparedStatement statement = con.prepareStatement("SELECT * FROM psi.carwash");// creating the query
		
		ResultSet result = statement.executeQuery();// variable to execute query
		
		while (result.next()) {
			System.out.println(result.getString(1) + " " + result.getString(2) + " " + result.getString(3)  + " " + result.getString(4));
			
			//getString returns data, 1, 2, 3, 4 are the fields in the table
		}
		
		
		
	}
	
	

}
