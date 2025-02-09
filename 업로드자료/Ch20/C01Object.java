package Ch20;

// ### Object 클래스 ###

// java.lang.Object 클래스는 자바에서 모든 클래스의 최상위 부모 클래스임.
// 모든 클래스는 기본적으로 Object 클래스를 암시적으로 상속받음.

// 1. toString() 메서드 :객체를 문자열로 표현하는데 사용.
// System.out.println(obj)와 같은 코드에서 자동으로 호출

// 2. equals(Object obj) 메서드  : 두 객체가 동등한지 여부를 비교하는데 사용
// 기본 구현은 객체의 참조(주소)를 비교하므로, 실제 동등성 비교를 위해 이 메서드를 재정의할 수 있습니다.
// Object 클래스에서 제공되는 equals 메서드는 == 연산자와 동일하게 동작하며, 객체의 레퍼런스(메모리 주소)를 비교
// but 객체의 내용을 비교하도록 재정의될 뿐임 ==> 예를들어 String class나 Integer Class에서 !!

// 3. HashCode() 메서드 : 객체의 해시 코드 값을 반환
// HashMap, HashSet 등과 같은 해시 기반 컬렉션에서 객체를 저장하고 검색하는 데 사용.

// 4. getClass() 메서드 : 객체의 클래스 정보를 반환
// 리플렉션(Reflection)과 같은 고급 프로그래밍 기술에서 주로 사용.

// ==> Object 클래스의 메서드들은 모든 자바 클래스에 공통적으로 적용되며, 필요에 따라 이러한 메서드들을 오버라이딩하여 클래스에 특화된
//     동작을 정의할 수 있음.


class Animal {
	String name;
	
	public Animal(String name) {
		this.name =name;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}
}
public class C01Object {
	public static void main(String[] args) {
		// 1. toString()
		Animal test = new Animal("동물 이름");
		System.out.println(test);
		System.out.println(test.toString());
		
		Object test1 = new Object();
		Object test2 = new Object();
		Object test3 = test1;
		
		System.out.println(test1.equals(test3));
		
		
		
		
		
		// 2. equals()
		String str = "java";
		String str1 = "javaExample";
		
		System.out.println(str.equals(str1));
	}

}
