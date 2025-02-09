package Ch21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C01JDBC {
	public static void main(String[] args) {
		// 연결관련 정보 저장용 변수
		String id = "root";		// DB연결 ID
		String pwd = "1234";	// DB연결 PWD
		String url = "jdbc:mysql://localhost:3306/testdb";			// 연결 URL
		
		
		// DB연결객체 관련된 참조변수
		Connection conn = null;			// DB연결용 참조변수
		PreparedStatement pstmt = null;	// SQL쿼리 전송객체용 참조변수
		ResultSet rs = null;			// 쿼리결과 (Select결과) 수신용 참조변수
		
		// 연결하기
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			// DB 드라이버 로드
			System.out.println("[SYSTEM] : Driver loading Success !!!");
			conn = DriverManager.getConnection(url, id, pwd);		// DB Connection 객체 받기
			System.out.println("[SYSTEM] : - - - - - - - - - - - DB Connected - - - - - - - - - - - - ");
		} catch (Exception e) {
			e.printStackTrace();;
		} finally {
			try {conn.close();}catch(Exception e) {e.printStackTrace();}
		}
	}

}
