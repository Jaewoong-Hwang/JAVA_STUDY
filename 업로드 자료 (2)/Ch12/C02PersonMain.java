package Ch12;
class C02Person {
	String name;
	int age;
	String address;
}

public class C02PersonMain {
	public static void main(String[] args) {
		C02Person hong = new C02Person();
		
		hong.name = "홍길동";
		hong.age = 35;
		hong.address = "대구광역시 반월당 센트럴타워";
		
		System.out.printf("%s님의 나이는 %d이고 주소는 %s입니다.", hong.name, hong.age, hong.address);
		
	}

}
