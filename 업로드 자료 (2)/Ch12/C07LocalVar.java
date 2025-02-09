package Ch12;

// ### 지역변수(Local Variable) ###
// 특정구역({}) 내에서 생성되어 그 구역에서만 사용 가능한 변수, 즉 함수 속에서 선언되어 함수 속에서만 사용 가능한 변수
// 함수나 {} 끝나게 되면 메모리에서 '' 소멸 ''

// ### 전역변수 (Global Variable) ###
// 어느 위치에서든 호출하면 사용이 가능한 변수 즉, 함수 밖에서 선언하여 클래스 전체에서 사용 가능한 변수

// 1. 전역변수는 프로그램 전체에서 사용 가능한 변수이다.
// 프로그램 종료 시 메모리에서 제거

// 2. 전역변수는 사용 최소화하는게 좋음.
class LocalVar {
	int num = 10;

	void Func1() {
		System.out.println("멤버변수 num = " + num);
		if (true) {
			// 지역 변수
			int num = 100;
			System.out.println("if 문 안의 지역변수 num = " + num);
			System.out.println("멤버변수 num = " + this.num);
		}
		System.out.println("멤버변수 num = " + num);
	}
}

public class C07LocalVar {

	public static void main(String[] args) {
		LocalVar test = new LocalVar();
		test.Func1();
	}

}
