import java.util.Scanner;

public class Ch06 {
	public static void main(String[] args) {
		// 00 대입 연산자

		// ' = ' : 왼쪽은 '공간' 오른쪽은 '값'으로 해석한다
//				   오른쪽 값 저장 후 왼쪽 공간으로 대입

		// 01 산술 연산자
//		System.out.println("--------------- 산술 연산자 예제 ---------------");
//		int a = 10, b = 20, c;
//		System.out.println("a + b = " + (a + b));
//		System.out.println("a - b = " + (a - b));
//		System.out.println("a * b = " + (a * b));
//		System.out.println("b / a = " + (b / a));	// 나누기 연산자 : 몫
//		System.out.println("a % b = " + (a % b));	// 나머지 연산자 : 나머지
//													// 사용 경우
//													// 1.짝홀수 구분 
//													// 2.배수구분 
//													// 3.자리수제한 
//		System.out.println("-a = " + -a); // 앞에 - 를 붙인다고 해서 음수가 되는게 X
//		  							  	  // 부호를 반전시키는 연산 '-'
//		  							      // 즉 양수 -> 음수, 음수 -> 양수
//		System.out.println();
		
		

		// 02 복합대입 연산자 (산술+대입)
		// 복합대입 연산자 = 대입연산자 + 산술연산자
		
		
//		System.out.println("--------------- 복합대입 연산자 예제 ---------------");
//		int a = 10;
//		
//		
//		a += 10;	// a = a + 10;
//		System.out.println("a = " + a);
//		a -= 5;		// a = a - 5;
//		System.out.println("a = " + a);
//		a *= 3;		// a = a * 3;
//		System.out.println("a = " + a);
//		a /= 2;		// a = a / 2;
//		System.out.println("a = " + a);
//		a %= 2;		// a = a % 2;
//		System.out.println("a = " + a);
//		System.out.println();
		
		
		

		// 03 비교연산자
		
		// 피연산자들을 ' 비교 ' 하여 참 / 거짓 값 반환 
		// 참(True)		
		// 거짓(False)	
		
//		System.out.println("--------------- 비교 연산자 예제 ---------------");
//		int a = 10;
//		int b = 20;
//		System.out.println("A == B : "+ (a == b)); 	// == : 같은지 여부 (비교연산자)
//		System.out.println("A  > B : "+ (a > b));
//		System.out.println("A  < B : "+ (a < b));
//		System.out.println("A >= B : "+ (a >= b));
//		System.out.println("A <= B : "+ (a <= b));
//		System.out.println("A != B : "+ (a != b)); 	// != : 다른지 여부
//		System.out.println();
		
		
		
		// 04 논리연산자 
		
		// ### AND 연산자 (&&) ###
		
		// 1. 왼쪽이 거짓이라면 오른쪽을 연산하지 않는다.
		// 2. "&&" 연산자는 일반적으로 "||"연산자보다 우선순위가 높다
		// 3. "&&" 연산자의 결과는 논리값(참 또는 거짓)이다.
		
		// (조건식) && (조건식) 
		// (true) && (true) = (true)
		// 그 외는 모두 거짓
		// &&기호를 기준으로 왼/오른쪽 둘다 true 이면 true
		
		
		
		// ### OR 연산자 (||) ###	 
		
//		// 1. 왼쪽, 오른쪽 식 중 하나라도 참이면 True 값이 뜬다.
		// (조건식) || (조건식) 
		// (true)  || (true)  = (true)
		// (true)  || (false) = (true)
		// (false) || (true)  = (true) 
		// (false) || (false) = (false)
		// ||기호를 기준으로 왼/오른쪽 중 하나만 true 이면 true
		
		
		
		
		// ### NOT 연산자 (!), 논리부정연산자 ###
		// true이면 false, false 이면 true	
		
		
		

//		System.out.println("--------------- 논리 연산자 예제 ---------------");
//		
//		int a = 10; int b = 20;
//		
//		
//		System.out.println("--------------- AND 연산자(&&) 예제 ---------------");
//		//왼쪽이 false라면 오른쪽 연산은 하지도 않음.
//		System.out.println( (a >= b) && (a > 5) );
//		System.out.println( (a != b) && (b > 15) );
//		System.out.println();
//		
//		
//		System.out.println("--------------- OR 연산자(||) 예제 ---------------");
//		//왼쪽이 true라면 오른쪽으로 넘어가서 연산처리를 할 수밖에 없음.
//		System.out.println( (a >= b) || (a > 5) );
//		System.out.println( (a != b) || (b > 15) );
//		System.out.println( (a == b) || (a <= 5) );
//		System.out.println();
//		//똑같이 왼쪽이 먼저 true라면 오른쪽은 연산하지도 않음.
//		
//		System.out.println("--------------- NOT 연산자(!) 예제 ---------------");
//		boolean c = !(b > 30);			// false를 부정
//		System.out.println("C : " + c);
//		System.out.println();
		
		

		// 05 증감연산자
		
		// 1. 전치연산자(++a, --a) : 먼저 1 증가 및 감소 이후에 다른 연산 처리
		// 
		// 2. 후치연산자(a++, a--) : 다른 연산 처리 이후에 1 증가 및 감소
		
//		System.out.println("--------------- 증감 연산자 예제 ---------------");
//		int a = 10, b = 10, c, d;
//		c = --a;			// a = 9, c = 9
//		d = a--;			// d에 a의 값(9)를 먼저 담고, a 1 감소 ==> a = 8
//		System.out.printf("a=%d , b=%d , c=%d, d=%d", a, b, c, d);
		
		
		// 06 삼항연산자
		// (조건식) ? 참인 경우 실행코드 : 거짓인 경우 실행코드;
//		System.out.println("-------------------- 삼항 연산자 예제 ------------------------");
//		int score = 85;
//		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
//		System.out.println(score + "점은 " + grade + "등급입니다.");
//		System.out.println();
		
		

		// 01 홀수/짝수
		
		//사용자로부터 정수를 하나 입력받고,
		//연산자를 이용해 짝수면 짝수입니다를 출력, 
		//			 홀수면 홀수입니다를 출력
		
		//[결과값]
		//정수를 입력해주세요 : 12
		//결과 : 짝수입니다
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 하나 입력해주시면 짝/홀수 구분을 할게요 >>>");
//		int tmp_num = sc.nextInt();
//		
//		String result = (tmp_num % 2 == 0) ? "짝수입니다." : "홀수입니다.";
//		System.out.println("결과 : " + result);
//		
//		
//		if(tmp_num % 2 == 0) {
//			System.out.println("결과 : 짝수입니다.");
//		}
//		if (tmp_num % 2 == 1) {
//			System.out.println("결과 : 홀수입니다.");
//		}
		
		
		
		
		
		
		
		
		
		// 02 배수 구하기
		
		// 세 정수를 받아서 세 수의 합이 5의 배수인 경우
		// 5의 배수입니다 를 출력
		// 아닌 경우 5의 배수가 아닙니다 를 출력
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("첫번째 정수를 입력해주세요 >>> ");
//		int num1 = sc.nextInt();
//		
//		System.out.println("두번째 정수를 입력해주세요 >>> ");
//		int num2 = sc.nextInt();
//		
//		System.out.println("세번째 정수를 입력해주세요 >>> ");
//		int num3 = sc.nextInt();
//		
//		int sum = num1 + num2 + num3;
//		
//		String result = (sum % 5 == 0) ? "5의 배수입니다." : "5의 배수가 아닙니다.";
//		
//		System.out.println("결과 : " + result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
