package Ch15;

//### 상속(Inheritance) ###

//## 상속의 기본구조 ##
//class 부모클래스 {
//// 부모 클래스의 멤버 변수와 메서드
//}
//
//class 자식클래스 extends 부모클래스 {
//// 자식 클래스의 추가적인 멤버 변수와 메서드
//}



//## 주의사항 ##
//1. 단일 상속: 자바에서는 단일 상속만을 지원함.
//			  즉, 하나의 클래스는 하나의 부모 클래스만을 가질 수 있음.
//			  이로 인해 클래스 간의 강한 결합을 피하고 복잡성을 감소시키는 효과가 있음.

//2. 접근 제어자: 상속 관계에서 부모 클래스의 멤버 변수 및 메서드의 접근 제어자에 따라 자식 클래스에서의 접근 여부가 결정됨. 
//				private으로 선언된 멤버는 상속이 되지만 직접 접근할 수 없음
//
//3. 생성자 호출: 자식 클래스의 생성자가 호출될 때, 부모 클래스의 기본 생성자가 자동으로 호출됨.
//				만약 부모 클래스에 매개변수가 있는 생성자가 정의되어 있다면, 자식 클래스에서 명시적으로 super()를 사용하여 호출해야 함.




//부모 클래스: 차량(Vehicle)
class Vehicle {
	String brand;

	Vehicle(String brand) {
	   this.brand = brand;
	}

	void start() {
	   System.out.println(brand + " 차량 시동을 걸다.");
	}

	void stop() {
	   System.out.println(brand + " 차량을 정지시킨다.");
	}
}

//자식 클래스: 자동차(Car)
class Car extends Vehicle {
	Car(String brand) {
	   super(brand);
	}

	void accelerate() {
	   System.out.println(brand + " 차량이 가속한다.");
	}

	void brake() {
	   System.out.println(brand + " 차량이 제동한다.");
	}
}





public class Ch15 {
	public static void main(String[] args) {
		
		

		 Car myCar = new Car("Toyota");

	     myCar.start();      // 부모 클래스의 메서드 호출
	     myCar.accelerate(); // 자식 클래스의 메서드 호출
	     myCar.brake();      // 자식 클래스의 메서드 호출
	     myCar.stop();       // 부모 클래스의 메서드 호출	
		
		
		
	}

}
