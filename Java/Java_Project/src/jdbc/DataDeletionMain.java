package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DataDeletionMain {

	public static void main(String[] args) {
		String sqlQuery="delete from dept_copy  where deptno = ?";
		try(
				Connection dbConnection=JdbcUtils.obtainConnection();
				PreparedStatement pstmt=dbConnection.prepareStatement(sqlQuery);
				){
			System.out.println("Connection successful!");

			pstmt.setInt(1, 50);
			
			int updateCount=pstmt.executeUpdate();
			System.out.println(updateCount+" record deleted.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
