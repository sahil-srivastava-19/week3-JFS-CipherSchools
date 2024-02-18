import java.sql.*;

public class test0 {
	public static void main(String[] args) throws Exception{
		//Connecting to server
		
		String connectionURL = "jdbc:mysql://127.0.0.1:3306/mart";
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection(connectionURL);
		
		System.out.println("Connected to Server!! ");
		conn.close();
	}
}
