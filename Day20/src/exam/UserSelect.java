package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserSelect {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/test";
		String id = "hr";
		String pwd = "hr";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, id, pwd);
		
		// SQL문을 호출하기 위해 객체 생성 !!
		Statement stmt = conn.createStatement();
		String sql = "select * from tbl_usr";
		
		// ResultSet : 결과값을 반환해서 저장 !!
		
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int num = rs.getInt("user_num");
			String user_id = rs.getString("user_id");
			String user_pwe = rs.getString("user_pwe");
			System.out.println(num + " " + user_id + " " + user_pwe);
		}
	}
}
