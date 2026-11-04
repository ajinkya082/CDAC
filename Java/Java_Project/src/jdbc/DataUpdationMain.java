package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DataUpdationMain {

	public static void main(String[] args) {
		String sqlQuery="update dept_copy set dname = ?,loc = ? where deptno = ?";
		try(
				Connection dbConnection=JdbcUtils.obtainConnection();
				PreparedStatement pstmt=dbConnection.prepareStatement(sqlQuery);
				){
			System.out.println("Connection successful!");

			pstmt.setInt(3, 50);
			pstmt.setString(1, "Paras Bank ltd");
			pstmt.setString(2, "Dubai Fata");
			int updateCount=pstmt.executeUpdate();
			System.out.println(updateCount+" record updated.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
