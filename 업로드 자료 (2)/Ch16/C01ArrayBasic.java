package Ch16;

import java.util.Scanner;

// 00 배열 (Array)
// 배열이란? : 연관된 데이터를 각각의 인덱스 번호를 할당하여 나열한 자료 구조 형태
// 인덱스  	0			1		2		3		4
// 자료	[	12,			123,	32,		769,	12 ]
// 이때 배열의 인덱스 번호로 배열 안의 자료(데이터)에 접근할 수 있음.

// Index : 색인
//		 : ==> 필요한 정보를 쉽게 찾을 수 있도록 하는 것
//		 :    Ex) 책의 인덱스, 즉 목차를 말함

// 01 배열의 필요성
// Ex) 병원에서 환자의 번호를 매겨야할 때
// int patient01;
// int patient02;
// ...
// int patient9999;

// 이런식으로 같은 작업 반복의 연속

// 배열을 사용하게 되면
// int[] patient = new int[9999];			// 크기가 9999이고 자료형이 int 자료인 정수배열 patient 선언
//											// 인덱스 0부터 9998까지의 정수를 담을 수 있음.

// 이런식으로 간단하게 정리할 수 있기에 배열은 꼭 필요한 자료구조임.

// 인덱스를 사용하면 요소에 대한 접근이 용이함.

// patient[0] = 10;		// patient 배열의 첫번째 요소에 10을 저장
//						// 배열의 인덱스는 0부터 시작이기 때문에 0이 첫번째 요소
public class C01ArrayBasic {
	public static void main(String[] args) {
		// 길이가 5인 int형 1차원 배열의 생성
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[5];
		
		arr1[0] = sc.nextInt();
		arr1[1] = sc.nextInt();
		arr1[2] = sc.nextInt();
		arr1[3] = sc.nextInt();
		arr1[4] = sc.nextInt();
		
		// 배열의 순회
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		double[] arr2 = new double[7];
		
		// 배열의 참조변수와 인스턴스 생성 분리 가능
		float[] arr3;
		arr3 = new float[9];
		
		// 배열의 인스턴스 변수 접근
		System.out.println("배열 arr1 길이 : " + arr1.length);
		System.out.println("배열 arr2 길이 : " + arr2.length);
	}

}
