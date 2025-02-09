package Ch12;

public class C03CarMain {
	// 속성(멤버 변수) 선언
	String brand;
	String model;
	int year;
	double price;
	// 메서드 : 속성을 출려하는 메서드
	public void printCarInfo() {
		System.out.println("Brand : " + brand);
		System.out.println("model : " + model);
		System.out.println("year : " + year);
		System.out.println("price : $" + price);
	}
	// ### 메서드의 구조 ###
	// 1. 메서드의 헤더
	// public		void		printCarInfo  			( 			)==> printCarInfo()는 매개변수 X
	// 접근 제어자		반환타입		메서드명					( 매개변수    )
	
	// 2. 메서드의 바디
	// {}
	
	// ### 접근 제어자 (Access Modifier) ###
	// public : 모든 클래스에서 사용 가능
	// default : 동일 패키지에 속한 클래스에서만 사용가능
	// private : 현재 클래스에서만 접근 가능
	// protected : 동일 패키지에 속한 클래스 Or 상속관계에서 하위클래스에서만 접근 가능
	
	public static void main(String[] args) {
		// Car 클래스의 인스 생성
		C03CarMain myCar = new C03CarMain();
		
		// 속성 설정
		myCar.brand = "Porche";
		myCar.model = "911 Turbo";
		myCar.year = 2022;
		myCar.price = 25000.50;
		// 속성 출력
		myCar.printCarInfo();
	}
}
