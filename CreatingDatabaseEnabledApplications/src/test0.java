import java.sql.Connection;
import java.sql.DriverManager;

public class test0 {
	
	public static void main(String[] args) {
		//establishing connection with mysql server
		
		try {
			//Step1: load the driver
			Class.forName("come.mysql.cj.jdbc.Driver");
			
			//Step2: Create the connection object
			
			String connectionURL="jdbc:mysql://127.0.0.1:3306/booksdb";
			Connection conn = DriverManager.getConnection(connectionURL,"root", "Tellatale123#");
			
			System.out.println("Connected to server Successfully! ");
			
			conn.close();
			
			} catch(Exception e) {
				
				e.printStackTrace();
		}
	}
}
