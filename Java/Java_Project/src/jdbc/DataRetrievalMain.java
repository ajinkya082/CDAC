package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataRetrievalMain {

	public static void main(String[] args) {
		//Load the Driver
		String driverClassName="com.mysql.cj.jdbc.Driver";//java.lang.String
		Connection dbConnection=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName(driverClassName);
			System.out.println("Driver loaded.");
			
			//Establish connection
			String URL="jdbc:mysql://localhost:3306/cdac";
			String userName="root";
			String password="root";
			dbConnection=DriverManager.getConnection(URL, userName, password);
			System.out.println("Connection establish!");
			
			//Obtain statement
			stmt=dbConnection.createStatement();
			
			//Execute SQL Query
			String sqlQuery="select dname,loc,deptno from dept";
			rs=stmt.executeQuery(sqlQuery);
			while(rs.next()) {
				String name=rs.getString(1);
				String loc=rs.getString(2);
				int deptNo=rs.getInt(3);
				System.out.println(deptNo+" - " + name+" - " +loc );
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
				stmt.close();
				dbConnection.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		

	}

}
