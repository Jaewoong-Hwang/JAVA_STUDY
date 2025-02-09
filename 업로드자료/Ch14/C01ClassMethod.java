package Ch14;
class Controller {
	private MemberDto dto;		// 참조변수 (member변수)
	
	public void setMemberDto(MemberDto dto) {
		this.dto = dto;
	}
	
	public MemberDto getMemberDto() {
		return dto;
	}	
}

class MemberDto {
	String name;
	int age;
	public MemberDto(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "MemberDto [name=" + name + ", age=" + age + "]";
	}
}
public class C01ClassMethod {
	public static void main(String[] args) {
		MemberDto obj = new MemberDto("홍길동", 120);
		
		Controller con = new Controller();
		
		con.setMemberDto(obj);
		
		MemberDto tmp = con.getMemberDto();
		
		
		System.out.println(con.getMemberDto());
		System.out.println(tmp);
		System.out.println(obj);
		
		System.out.println(System.identityHashCode(tmp));
		System.out.println(System.identityHashCode(obj));
		System.out.println(System.identityHashCode(con.getMemberDto()));
	
	}

}
