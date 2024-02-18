import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class test1 {
	public static void main(String[] args) {
		//establishing connection with mysql server
		
		try {
			//Step1: load the driver
			Class.forName("come.mysql.cj.jdbc.Driver");
			
			//Step2: Create the connection object
			
			//String connectionURL="jdbc:mysql://127.0.0.1:3306/booksdb";
			//Connection conn = DriverManager.getConnection(connectionURL,"root", "Tellatale123#");
			
			//Step3: Prepare the insert statement
			
			int bid=102;
			String bookTitle ="Sql Essentitals";
			String author = "Jerry Rig";
			int price = 295;
			
			String insertQuery= String.format("insert into books values(%d,'%s','%s',%d)",bid,bookTitle,author,price);
			
			System.out.println(insertQuery);
			
			//String insertQuery = "insert into books values(101,'jdk by Wrox',;ivor horton',750)";
			
			//STep4: Create the Statement Interface Object
			//It is used to execute Query
			
			//Statement stmt = conn.createStatement();
		//	stmt.execute(insertQuery);
		//	stmt.close();
		//	conn.close();
			
			} catch(Exception e) {
				
				e.printStackTrace();
		}
	}
}
