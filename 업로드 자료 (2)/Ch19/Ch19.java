package Ch19;

import java.util.Scanner;

// ### 예외 처리 ###
// 1. 예외 처리 : 프로그램 실행 중에 예외가 발생할 수 있는 상황에 대비하여 적절한 조치를 취하는 것을 의미
// 2. 예외 : 프로그램의 정상적인 흐름을 방해하거나 중단할 수 있는 상황을 나타냄.

// try-catch문은 예외 처리를 위한 JAVA의 기본적인 구문임.
// JAVA 프로그램에서 예외가 발생할 수 있는 코드 블록을 try 블록내에 배치하고,
// 예외가 발생할 경우에 대한 처리를 catch 블록에서 수행함.

// try 블록			: 예외가 발생할 수 있는 코드를 포함하는 블록임.
// catch 블록			: try 블록에서 발생한 예외를 처리하는 블록임.
//					: 여러 개의 catch 블록을 사용하여 다양한 종류의 예외를 처리할 수 있음.

// finally 블록 		: try 블록이나 catch 블록에서 리턴되더라도
//					: 항상 실행되어야 하는 블록임.

// ## 예외 종류 ##

// 1. 컴파일 타임 예외 (Checked Exception ) 		
// 발생 시점 -- 컴파일 시에 발생하는 예외로, 프로그램이 컴파일 될 때 확인됨.
// 처리 여부 -- 반드시 예외를 처리해야 함.
//		   -- 처리하지 않으면 컴파일이 되지 않음.

// IOException 		: 입출력 작업 도중 발생하는 예외
// SQLException		: 데이터베이스와 관련된 예외
// ClassNotFoundException : 클래스를 찾을 수 없는 경우 발생하는 예외
// InterruptedException   : 스레드가 중단될 때 발생하는 예외 등.

// 2. 런타임 예외 (Unchecked Exception)
// 발생 시점 -- 런타임 시에 발생하는 예외로, 프로그램 실행 중에 확인됨.
// 처리 여부 -- 명시적인 예외 처리가 필요하지 않음. 개발자가 필요하다고 판단하면 예외를 처리할 수 있지만, 강제로 처리할 필요는 없음.

// NullPointerException : null 객체에 접근할 때 발생하는 예외.
// ArrayIndexOutOfBoundsException : 배열의 범위를 벗어난 인덱스에 접근할 때 발생하는 예외.
// ArithmeticException			  : 산술 연산 중 발생하는 예외.
// IllegalArgumentException		  : 잘못된 인수가 전달될 떄 발생하는 예외
// IllegalStateException		  : 객체의 상태가 메서드 호출에 부적절한 경우 발생하는 예외 등.
public class Ch19 {
	public static void main(String[] args) {
		
		
		
		
		// 고전적인 예외 처리
//		Scanner sc = new Scanner(System.in);
//		int test = sc.nextInt();
//		int test1 = sc.nextInt();
//		
//		
//		if (test1 != 0) {
//			int num = test / test1;
//			System.out.println(num);
//		} else {
//			System.out.println("0으로 나눌 수 없습니다.");
//		}
		
		
		
		// 현대적인 예외 처리
		try {
			Scanner sc = new Scanner(System.in);
			int test = sc.nextInt();
			int test1 = sc.nextInt();
			int num = test / test1;
			System.out.println(num);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("나눈 후 코드");
		
		
		
		
		
		
		
		
		
		
	}

}
