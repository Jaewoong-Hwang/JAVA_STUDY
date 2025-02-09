package Ch12;

public class C04AccessModifier {
	private String name;
	public int age;
	String address;
	protected double height;
	
	
	public static void main(String[] args) {
		
		C04AccessModifier test = new C04AccessModifier();
		
		test.name = "이름이름";				// private : 같은 클래스 == C04AccessModifier 접근 가능
		test.age = 22;						// public  : 모든 클래스 == 다른 패키지 포함, 모든 클래스 접근 가능
		test.address ="주소주소";				// default : 동일 패키지 == Ch12 안의 클래스 접근 가능
		test.height = 3.14;					// protected: 동일 패키지 == Ch12 안의 클래스 접근 가능
		
		
	}
	
}