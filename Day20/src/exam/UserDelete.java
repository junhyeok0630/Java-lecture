package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDelete {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null; // sql 문을 데이터베이스에 보냄
		
		String url = "jdbc:mysql://localhost:3306/test";
		String id = "hr";
		String pwd = "hr";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pwd);
			String sql = " delete from tbl_usr where user_num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 2);
			int r = pstmt.executeUpdate();
			System.out.println("변경된 row : " + r);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}
}
