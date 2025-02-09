package Ch15;
// ### Override ### == 덮어쓰기 == Over (그 위에) Write(쓰기)
// 상속관계에서 부모 클래스의 '''메서드'''를 자식 클래스가 내용만 바꾼 채로 사용하는 기술
// == 메서드의 헤더부분은 동일함.

// 조건
// 1. 메서드 헤더가 동일해야함.
// 2. 바디 부분만 다르게 작성해야함.
// 3. 접근 제어자 : 부모 클래스와 같거나 더 넓은 범위로 설정해야함.

class NewCar {
	public void driveSound() {
		System.out.println("차가 운전 중입니다.");
	}
}

class Sedan extends NewCar {
	@Override					// 1. 문법 체크 기능 == '''나는 아래 코드에서 "오버라이딩"을 하겠다''' 의미
								// 2. 가시적인 기능 == 개발자와의 협업에서 오버라이딩했다는 의미 부여
								// 중요한 점 : 어노테이션 Override가 없더라도 메서드 헤더만 같다면 오버라이딩이 가능함.
	public void driveSound() {
		System.out.println("세단이 조용히 운전 중입니다.");
	}
}

class SportsCar extends NewCar {
	public void driveSound() {
		System.out.println("스포츠카가 빠르게 운전 중입니다.");
	}
}


public class C03Overriding {
	public static void main(String[] args) {
//		Sedan sd = new Sedan();
//		SportsCar sp = new SportsCar();
//		
//		sd.driveSound();
//		sp.driveSound();
		
		// ### 다형성 예제 ###
		NewCar myCar1 = new Sedan();		// 다형성을 통한 객체 생성
		
		myCar1.driveSound(); 				// 오버라이딩된 Sedan 클래스의 driveSound() 메서드 호출
		
	}

	
}
