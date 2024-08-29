package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/test";
		String id = "hr";
		String pwd = "hr";
		// 자바와 DB를 연결하기 위해 Connection 객체를 사용함
		Connection conn = null;
		
		try {
			// db와 연결하는 드라이버를 찾아서 로드
			Class.forName("com.mysql.jdbc.Driver");
			// db에 접속할 수 있는 커넥션 객체를 가져온다 !!
			conn = DriverManager.getConnection(url, id, pwd);
			System.out.println("연결성공...");
		} catch (SQLException e) {
			System.out.println("연결실패...");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}
}
