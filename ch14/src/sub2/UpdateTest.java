package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 	날짜 : 2024/07/29
 *  이름 : 원기연
 *  내용 : Update 실습하기
 */
public class UpdateTest {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://127.0.0.1:3306/studydb"; // <-- 마지막 접속 데이터베이스명
		String user = "root";
		String pass = "1234";
		
		try {
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			Statement stmt = conn.createStatement();
			
			String sql = "Update `user1` set ";
			   sql += "`hp` = '010-1234-1111',";
			   sql += "`age`= '25'";
			   sql += "where `uid`= 'j101'";
			   stmt.executeUpdate(sql);
			   
			   stmt.close();
			   conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Update 완료...");
			   
		
	}
}
