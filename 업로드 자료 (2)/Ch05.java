import java.util.Scanner;
// import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

// import : 불러오겠다.
// java라는 폴더 .(안에) util .(안에) 있는 모든것(*)을 추가하겠다.
// 모든 것 중에 하나가 Scanner 그래서 java.util.Scanner;라고 적어도 Okay

public class Ch05 {
	public static void main(String[] args) {
		// 00 입력문 (값 입력 받기, Scanner)
		
		// System.out 		: 표준 출력 스트림 생성 - 모니터
		// System.in		: 표준 입력 스트림 생성 - 키보드
		
		

		// 실수
		// nextDouble()
		// nextFloat()
		
		// 정수
		// nextInt()
		// nextLong()
		// nextByte()
		// nextShort()
		
		// 논리
		// nextBoolean()
		
		// 한 단어(String)
		// next()
		
		// 한 줄(String)
		// nextLine()
		
		
		
//		
//		Scanner sc = new Scanner(System.in);
//		// 일단 외워주세요 :)
//		// Scanner 장치를 생성해 사용할 수 있도록 참조변수 sc 생성 및 연결
////		System.out.println("정수를 하나 입력하세요 >>> ");
////		String s = sc.next();  		// next() : 한 문자열(단어), 띄워쓰기 기준으로 한 문자열만 가능
////									// nextLine() : 한 줄
////									// nextInt() : 숫자로 나옴. 
////									// 대신 변수 앞 String -> int 로 변환해줘야 함. 
////		System.out.println("입력한 문자열 : " + s);
////		System.out.println();
//		
//		
//		
//		
//		System.out.println("-----------Scanner 버퍼 비우기 예제 ---------------");
//		System.out.println("수 입력 >>> " );
//		int num = sc.nextInt();
//		
//		sc.nextLine(); 				// 버퍼 공간에 남아있는 데이터값을 초기화
//		System.out.println("문자열 입력 >>> ");
//		String str = sc.nextLine();
//		
//		System.out.println("입력한 문자열 : " + str);
		
		
//		## 입출력 실습 예제 ##
//		System.out.println("--------------- Scanner 문제 01 ---------------");
//		문제 01)
		// 직사각형의 가로와 세로 값을 사용자로부터 입력받고 
		// 직사각형의 둘레와 넓이를 구하는 프로그램을 구현해보세요
		// 직사각형의 둘레 = (가로길이 + 세로길이) * 2
		// 직사각형의 넓이 = 가로길이 * 세로길이
		
//		============================== 실행 결과 ===================================
//		가로 길이를 입력하세요 >>> 
//		3
//		세로 길이를 입력하세요 >>> 
//		5
//		직사각형의 둘레 = 16
//		직사각형의 넓이 = 15	
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("가로 길이를 입력해주세요 >>> ");
//		int width = sc.nextInt();
//		System.out.print("세로 길이를 입력해주세요 >>> ");
//		int height = sc.nextInt();
//		
//		int dul = (width + height) * 2;
//		int area = width * height;
//		System.out.println("직사각형의 둘레 = " + dul);
//		System.out.println("직사각형의 넓이 = " + area);

//		문제 02)
//		System.out.println("--------------- Scanner 문제 02 ---------------");
		//이름을 입력하세요? 홍길동
		//홍길동 님의 나이를 입력하세요? 24
		//홍길동 님의 주소를 입력하세요? 대구광역시 반월 센트럴 타워
//		// 홍길동 님의 나이는 24세 주소는 대구광역시 반월 센트럴 타워 입니다
//	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("--------------- Input Start ----------------");
//		System.out.print("이름을 입력해주세요 >>> ");
//		String name = sc.next();
//		
//		System.out.print(name + "님의 나이를 입력해주세요 >>>");
//		int age = sc.nextInt();
//		
//		sc.nextLine();
//		
//		System.out.print(name + "님의 주소를 입력해주세요 >>>");
//		String address = sc.nextLine();
//		
//		System.out.println("--------------- Input End ----------------");
//		System.out.println("[SYSTEM] : 입력한 정보 출력");
//		System.out.println(name + "님의 나이는 " + age + "세 주소는 " + address + "입니다.");
//		System.out.printf("%s님의 나이는 %d세 주소는 %s입니다.", name, age, address);
		
		
	
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
