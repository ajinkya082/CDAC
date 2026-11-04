package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ParameterizedQueryMain {

	public static void main(String[] args) {
		String sqlQuery="select dname,loc,deptno from dept where deptno in(?,?)";
		try(
				Connection dbConnection=JdbcUtils.obtainConnection();
				PreparedStatement pstmt=dbConnection.prepareStatement(sqlQuery);
				){
			System.out.println("Connection successful!");

			pstmt.setInt(1, 10);
			pstmt.setInt(2, 20);
			ResultSet rs=pstmt.executeQuery();
			int flag=0;
			while(rs.next()) {
				flag=1;
				String name=rs.getString(1);
				String loc=rs.getString(2);
				int deptNo=rs.getInt(3);
				System.out.println(deptNo+" - " + name+" - " +loc );
			}
			if(flag==0) {
				System.out.println("Record Not Found!");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
