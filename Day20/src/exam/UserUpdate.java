package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserUpdate {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null; // sql 문을 데이터베이스에 보냄
		
		String url = "jdbc:mysql://localhost:3306/test";
		String id = "hr";
		String pwd = "hr";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pwd);
			
			String sql = " update tbl_usr set user_id=?, user_pwe=? where user_num=?";
			// PreparedStatement 객체 생성시 sql문을 저장
			pstmt = conn.prepareStatement(sql);
			// pstmt.해당 컬럼 데이터타입(? 순서대로 들어감)
			pstmt.setString(1, "최준혁"); // 아이디
			pstmt.setString(2, "abcde"); // 비밀번호
			pstmt.setInt(3, 1);
			
			// sql을 실행하고 결과를 리턴 (변경된 row수) 성공 : 1 실패 : 0
			int row = pstmt.executeUpdate();
			System.out.println("변경된 row : " + row);
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
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
