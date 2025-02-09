package Ch17;

//부모 클래스 Vehicle
//정보 : 연료량(fuel)

//자식 클래스 Car, Motorcycle

abstract class Vehicle {
	int fuel = 100;
	abstract public void drive();
//	abstract public void showFuel();

	// 추상클래스의 일반메서드
	public void showFuel() {
		System.out.printf("%s 연료량 출력 : %d\n", this.getClass().getSimpleName() , fuel);
	}
	
}
class Car extends Vehicle {

	@Override
	public void drive() {
		if(fuel >= 5) {
			fuel -= 5;
			System.out.println("차를 운전합니다.");
		} else {
			System.out.println("연료가 부족합니다. 차를 운전할 수 없습니다.");
		}
		
	}
//
//	@Override
//	public void showFuel() {
//		
//		System.out.println("자동차 연료량 출력 : "  + fuel);
//	}
	
	
	
	
}
class Motorcycle extends Vehicle {
	@Override
	public void drive() {
		if(fuel >= 5) {
			fuel -= 5;
			System.out.println("오토바이를 운전합니다.");
		} else {
			System.out.println("연료가 부족합니다. 오토바이를 운전할 수 없습니다.");
		}	
	}
//	@Override
//	public void showFuel() {
//		System.out.println("오토바이 연료량 출력 : "  + fuel);
//		
//	}
}
public class C01PracVehicle {
	public static void ShowInfo(Vehicle obj) {
	
//		obj.showFuel();
		
		if (obj instanceof Car) {
			System.out.println("자동차 연료량 출력 : " + obj.fuel);
		} else if (obj instanceof Motorcycle) {
			System.out.println("오토바이 연료량 출력 : " + obj.fuel);
		}
		
		
	}
	public static void main(String[] args) {
		Car car = new Car();							
		Motorcycle motorcycle = new Motorcycle(); 	
		
		
		car.drive();				// 차를 운전합니다.
									// 연료량 5감소
		motorcycle.drive();			// 오토바이를 운전합니다.
									// 연료량 5 감소

		ShowInfo(car);					// 자동차 연료량 출력 : 95
		ShowInfo(motorcycle);			// 오토바이 연료량 출력 : 95
	}

}
