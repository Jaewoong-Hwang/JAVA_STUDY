package Ch15;

class TestExample {
	int num1;
	static int num2;
	
	void setNumber1() {
		num1 = 111;
		num2 = 222;
	}
	
	static void setNumber2() {
//		num1 = 2000;					// Error 발생 이유 : num1은 Non Static(비정적 멤버 변수)임.
										// 				 : 근데 setNumber2()가 static 메서드임.
										// 여기서 발생할 수 있는 문제 Static(정적 멤버)은 객체를 만들지 않고 사용 가능
										// 근데 num1 멤버변수(non-static)은 객체를 만들어야지만 생성이 되는 변수
										// static 메서드에서 NOn-Static 변수의 값을 바꾸거나 사용할 수가 없다는 의미
		num2 = 3000;
	}
}

public class C05Static {
	public static void main(String[] args) {
		TestExample.setNumber2();
		System.out.println(TestExample.num2);
	}

}
