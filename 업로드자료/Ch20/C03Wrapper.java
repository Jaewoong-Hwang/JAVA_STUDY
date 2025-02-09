package Ch20;

// ### Wrapper Class ###

// Wrapper 클래스는 자바에서 기본 데이터 타입(primitive types)을 객체로 감싸기 위한 클래스들을 말함.
// 기본 데이터 타입에 해당하는 int, char, boolean, double, 등을 객체로 다루기 위해 제공되는 클래스
// 이러한 Wrapper 클래스들은 해당 기본 데이터 타입의 값을 갖고 있고, 각종 유용한 메서드를 제공하여 객체로서의 동작을 가능하게 함.

// 1. Integer 			: int Wrapper 클래스
// 2. Long				: long
// 3. Float				: float
// 4. Double			: double
// 5. Character			: char
// 6. Boolean			: boolean
// 7. Byte				: byte
// 8. Short				: short

// Wrapper 클래스는 객체이므로 null도 가질 수 있고, 기본 데이터 타입의 값을 객체로 다룰 수 있음.
// 또한 , 자동 박싱(autoboxing)과 자동 언박싱(autounboxing)이라는 개념이 O
// ==> 기본 데이터 타입과 Wrapper 클래스 간에 자동으로 변환될 수 있음.

// 자동 박싱(Autoboxing)
// Integer intObject = 42;		// int를 Integer로 자동으로 변환

// 자동 언박싱(AutoUnboxing)
// int intValue = intObject;   // Integer를 int로 자동으로 변환


public class C03Wrapper {
	public static void main(String[] args) {
		// Boxing (자료 --> Integer 정수형 객체로 변환)
		Integer obj1 = new Integer(100);
		// The constructor Integer(int) has been deprecated since version 9 and marked for removal
		
		Integer obj2 = new Integer("200");
		
		Integer obj3 = Integer.valueOf("300");
		Integer obj4 = Integer.valueOf(100);
	
		System.out.println(obj3.toString());
		System.out.println(obj4);
		
		// UnBoxing (객체 -> 자료)
		int value1 = obj1.intValue(); 		// 100
		System.out.println(value1);
		
		// 자동 Boxing과 자동 UnBoxing
		
		Integer obj = 100;			// AUto Boxing
		int num = obj + 100;		// Auto UnBoxing
		System.out.println("결과 :  " + num);
		
		
	}

}
