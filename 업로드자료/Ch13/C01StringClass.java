package Ch13;


class Person {

}
public class C01StringClass {
	public static void main(String[] args) {
		// # 일반 객체의 toString(); #
//		Person test = new Person();
//		
//		System.out.println(test);
//		System.out.println(test.toString());
//		
//		
//		Person test1 = new Person();
//		System.out.println(test1);
//		System.out.println(test1.toString());
		
		
		// # 문자열 객체의 toString() #
		String str = "java";
		String str1 = "java";
		
		// ### System.identityHashCode() ###
		// : 물리적인 메모리주소(실제 메모리 주소)를 Hashing시킨 후의 코드 ( == 해시 코드 )를 반환해주는 메서드
		// : 메모리주소값을 해싱한 후의 결과를 반환
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
		// 결과
//		523429237
//		523429237
		// 결과가 의미하는 바 : 두 참조변수(str, str1)는 같은 객체("java" 문자열 객체)를 가리킨다.
		
		String str2 = new String("java");
		
		System.out.println(System.identityHashCode(str2));
		
		// ### HashCode() ###
		// : 내용을 기반으로 Hashing한 코드 결과값을 반환
		
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// 결과적으로 꼭 알아야하는 개념 : 같은 해시코드를 반환해도 서로 다른 객체일 수 있다.
		
		
		
		
		
	}
	
	

}
