package MVC2.Controller;

public class FrontController {
	public static void main(String[] args) {
		
		// 로그인 요청 시
		LoginController test = new LoginController();
		
		// 회원가입 요청 시 
		MemberJoinController test1 = new MemberJoinController();
		
		
		SubController obj = test;
		
		obj.execute();
		
		
		
	}

}
