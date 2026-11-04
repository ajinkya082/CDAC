package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DataInsertionMain {

	public static void main(String[] args) {
		String sqlQuery="insert into dept_copy values(?,?,?)";
		try(
				Connection dbConnection=JdbcUtils.obtainConnection();
				PreparedStatement pstmt=dbConnection.prepareStatement(sqlQuery);
				){
			System.out.println("Connection successful!");

			pstmt.setInt(1, 50);
			pstmt.setString(2, "Paras");
			pstmt.setString(3, "Mumbai");
			int updateCount=pstmt.executeUpdate();
			System.out.println(updateCount+" record inserted.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
