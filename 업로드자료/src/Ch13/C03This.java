package Ch13;

// ### 'this' keyword ###
// 클래스 내에서 사용되는 예약어
// 생성되는 객체의 위치정보를 가져오는데 사용됨.

// 멤버변수 vs 매개변수 구별
// this.name = name

// ## this() ##
// Overloading(오버로딩)된 다른 생성자 호출 가능함.

class C03Simple {
	int x;
	int y;
	
	public C03Simple() {
//		x = 10;
//		y = 10;
		this(10, 10);			// C03Simple(int x, int y) 매개변수 생성자를 호출
	}	
	public C03Simple(int x ) {
//		this.x = x;
//		y = 10;
		this(x, 10);
	}
	public C03Simple(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "C03Simple [x=" + x + ", y=" + y + "]";
	}
	
	
	
}
public class C03This {
	public static void main(String[] args) {
		C03Simple ob1 = new C03Simple();
		C03Simple ob2 = new C03Simple(100);
		C03Simple ob3 = new C03Simple(100, 200);
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
	}

}
