package Ch12;


class PersonTest{
	String name;
	int age;

	@Override
	public String toString() {
		return "PersonTest [name=" + name + ", age=" + age + "]";
	}

	
	
}
public class test {
	public static void main(String[] args) {
		PersonTest dong = new PersonTest();
		dong.name = "이동하";
		dong.age = 20;
		
		System.out.println(dong);
		
		
	}


}
