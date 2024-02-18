import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class test2 {
	
	public static void main(String[] args) {
		//establishing connection with mysql server
		
		try {
			//Step1: load the driver
			Class.forName("come.mysql.cj.jdbc.Driver");
			
			//Step2: Create the connection object
			
			String connectionURL="jdbc:mysql://127.0.0.1:3306/booksdb";
			Connection conn = DriverManager.getConnection(connectionURL,"root", "Tellatale123#");
			
			//Fetching data from MySQL server
			Statement stmt = conn.createStatement();
			String selectQuery ="Select * from books";
			
			ResultSet result = stmt.executeQuery(selectQuery);
			
			while(result.next()) {
				System.out.println(result.getString(1)+" "+result.getString(2));
			}
			conn.close();
			
			} catch(Exception e) {
				
				e.printStackTrace();
		}
	}
}
