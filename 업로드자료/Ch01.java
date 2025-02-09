
import java.util.Scanner;
// ### 프로그래밍 ###
// 1. 프로그램 (Program) : 프로그램 언어로 이루어진 명령들의 집합
// ==> 컴퓨터의 프로그램을 작성하는 일

import Ch12.C04AccessModifier;

// 컴퓨터에게 수행할 작업을 지시하는 과정으로, 특정 프로그래밍 언어를 사용하여 인간의 의도를
// 컴퓨터가 이해하고 실행할 수 있는 코드로 표현하는 것을 말함.

// 2. 프로그램 언어 : 컴퓨터 시스템을 구동시키는 소프트웨어를 작성하기 위한 형식언어임.
// 한마디로 ==> 컴퓨터와의 대화에 사용되는 대화 수단

// ### 실행과정 ###

// 1. 한글, 영어 등등 Source Code 작성 후 실행 명령

// 2. 컴파일(Compile)과정 실행
//		--  저 / 고급언어로 작성된 프로그램을 기계어로 번역하는 것

// 3. 디버깅(Debugging)과정 실행
//		-- 버그 : 벌레 == 시스템 상의 버그 == 오류
//		-- 디버그 : 벌레를 잡는 것 == 오류를 잡는 행위
//		--       : 프로그램의 오류나 비정상적인 연산 등의 오류를 발견하고 그 원인을 밝혀서
//				 : 개발자에게 알려주는 행위

// 4. Run (실행) 완료 'ㅡ'

// ### 자바 실행과정 ###
// 1. Source Code 작성 후 실행 명령
// 2. Compiler에 의한 컴파일(Compile) --- 이때 ---> byte code 형태로 변환
//												++) 기계어 X
// 3. JVM(Java Virtual Machine, 인터프리터)에 Byte code 전달
// 4. 실행(Run)

// ### 프로그래밍 언어의 종류 ###
// C, C++, C#, Python, Java, Dart etc... 

// 1. C  (Compile 언어) 
//		-- C 자체로는 쓸 데가 없음, 임베디드 + 시스템

// 2. C++ (Compile 언어) 
// 		--게임 개발, 서버 개발

// 3. C#  (Compile + Interpreter 언어) 
//		-- 게임 개발(유니티), AR & VR, (얼리얼엔진), 보안

// 4. Java (Compile + Interpreter 언어)
//  	-- 웹(WebSite) + 앱(Application) 개발

// 5. Python (Interpreter 언어)
//		-- 만능 'ㅡ'b
//		-- 빅데이터, 인공지능, AI, 머신러닝, 딥러닝, 웹, 앱, 게임 etc...

// 01 JAVA 주석

// 주석 : 프로그램 코드 내에 삽입된 사용자의 메모를 의미
// ==> 코드 실행 결과에는 아무런 영향을 끼치지 않음.

// 쓰는 이유 : 1. 개발을 하다보면 코드 섹션(함수의 몸체)에 대한 설명이 필요함.
// 			 2. 협업할 때, 다른 개발자와의 의사소통에 필요.

// # 주석 사용법 #
//  // 		: 주석
//  /* */	: 여러 줄 주석
//  단축키	: Ctrl + /

// 02 JAVA의 기본구조

