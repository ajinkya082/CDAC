package example.beans;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtils {
	public static Connection obtainConnection() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String URL="jdbc:mysql://localhost:3306/cdac";
		String userName="root";
		String password="root";
		
		return DriverManager.getConnection(URL, userName, password);
		
		
	}
}
