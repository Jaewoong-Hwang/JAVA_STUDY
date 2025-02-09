import java.util.Scanner;

public class Ch07 {
	public static void main(String[] args) {
		// 00 분기문
		// 조건문과 반복문 중간에서 코드블럭을 나눠서 처리하는 문법
		// 그 예로는 if문, switch문, for문, while문 등이 있다.
		
		// 01 if문
		// 조건문을 작성할 때 사용하는 구문.
		
		// 조건식이 참이라면 코드 블럭을 실행
		// 조건식이 거짓이라면 코드 블럭을 무시(스킵)
		
		
		// 조건식은 참 또는 거짓을 판단할 수 있는 식이여야만 한다.
		// 참과 거짓
		
		// 02 if문의 형식
		
		// if ( 조건식 ) {
		//						// 
		//						//	조건식이 참이라면 이 실행코드 실행
		//}
		
//		Scanner sc = new Scanner(System.in);
//		if (true) {
//			System.out.println("조건식이 참이고 if문 진입");
//		}
//		System.out.println("if문 처리 이후 실행코드");
//		System.out.println();
		

        // IF문 문제 01)
     // 사용자로부터 정수 하나를 입력받고 3의 배수이면 3의 배수입니다가 출력되도록 코딩하세요.
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 하나를 입력해주세요 >>> ");
//		int num = sc.nextInt();
//		if (num % 3 == 0) {
//			System.out.println("3의 배수입니다.");
//		}
//		if (num % 3 == 1) {					// num % 3 == 1 || num % 3 == 2
//			System.out.println("3의 배수가 아닙니다.");
//		}
//		if (num % 3 == 2) {
//			System.out.println("3의 배수가 아닙니다.");
//		}
		
		
		// 2-2) if문과 else문
		
		// if ( 조건식 ) {
		//					// 조건식이 참이라면 이 실행코드 실행
		// }
		// else {
		//					// 조건식이 거짓이라면 이 실행코드 실행
		//}
//	     IF-ELSE문 문제 01
	    // 사용자로부터 두 정수를 입력받는다.
	    // 두 수의 합이 짝수면 "두 수의 합은 짝수입니다."
	    // 두 수의 합이 홀수면 "두 수의 합은 홀수입니다" 
	    // 위와 같은 결과값이 나오도록 코딩하세요 !
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("두개의 정수를 입력해주세요 >>> ");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int sum = num1 + num2;
//		if(sum % 2 == 0) {
//			// 두 수의 합이 짝수인 경우
//			System.out.println("두 수의 합은 짝수입니다.");
//		} else {
//			// 두 수의 합이 홀수인 경우
//			System.out.println("두 수의 합은 홀수입니다.");
//		}
		
		
		
	    // IF-ELSE문 문제 02
	    // 사용자로부터 정수를 입력받는다.
	    // 그 수가 num >= 2 && num <= 20 이면
	    // 조건식이 참이면 "2 ~ 20범위 안에 있습니다."
	    // 조건식이 거짓이며 "범위를 벗어났습니다."
	    // 위와 같은 결과값이 나오도록 코딩하세요 !
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 하나를 입력해주세요 >>> ");
//		int num1 = sc.nextInt();
		
		// 1. && 논리 연산을 사용한 방법
//		if (num1 >= 2 && num1 <= 20) {
//			System.out.println("2 ~ 20 범위 안에 있습니다.");
//		} else {
//			// num1이 2 미만이거나, num1이 20 초과라면
//			System.out.println("범위를 벗어났습니다.");
//		}		
		
		// 2. && 논리 연산을 떠올리지 못했다면
//		if (num1 >= 2) {
//			// 2이상이라면 if문안에 진입
//			// 20 초과가 되면 X
//		    // 20 이하일때만 문구 출력 
//			if(num1 <= 20) {
//				System.out.println("2 ~ 20 범위 안에 있습니다.");
//			} else {
//				System.out.println("두번째 조건 위반 : 범위를 벗어났습니다.");
//			}
//			
//		} else {
//			// num1이 2 미만이거나, num1이 20 초과라면
//			System.out.println("첫번째 조건 위반 : 범위를 벗어났습니다.");
//		}
		
		
		// 2-3) 중첩 if문
		// if (조건식1) {
		// 	// 조건식1이 참인 경우 실행되는 코드 블록
		
		//	// if(조건식2) {
		//		// 조건식1과 조건식2가 참일 때 실행되는 코드 블록
		//  // }
		
		// }
		
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("----------------- 중첩 if-else문 예제 --------------------");
//		String id = "admin@example.com";	// DB에 저장되어 있는 ID라고 가정
//		String pwd = "test1234";			// DB에 저장되어 있는 PW라고 가정
//		
//		System.out.println("----------------- LOGIN START -----------------");
//		System.out.print("[SYSTEM] : ID를 입력하세요 >>> ");
//		String input_id = sc.next();
//		
//		// 기존의 DB ID와 입력 ID를 비교
//		if(id.equals(input_id)) {		// equals() : 문자열 객체의 내용을 비교한 후 일치하다면 true, 아니면 false
//			// ID가 일치한 경우
//			System.out.println("[SYSTEM] : ID가 일치합니다.");
//			System.out.println("[SYSTEM] : 다음 단계만 완성하시면 로그인을 하실 수 있습니다 ( 1 / 2 )");
//			
//			System.out.print("[SYSTEM] : PW를 입력하세요 >>> ");
//			String input_pw = sc.next();
//			
//			// 기존의 DB PW와 입력 PW를 비교
//			if(pwd.equals(input_pw)) {
//				// PW가 일치한  경우
//				System.out.println("[SYSTEM] : PW가 일치합니다.");
//				System.out.println("[SYSTEM] : LOGIN 성공하셨습니다.");
//				System.out.println("[SYSTEM] : " + id + "님 환영합니다.");
//				System.out.println("----------------- LOGIN END -----------------");
//			} else {
//				// ID는 일치하나 PW가 불일치한 경우
//				System.out.println("[SYSTEM] : ID는 일치하나 PW가 불일치합니다.");
//				System.out.println("[SYSTEM] : LOGIN을 다시 시도하세요.");
//				System.out.println("----------------- LOGIN END -----------------");
//			}
//		} else {
//			// ID가 불일치한 경우
//			System.out.println("[SYSTEM] : ID가 일치하지 않습니다.");
//			System.out.println("[SYSTEM] : LOGIN을 다시 시도하세요.");
//			System.out.println("----------------- LOGIN END -----------------");
//			
//		}
		
		
		// 05 else-if
		// 다중 분기
//		Scanner sc = new Scanner(System.in);
//		System.out.println("나이 입력 >>>");
//		int age = sc.nextInt();
//		
//		if (age >= 20) {
//			System.out.println("성인입니다.");
//		} else if (age >= 8) {
//			System.out.println("취학 아동입니다.");
//		} else {
//			System.out.println("미취학 아동입니다.");
//		}
		
		
	    // else - if 문 문제 01)
	    //시험 점수를 입력받아 90 ~ 100점은 A,
		//80 ~ 89점은 B, 70 ~ 79점은 C,
		//60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("시험 점수를 입력해주세요 >>> ");
//		int score = sc.nextInt();
////		char grade;
//		
//		if (score >= 90) {
//			System.out.println("A학점입니다.");
////			grade = 'A';
//		} else if (score >= 80) {
//			System.out.println("B학점입니다.");
//		} else if (score >= 70) {
//			System.out.println("C학점입니다.");
//		} else if (score >= 60) {
//			System.out.println("D학점입니다.");
//		} else {
//			System.out.println("F학점입니다.");
//		}
		
		
		
		
		
		
//	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
	}

}
