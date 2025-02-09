package Ch19;
// ### NUllPointerException ###
// 참조변수가 null 값을 가진 상태에서 해당 변수를 사용하려고 할 때 발생
// null은 아무런 객체를 참조하지 않음을 나타냄.
// ==> 해당 객체의 메서드를 호출하거나 인스턴스 변수에 접근하려고 하면 NullPointerException이 발생
public class C01Null {
	
	
	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.toString()); // 없는 문자열을 toString()으로 출력 시도 ==> 예외 발생
		} catch(Exception e) {
			// e == 참조변수
			// 예외 객체가 생성되고 주소번지가 100이라면 try에서 예외가 발생후 catch의 참조변수 e가 그 주소번지를 받음.
			System.out.println(e.getCause());			// 원인
			System.out.println();
			
			System.out.println(e.toString());			// 객체 정보
			System.out.println();
			
			System.out.println(e.getStackTrace());		// 예외객체 식별주소
			System.out.println();
			
			e.printStackTrace();						// 예외발생정보 출력
			System.out.println();
			
			System.out.println(e.getMessage());			// 예외 메세지 내용 출력
			System.out.println();
		}
	}

}
