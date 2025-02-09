package Ch18;
interface Eatable {
	void eat();
}

interface Sleepable {
	void sleep();
}

class Dog implements Eatable, Sleepable {
	@Override
	public void sleep() {
		System.out.println("개가 잠을 잡니다.");
	}
	
	@Override
	public void eat() {
		System.out.println("개가 먹습니다.");
	}
}
public class C02MultiInterface2 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sleep();
		dog.eat();
		
		
		Eatable up = new Dog();
		up.eat();			// 가능
//		up.sleep(); 		// 다른 인터페이스의 기능이므로 Eatable 인터페이스의 영역 X
		
		Sleepable up2 = new Dog();
//		up2.eat();			// 불가능
		up2.sleep(); 		// 가능
	}

}
