package feature1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
public class connectToDB {
	  public int multiply(int x, int y) {
	    return x * y;
	  }
	

  	  	  
	  public Statement connect(String hostConnect,String User,String Password) {
		  Connection con = null;
		  Statement stmt = null;
		    try{
		        //connect to database
		        con = DriverManager.getConnection(hostConnect, User, Password); 
		        //loading data
		        stmt = con.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE );
		        
		       
		         }
		catch ( SQLException err ) 
		    {
			
			System.out.println("Connection Failed! Check output console");
			err.printStackTrace();
		    
		    }
		    		      
		    if (con!= null) {
				System.out.println("Connected to database");
			} else {
				System.out.println("Failed to make connection!");
			}
		    		    		    		    
		return stmt;
		}
	  
	  
	  public String getEmail(String carnumber) {		
		  Statement stmt;
		  //MyClass test= new MyClass();
		  stmt=connect("jdbc:postgresql://127.0.0.1:5432/cars", "postgres", "admin");		  
		  ResultSet rs = null;  		  
		  String SQL = "SELECT email FROM owners WHERE car_number='"+carnumber+"'";
	        try {
				rs = stmt.executeQuery(SQL);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				return "email not found";
			}
	        
	        
	        
	        
	        try {rs.next();} 
	        catch (SQLException e) {return "no record next";}	        
	        String email;
	       
	       
	       
	        try {
				email = rs.getString("email");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				return "No record found";
			}


		  
		  
		  return email;
	  
	
	  }
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  public static void main(String[] argv) throws SQLException {		  
		 // Statement stmt;
		  connectToDB test= new connectToDB();
		 //stmt=test.connect("jdbc:postgresql://127.0.0.1:5432/cars", "postgres", "admin");
		  
String email=test.getEmail("CRAB36");
	        
	       //System.out.println(email);
	        
	        
		  
		  //connectToDB ();
} 
}