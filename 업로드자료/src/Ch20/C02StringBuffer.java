package Ch20;
// ### StringBuffer Class ###
// StringBuffer Class : 문자열을 나타내는 클래스

// 문자열을 동적으로 변경할 수 있도록 설계되었으며, String 클래스와 달리 내용을 직접 수정할 수 있음.

// 1. append(string str)
// append(Object obj) : 문자열을 뒤에 추가

// 2. insert(int offset, String str)
// insert(int offset, Object obj) : 지정된 위치에 문자열을 삽입

// 3. delete(int start, int end) : 지정된 범위의 문자를 삭제

// 4. reverse() : 문자열을 뒤집음.

// 5. length() : 현재 문자열의 길이를 반환


public class C02StringBuffer {
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("HELLO");
		
		stringBuffer.append(" World");
		System.out.println(stringBuffer);			// HELLO WORLD
		
		stringBuffer.insert(6, " JAVA");
		System.out.println(stringBuffer);
		
		stringBuffer.delete(5, 10);
		System.out.println(stringBuffer);
		
		stringBuffer.reverse();
		System.out.println(stringBuffer);
	
	}

}
