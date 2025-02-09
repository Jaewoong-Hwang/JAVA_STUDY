package Ch16;
class Animal05 {
	String name;
	int age;
	int leg_cnt;
}

public class C05AnimalMain {
	public static void main(String[] args) {
		// 클래스 배열을 선언하는 것과 객체를 만드는 일은 별개다? O
		// 정수형 배열을 선언하고 그안에 정수값을 넣는것처럼
		// 클래스 배열을 선언한다면 그 안에 클래스 자료형을 가지는 '객체'를 넣어줘야 함.
		
		
		// Animal05 배열 ==> 클래스 배열
		// 클래스 배열을 자료형으로 가지는 ani_obj 변수를 하나 생성
		// 크기가 3인 클래스 배열을 선언한 부분과 연결하고 있는 과정	
		Animal05 [] ani_obj = new Animal05[3];
		
		
		ani_obj[0] = new Animal05();
		ani_obj[0].name = "멈미";
		ani_obj[0].age = 3;
		ani_obj[0].leg_cnt = 4;
		
		ani_obj[1] = new Animal05();
		ani_obj[1].name = "토깽";
		ani_obj[1].age = 1;
		ani_obj[1].leg_cnt = 2;
		
		ani_obj[2] = new Animal05();
		ani_obj[2].name = "고냠미";
		ani_obj[2].age = 2;
		ani_obj[2].leg_cnt = 4;
		
		for(int i = 0; i < ani_obj.length; i++	 ) {
			System.out.println("이름 : " + ani_obj[i].name);
			System.out.println("나이 : " + ani_obj[i].age);
			System.out.println("다리 Count : " + ani_obj[i].leg_cnt);
		}
		
		
		
	}
}
