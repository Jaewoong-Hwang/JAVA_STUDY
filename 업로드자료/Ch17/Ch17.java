package Ch17;
// ### 추상 클래스와 추상 메서드 ###

// 추상 클래스 : 추상 메서드를 하나라도 가지는 클래스
//			: 객체 직접 생성 X
//			: abstract 키워드 사용

// 추상 메서드 : 선언 O, 구현 X 메서드
//			: 하위 클래스에서 반드시 구현
//			: abstract 키워드 사용

// 추상 클래스를 사용하는 이유 : 1. 추상 메서드에 대한 강제 구현(Overriding)을 의무화시킴으로써 자식 클래스에서 반드시 메서드를 구현하도록 함.
//						 : 2. 업캐스팅을 통한 오버라이딩 메서드를 원활하게 사용하기 위해서 임.
abstract class Shape {
	
	abstract public void draw();
	
}

class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("원을 그리다.");
		
	}
	
	
}

class Rectangle extends Shape {
	@Override
	public void draw() {
		System.out.println("사각형을 그리다.");
	}
	
}

public class Ch17 {
	public static void drawShape(Shape obj) {		// 업캐스팅 상태
		obj.draw(); 
		
	}
	public static void main(String[] args) {
		Circle test = new Circle();
		Rectangle test1 = new Rectangle();
		drawShape(test);
		drawShape(test1);
		
		
		
		
	}
}
