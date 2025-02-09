package Ch15;

class Exam {
	int num1;
	public void printNum1() {
		System.out.println(num1);
	}
	
	public void write() {
		System.out.println("부모에서 쓰는 중");
	}
	
}
class Example extends Exam {
	int num2;
	public void printNum2() {
		System.out.println(num2);
	}
	
	@Override
	public void write() {
		System.out.println("자식에서 쓰는 중");
	}
}

class ExampleTest extends Exam {
	
}
public class C03UpDownCastingInfo {
	public static void main(String[] args) {
		// 1. NoCasting 상태 == No (안해) Casting(형을 변환하는 과정)
		// << 부모 >>
		Exam obj = new Exam();
		obj.num1 = 20;
		obj.printNum1();
//		obj.num2 = 10; 			// X
//		obj.printNum2();		// X
		
		// << 자식 >>
		Example obj1 = new Example();
		obj1.num1 = 20;
		obj1.printNum1();
		obj1.num2 = 100;
		obj1.printNum2();
		
		// 2. UpCasting 상태 == Up(위로) Casting (형을 변환하는 과정)
		// 자식 객체를 부모타입(Up)으로 형을 변환하는 과정
		Exam obj2 = new Example();
		obj2.num1 = 10;			// 부모
		obj2.printNum1(); 		// 부모
//		obj2.num2 = 20;			// 자식 X, 범위 초과 
//		obj2.printNum2(); 		// 자식 X, 범위 초과
		
		// ??? : 그러면 부모 객체를 자식이 받아줄 수 있나요?  X
//		Example obj3 = new Exam();		// Type mismatch: cannot convert from Exam to Example
										// 자료형이 맞지 않음(매치 X) : Exam(부모)를 Example(자식) 자료형으로 변환이 안됨 XXX
		
		obj2.write(); 			// obj2가 참조하는 부분 == 부모 속성, 기능(메서드) 
								// 결과 : 자식에서 쓰는중
								// 이유 : 자식이 Overriding을 하게되면 부모 영역에 있는 write()를 덮어쓰기 때문에
								//	   : 부모가 가지고 있는 write()의 내용이 재정의됨.
								// ==> 따라서 부모 영역까지만 참조하더라도, 자식이 재정의한 내용을 출력 및 실행할 수 있음.
		
		// 3. DownCasting 상태 == Down(아래로) Casting(형을 변환하는 과정)
		// Down(아래로) 간다는건, 위로 올라갔다는 뜻 == UpCasting이 전제 되어야 함.
		// 조건 : UpCasting이 전제
		// 부모 타입(UP)을 자식 객체(DOWN)으로 형으로 변환하는 과정
		
		Exam obj3 = new Example();			// UpCasting
		
		// obj3를 활용해서 접근할 수 있는 obj3변수 / 메서드 : num1, printNum1()
		
		// obj3는 부모 객체를 참조하는 obj와 결론적으로 활용할 수 있는 변수 / 메서드는 같다 ==> num1, printNum1()
		// 하지만, obj3와 obj가 참조하는 객체의 종류가 다름.
		// obj3 : 자식 클래스 객체를 참조하는 중
		// obj  : 부모 클래스 객체를 참조하는 중
		
		// obj3는 현재로써는 num1과 printNum1() 밖에 참조할 수 없지만,
		// DownCasting으로 obj3가 참조하고 있는 객체와 형태(자료형)을 맞춰준다면
		// 얼마든지 num2와 printNum2()까지 활용할 수 있다는 이야기 ==> DownCasting
		
//		Example down = obj3;		// 의 주소값(자식 객체의 주소값)을 down 참조변수에게 전달
									// 현재, Example 타입(자식 타입) = Exam 타입(부모 타입)
									// 이므로, 양 변(좌항, 우항)의 자료형 일치 X
	
		// 양변의 자료형을 일치시켜주기 위해서 강제 형변환을 진행 == DownCasting
		
		Example down = (Example) obj3;	
		down.num1 = 100;
		down.printNum1();
		down.num2 = 200;
		down.printNum2();
		
		
		// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// 문제가 발생함.
		// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		// 서로 관련이 없는 형태로 다운캐스팅을 하는 일이 빈번히 생기기 시작
		Exam obj4 = new Example();			// UpCasting
		
//		ExampleTest down2 = (ExampleTest) obj4;	// Error, 문제점 : 문법상에는 문제가 없는 코드가 RunTime(실행) 환경에서 예외 발생
		
		// instanceof 키워드 등장 : 클래스 간의 관계성 여부를 판단해주는 키워드
		
		// obj4가 참조하는 객체(자식 클래스 객체 == new Example())가 Example 클래스의 인스턴스라면 True 반환
		//																		   아니라면 False 반환
		if (obj4 instanceof Example) {
			// obj4가 참조하고 있는 객체를 (Example)타입으로 형변환을 시켜 down3라는 Example자료형을 가지는 참조변수에게 전달.
			Example down3 = (Example) obj4; 		// DownCasting
			down3.num1 = 100;
			down3.printNum1();
			down3.num2 = 200;
			down3.printNum2();
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
