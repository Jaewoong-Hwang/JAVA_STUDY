package Ch15;
//### 자바의 메모리 구조 ###
//1. 스택영역 (Stack) : {}내의 지역변수, 메서드 호출 및 리턴 값, 연산 중 발생하는 임시 데이터 등이 저장
//{}내에서 생성, 벗어나면 소멸
//메서드 호출 시마다 프레임(Frame)이라는 작은 메모리 블록이 생성되어 메서드의 지역 변수와 연산 중 발생하는 중간 결과 등을 저장함.
//메서드가 종료되면 해당 프레임이 스택에서 제거됨.

//후입선출(LIFO, Last In, First Out) 구조
//Ex) 프링글스 과자를 생각하면 편함.'



//2. 힙영역 (Heap) : 객체 저장 공간
//new 예약어 사용시 생성
//동적으로 생성된 객체와 배열이 저장되는 영역
//모든 스레드가 공유하는 메모리 영역, 객체의 생성 및 소멸을 여기에서 이루어짐.
//소멸은 JVM의 가비지 컬렉터(Garbage Collector)에 의해서 소멸(더 이상 참조되지 않는 객체들을 정리)

//3. 클래스영역 (== 메서드 영역) : 공유메모리, static변수, 일반메서드, 생성자 메서드, 클래스 정보, 상수
//클래스 정보(클래스의 구조, 필드, 메서드 코드 등)가 저장되는 영역
//프로그램 시작과 동시에 생성, 프로그램 종료시 소멸

//[정리본]
//1. Stack : 지역변수, 메서드 호출 정보
//2. Heap  : 객체의 저장 공간, 배열 저장 공간
//3. Class : 클래스 정보, Static 변수 저장 공간 





class StaticTest {
	static int Num1 = 0;
	int num2;
	
	void ShowNum() {
		System.out.println("NUM1 : " + Num1);
		System.out.println("NUM2 : " + num2);
		System.out.println();
	}
}
public class C04Static {
	public static void main(String[] args) {
		// static이 붙은 변수 (정적 멤버)는 '''클래스''' 자체에 속함. == 클래스 내의 공유 변수
		// ==> ### 클래스명.변수이름 으로 변수를 호출할 수 있음 ### ==> 중요!!
		
		// static이 붙지 않은 변수(비정적 멤버)는 '''객체''' 자체에 속함. == 객체마다 그 값이 다를 수 있음.
		
		StaticTest obj1 = new StaticTest();
		StaticTest obj2 = new StaticTest();
		
		obj1.Num1 = 10;
		obj1.num2 = 1000;
		obj1.ShowNum();
		
		
		obj2.ShowNum();
		
		StaticTest.Num1 = 200000;
		
		obj1.ShowNum();
		obj2.ShowNum();
		
	}
	

}
