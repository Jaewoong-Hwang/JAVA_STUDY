package Ch16;

import java.util.Scanner;

public class C02PracStudent {
	public static void main(String[] args) {
		
		// 문제
		// 5명의 학생의 국어 점수를 입력받아 출력을 해보자!!!
		// [결과값]
		// 1번째 학생의 국어 점수를 입력해주세요 >>> 90
		// 2번째 학생의 국어 점수를 입력해주세요 >>> 100
		// 3번째 학생의 국어 점수를 입력해주세요 >>> 86
		// 4번째 학생의 국어 점수를 입력해주세요 >>> 74
		// 5번째 학생의 국어 점수를 입력해주세요 >>> 95
		//------------------------------------------------
		// 1번째 학생 국어 점수 : 90
		// 2번째 학생 국어 점수 : 100
		// 3번째 학생 국어 점수 : 86
		// 4번째 학생 국어 점수 : 74
		// 5번째 학생 국어 점수 : 95
		//
		
		Scanner sc = new Scanner(System.in);
		int [] score_arr = new int[5];
		
		
		for(int i = 0; i < 5; i++) {
			System.out.println( (i+1) + "번째 학생의 국어 점수를 입력해주세요 >>> " );
			// Scanner 입력이 필요하겠다.
			score_arr[i] = sc.nextInt();
		}
	
		for (int i = 0; i < score_arr.length; i++) {
			System.out.println((i+1) +"번쨰 학생 국어 점수 : " + score_arr[i]);
		}
		
		
	
	}

}
