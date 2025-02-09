package Ch21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C02Insert {
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
		
		// 3. 연결하기 및 데이터 삽입
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			// DB 드라이버 로드
			System.out.println("[SYSTEM] : Driver loading Success !!!");
			conn = DriverManager.getConnection(url, id, pwd);		// DB Connection 객체 받기
			System.out.println("[SYSTEM] : - - - - - - - - - - - DB Connected - - - - - - - - - - - - ");
			
			//  INSERT문에서 모든 열을 사용해서 데이터 삽입하는 경우의 쿼리문 & 데이터 삽입
//			pstmt = conn.prepareStatement("INSERT INTO `testdb`.`tbl_customer`VALUES (?, ?, ?, ?)");
			
//			pstmt.setInt(1, 3);
//			pstmt.setString(2, "김길동");
//			pstmt.setInt(3, 50);
//			pstmt.setString(4, "서울특별시 테헤란로 111-22");
			
//			int result = pstmt.executeUpdate();
//			if(result > 0) {
//				System.out.println("INSERT 성공~!!");
//			} else {
//				System.out.println("INSERT 실패~!!");
//			}
			
			
			
			// INSERT문에서 열(컬럼)이 세개 지정해서 데이터 삽입하는 경우의 경우 & 활용 예시
//			for(int i = 1; i <= 10; i++) {
//				pstmt = conn.prepareStatement("INSERT INTO `testdb`.`tbl_customer` (`name`,`age`,`address`) VALUES (?, ?, ?)");
//				
//				pstmt.setString(1, "사람" + i);
//				pstmt.setInt(2, i + 29 );
//				pstmt.setString(3, "서울특별시 테헤란로 " + (i+100));
//				
//				int result = pstmt.executeUpdate();
//				if(result > 0) {
//					System.out.println("INSERT 성공~!!");
//				} else {
//					System.out.println("INSERT 실패~!!");
//				}
//			}
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();;
		} finally {
			try {conn.close();}catch(Exception e) {e.printStackTrace();}
		}
	}

}