public class Ch01 { // 클래스 영역 - 객체 지향 코드 구현 단위
	// public class Ch01 : 1. public 클래스로 시작
					  // : 2. 클래스는 파일 이름과 동일해야 함.
	public static void main(String[] args) { // 메서드 영역 - 절차 지향 코드 구현 단위
												// main 메서드의 선언부
		// ## 메서드의 정의와 종류 ##
		// 0. 메서드(기능) : 특정 기능 수행, C언어의 함수 개념과 유사
		// 1. 메인 메서드 : 최초 실행되는 함수
		// 2. 라이브러리 메서드 : 개발편의를 위해서 미리 만들어져 제공되는 함수
		// 3. 사용자 정의 메서드 : 개발자가 정의한(만든) 함수

		// ### 유의사항 ###
		// 처음 복습 : 소괄호{))}부분만 복습하기
		// JAVA 2(6주차)가 끝나고 전체 복습하기

//		0. )) main 메서드	 	 : 프로그램의 진입점(entry point), 자바 가상 머신(Java Virtual Machine)은 이 메서드를 찾아 실행

//		1. public	 	 : main 메서드는 어디서든 접근할 수 있도록 public으로 선언해야 함.

//		2. static	 	 : main 메서드는 객체의 생성 없이 호출될 수 있도록 static으로 선언되어야 함.
//						   이는 JVM이 프로그램을 실행할 때 클래스의 인스턴스를 생성하지 않고 직접 호출 O -> 추후에 이해하면 Okay :)

//		3. void		 	 : main 메서드는 어떤 값을 반환하지 않도록 void로 선언되어야 함.

//		4. String[] args : main 메서드는 문자열 배열을 매개변수로 받음. 
//						   이 배열은 프로그램 실행 시에 명령행 인수(arguments)를 전달하기 위한 것
//		
//		5. )) 중괄호 {}		 : 내부에 프로그램 실행 시 실행될 코드 작성 --> 프로그램의 로직 구성

		System.out.println("Hello world"); // 출력 함수(메서드) 실행, Call이라고 함.
											// ';' : 코드의 마침표 역할
											// 모니터에 우리가 작성한 텍스트를 console 창에
											// 출력하는 역할(기능)

		// 03 ESCAPE 문자

		// '정보 표시' 목적으로 사용된 기존 그래픽문자(영소문자, 숫자, 특수문자)와는 다르게
		// '제어' 목적으로 사용되는 특수문자

		// \(역슬래쉬)를 앞에 붙여 사용
		// 1. \n : 개행(줄바꿈)

		// 2. \t : Tap Key의 약어
		// --> 탭키만큼 칸 이동
		// 3. \' : '(작은 따옴표) 출력
		// 4. \" : "(큰 따옴표) 출력
		// 4. \\ : \ 출력 (폴더 경로 구분시 잘 사용됨)
		System.out.println("Hello World");
		System.out.println("First Line.\nSecond Line\twith a tab");
		System.out.println("작은 따옴표 : \'\t큰 따옴표 : \"");
		System.out.println("역슬래쉬 : \\");
		System.out.println(); // 빈 줄 삽입

		// ## 표준 출력 함수 ##
		// System.out : 표준 출력 스트림
		// System.out.print() : 줄바꿈 X
		// System.out.println() : 줄바꿈 O(포함, ln == \n)
		// System.out.printf() : 서식문자를 사용할 수 있는 출력 메서드, printf의 의미(format : 형식, 서식)

		System.out.print("줄바꿈 X");
		System.out.println("줄바꿈 O");
		
		
		// 서식이란?  : 서류를 꾸미는 일정한 양식,
		// 서식문자란? : 서식공간에 자료를 대입하여 화면에 출력하거나 입력받기 위한 용도의 문자
		// %d : decimal의 약자		10진수(정수) 서식문자
		// %f : floating point의 약자 10진수(실수) 서식문자
		// %c : character의 약자		한문자 서식문자
		// %s : String의 약자			문자열 서식문자
		// %o : Octal의 약자			8진수(정수) 서식문자
		// %x : Hexadecimal의 약자	16진수(정수) 서식문자
		
		System.out.println("------------------ 서식문자 예제 ----------------------");
		System.out.printf("%d \n", 100);
		System.out.printf("%d \n", 100 + 200);
		System.out.printf("%d %d %d \n", 1, 2, 3);
		
		System.out.printf("%f \n", 123.5);
		System.out.printf("%f \n", 1.1);
		System.out.printf("%.2f \n", 2.1); 			// %.2f : 소수점 둘째 자리 (실수 서식문자)
		
		System.out.printf("%c \n", 'A');
		
		System.out.printf("%s \n", "JAVA");
		// '' 안에는 하나의 문자만 컴파일러가 해석하기 때문에 한문자 이상이며 ERROR
		// 서식문자와 대입하는 값의 타입(종류)가 다르면 ERROR
		// Ex)
//		System.out.printf("%d", "안녕");
		
		
		
//		 문제 01)
//		다음과 같이 출력 합니다.
//		NO	이름			나이		성별		주소
//		1	이동하		26		M		대구
//		2	코리아		12		W		대구
//		3	IT			32		M		대구
		
		
		// 풀이 순서를 먼저 생각하기.
		// 1. 위와 같이 출력하려면 print 출력함수를 사용해야겠구나.
		// 1-1. 출력함수를 사용할때, 방법이 두가지로 나뉘겠네?
		
		// 2. 서식문자를 이용하는 방법
		System.out.printf("%s	%s	%s	%s	%s \n", "NO", "이름", "나이", "성별", "주소");
		System.out.printf("%d	%s	%d	%c	%s \n", 1, "이동하", 26, 'M', "대구");	// 직접 tab키를 이용해도 \t 탈출 문자를 사용하는 것과 동일한 결과를 낼 수 있다.
		System.out.printf("%d\t%s\t%d\t%c\t%s \n", 2, "코리아", 12, 'W', "대구");  // \t 탈출 문자를 사용한 경우
		System.out.printf("%d\t%s\t%d\t%c\t%s \n", 3, "IT", 32, 'W', "대구");  // \t 탈출 문자를 사용한 경우
		
		System.out.println("-----------------------------------------");
		
		// 3. 그냥 하드코딩해서 출력하는 방법
		System.out.println("NO\t이름\t나이\t성별\t주소");
		System.out.println("1\t이동하\t26\tM\t대구");
		System.out.println("2\t코리아\t12\tW\t대구");
		System.out.println("3\tIT\t32\tW\t대구");
		
		
		
		// 문제 02
		// 서식문자를 사용하여 다음과 같은 결과값을 출력해보세요 !!
		// 
		// [결과값]
		// 이름 : 이동하
		// 나이 : 12
		// 성별 : M
		// 키   : 192.200000
		// 주소 : "대구광역시 중구 중앙대로 366 9층"
		
		System.out.printf("이름 : %s\n", "이동하");
		System.out.printf("나이 : %d\n", 12);
		System.out.printf("성별 : %c\n", 'M');
		System.out.printf("키 : %f\n", 192.2);
		System.out.printf("주소 : %s\n", "\"대구광역시 중구 중앙대로 366 10층\"");
		

	}
}
