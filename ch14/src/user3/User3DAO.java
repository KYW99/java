package user3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class User3DAO {
	
	private static User3DAO instance = new User3DAO();
	public static User3DAO getInstance(){
		return instance;
	}
	private User3DAO() {}
	
	private final static String HOST = "jdbc:mysql://localhost:3306/studydb";
	private final static String USER = "root";
	private final static String PASS = "1234";
	
	public void insertUser(User3VO vo) {
		
		String sql = "INSERT INTO `user3` values (?,?,?,?,?)";
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getUid());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getBirth());
			psmt.setString(4, vo.getHp());
			psmt.setString(5, vo.getAddr());
			
			psmt.executeUpdate();
			
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
