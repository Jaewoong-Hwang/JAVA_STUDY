import java.util.Scanner;

public class Ch10 {
	public static void main(String[] args) {
		
		// 중첩 while문
		
		// 문제
		// 구구단 2단 출력
//		System.out.println("2 X 1 = 2");
//		System.out.println("2 X 2 = 4");
//		System.out.println("2 X 3 = 6");
//		System.out.println("2 X 4 = 8");
//		System.out.println("2 X 5 = 10");
//		System.out.println("2 X 6 = 12");
//		System.out.println("2 X 7 = 14");
//		System.out.println("2 X 8 = 16");
//		System.out.println("2 X 9 = 18");
//		
//		int dan = 2;
//		int i = 1;
//		while (i <= 9) {
//			System.out.printf("%d X %d = %d\n", dan, i, dan * i);
//			i++;
//		}
//		int dan = 3;
//		int i = 1;
//		while (i <= 9) {
//			System.out.printf("%d X %d = %d\n", dan, i, dan * i);
//			i++;
//		}
//		int dan = 4;
//		int i = 1;
//		while (i <= 9) {
//			System.out.printf("%d X %d = %d\n", dan, i, dan * i);
//			i++;
//		}
//		
		
//		int dan = 2;
//		while (dan <= 9) {
//			// dan이 2일 때 로직
//			int i = 1;
//			while (i <= 9) {
//				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
//				i++;
//			}
//			dan++;
//			System.out.println();
//		}
		
	      //문제
		//구구단 2단 출력
		
		//문제
		//구구단 2단 출력(역순출력)
		
//		int dan = 2;
//		int i = 9;
//		while (i >= 1) {
//			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
//			i--;
//		}
//		
		
		
		//문제
		//구구단 N단 출력(입력받기)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("수 하나 입력하세요 >>> ");
//		int num = sc.nextInt();
//		
//		int dan = num;
//		int i = 1;
//		while (i <= 9) {
//			System.out.printf("%d X %d = %d\n", dan, i, dan * i);
//			i++;
//		}
		
		
		
		//문제
		//구구단 N단 출력(입력받기,역순출력) (별첨 ... 2<=N<=9)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("수 하나 입력하세요 >>> ");
//		int num = sc.nextInt();		//전체 구구단(2단-9단) 출력하기
//		
//		int dan = num;
//		int i = 9;
//		while (i >= 1) {
//			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
//			i--;
//		}	
		
		//N부터 9단까지 전체 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.println("수 하나 입력하세요 >>> ");
//		int num = sc.nextInt();		//전체 구구단(2단9단) 출력하기
//		
//		
//		int dan = num;
//		while (dan <= 9) {
//			int i = 1;
//			while(i <= 9) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
//				i++;
//			}
//			dan++;
//			System.out.println();
//		}
		
		
		
		
		
		//전체 구구단(2단-9단) 출력하기 (단만 역순출력)
//		int dan = 9;
//		while (dan >= 2) {
//			int i = 1;
//			while(i <= 9) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
//				i++;
//			}
//			dan--;
//			System.out.println();
//		}	
		//전체 구구단(2단-9단) 출력하기 (전체 역순출력)
//		int dan = 9;
//		while (dan >= 2) {
//			int i = 9;
//			while(i >= 1) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
//				i--;
//			}
//			dan--;
//			System.out.println();
//		}	
		//1
		//*****
		//*****
		//*****
		//*****
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
		
//		int i = 1;
//		while(i <= 4) {
//			System.out.println("*****");
//			i++;
//		}
//		
//		
//		int i = 1;
//		while(i <= 4) {
//			int j =1;
//			while(j <= 5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		
		
		//높이 : n
		//*****
		//*****
		//*****
		//*****
//		Scanner sc = new Scanner(System.in);
//		System.out.println("높이 입력 ㄱㄱ >>> ");
//		int height = sc.nextInt();
//		
//		int i = 1;
//		while(i <= height) {
//			int j =1;
//			while(j <= 5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
////		
		
		
		//2
		//*
		//**
		//***
		//****
//		
//		int i = 1;
//		while (i <= 4) {
//			int j = 1;
//			while (j <= i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		//높이 : 4
		//*
		//**
		//***
		//****
//		Scanner sc = new Scanner(System.in);
//		System.out.println("높이 입력 ㄱㄱ >>> ");
//		int height = sc.nextInt();
//		
//		int i = 1;
//		while (i <= height) {
//			int j = 1;
//			while (j <= i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}	
		
		//3
		//****
		//***
		//**
		//*
//		int i = 1;
//		while(i <= 4) {
//			int j = 1;
//			while (j <= 5-i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		
		
		
		//높이 : 4
		//****
		//***
		//**
		//*	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("높이 입력 ㄱㄱ >>> ");
//		int height = sc.nextInt();
//		
//		int i = 1;
//		while(i <= height) {
//			int j = 1;
//			while (j <= height + 1 - i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		//4
		//   *
		//  ***
		// *****
		//*******
		
		//---*
		//--***
		//-*****
		//*******
//		
//		int i = 1;
//		while(i <= 4) {
//			// i = 1일 떄 공백을 3번 반복
//			// i = 2일 떄 공백을 2번 반복
//			int j = 1;
//			while(j <= 4 - i) {
//				System.out.print(" ");
//				j++;
//			}
//			// i = 1일 때 별을 1번 반복
//			// i = 2일 때 별을 3번 반복
//			int k = 1;
//			while(k <= 2 * i - 1) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
//		
		
		
		
		

		
		
		
	}
}
