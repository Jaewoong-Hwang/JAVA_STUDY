package Ch15;

//Course 클래스
//속성 : 수학 수업 정원(Ex. 50명, 100명 등), 과학 수업 정원
class Course {
	static int mathSeats = 30;
	static int scienceSeats = 30;
	 
	
	public void register() {
		
	}
}

//Math extends Course
class Math01 extends Course {

	@Override
	public void register() {
		if (mathSeats > 0) {
			mathSeats--;
			System.out.println("수학 수업에 수강신청을 했습니다.");
		} else {
			System.out.println("수업 정원 초과로 인해 수강신청이 불가능합니다.");
		}
	}
	
}

//Science extends Course
class Science01 extends Course {
	@Override
	public void register() {
		if (scienceSeats > 0) {
			scienceSeats--;
			System.out.println("과학 수업에 수강신청을 했습니다.");
		} else {
			System.out.println("수업 정원 초과로 인해 수강신청이 불가능합니다.");
		}
		
		
	}
		
}
//Student
class Student {
	public static void registerForCourse (Course course) {
		
		// 1. instanceof로 업캐스팅된 참조변수 course가 가리키는 객체가 수학인지, 과학인지를 파악한 후 해당 정원을 줄이는 방법
//		if (course instanceof Math01) {
//			Course.mathSeats--;
//			System.out.println("수학 수업에 수강신청을 했습니다.");
//			
//		} else if (course instanceof Science01) {
//			Course.scienceSeats--;
//			System.out.println("과학 수업에 수강신청을 했습니다.");
//		}
		
		// 2. 각 클래스(설계도)에서 메서드를 정의한 후, course로 업캐스팅된 객체를 활용해서 오버라이딩된 자식 메서드를 사용하는 방법
		course.register();
	}
	public static void showSeatsInfo() {
		System.out.println("수학 수업 정원 : " + Course.mathSeats);
		System.out.println("과학 수업 정원 : " + Course.scienceSeats);
		
	}
}
public class C05PracAcademy {

	public static void main(String[] args) {
		
		Math01 mathClass = new Math01();
		Science01 scienceClass = new Science01();		
		
		
		Student.registerForCourse(mathClass);		// 수학 수업에 수강신청을 했습니다. 
													// 수학 수업 정원 - 1;	
		
		Student.registerForCourse(scienceClass);	// 과학 수업에 수강신청을 했습니다.
													// 과학 수업 정원 - 1;
		
		Student.showSeatsInfo();					// 남은 수업 정원 정보를 출력
													// 수학 수업 정원 : 29명
													// 과학 수업 정원 : 29명
		
	}
}
