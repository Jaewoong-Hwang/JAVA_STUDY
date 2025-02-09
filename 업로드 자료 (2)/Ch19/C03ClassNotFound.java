package Ch19;

// ### ClassNotFoundException ###

// 클래스로더가 클래스를 찾지 못할 때 발생하는 예외
// 이 예외는 주로 동적으로 클래스를 로딩하는 시점에서 해당 클래스를 찾을 수 없을 때 발생
public class C03ClassNotFound {
	
	public static void main(String[] args) {
		try {
			
			Class<?> myClass = Class.forName("Ch18.Ch18");
			System.out.println("클래스 로딩 성공~!!!");
		} catch(Exception e) {
			e.printStackTrace();
			
		}
	}

}
