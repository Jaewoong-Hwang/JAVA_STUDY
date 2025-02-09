package Ch21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C05Select {
	public static void main(String[] args) {
		// 연결관련 정보 저장용 변수
		String id = "root";		// DB연결 ID
		String pwd = "1234";	// DB연결 PWD
		String url = "jdbc:mysql://localhost:3306/testdb";			// 연결 URL
		
		
		// DB연결객체 관련된 참조변수
		Connection conn = null;			// DB연결용 참조변수
		PreparedStatement pstmt = null;	// SQL쿼리 전송객체용 참조변수
		ResultSet rs = null;			// 쿼리결과 (Select결과) 수신용 참조변수
		
		
		// 데이터베이스 구문
		// 1. 데이터베이스 생성
//		CREATE SCHEMA testdb;
		
		// 2. 테이블 생성
//		CREATE TABLE testdb.tbl_customer (
//			idx INT UNSIGNED AUTO_INCREMENT,
//			name VARCHAR(30) NOT NULL,
//			age TINYINT UNSIGNED NOT NULL,
//			address VARCHAR(30) NOT NULL,
//			CONSTRAINT PRIMARY KEY (idx)
//		);
		
		// 3. 연결하기 및 데이터 조회
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			// DB 드라이버 로드
			System.out.println("[SYSTEM] : Driver loading Success !!!");
			conn = DriverManager.getConnection(url, id, pwd);		// DB Connection 객체 받기
			System.out.println("[SYSTEM] : - - - - - - - - - - - DB Connected - - - - - - - - - - - - ");
			
			// 데이터 조회
			pstmt = conn.prepareStatement("SELECT * FROM `testdb`.`tbl_customer`");
			
			rs = pstmt.executeQuery();
			
			// SELECT 조회 결과가 존재한다면
			if (rs != null) {
				
				while(rs.next()) {
					System.out.print(rs.getString("idx") + " ");
					System.out.print(rs.getString("name") + " ");
					System.out.print(rs.getString("age") + " ");
					System.out.print(rs.getString("address") + " ");
					System.out.println();
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {rs.close();}catch(Exception e) {e.printStackTrace();}
			try {pstmt.close();}catch(Exception e) {e.printStackTrace();}
			try {conn.close();}catch(Exception e) {e.printStackTrace();}
		}
	}

}
