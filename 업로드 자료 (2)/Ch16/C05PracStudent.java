package Ch16;

import java.util.Scanner;

public class C05PracStudent {
	public static void main(String[] args) {
		// 문제
		// 5명의 학생의 국/영/수 점수를 입력받아 출력을 해보자!!
		
		// [출력예]
//		// 1번쨰 학생 점수입력(국/영/수 순서) : 100 70 60
//		// 2번쨰 학생 점수입력(국/영/수 순서) : 99 98 66
//		// 3번쨰 학생 점수입력(국/영/수 순서) : 99 88 77
//		// 4번쨰 학생 점수입력(국/영/수 순서) : 100 55 66
//		// 5번쨰 학생 점수입력(국/영/수 순서) : 55 66 77
		
		Scanner sc = new Scanner(System.in);
		
		int[][] std_score = new int[5][3];
		
		for (int i = 0; i < std_score.length; i++) {
			System.out.print( (i + 1) + "번째 학생 점수입력(국/영/수 순서) : ");
			for (int j = 0; j < std_score[i].length; j++) {
				std_score[i][j] = sc.nextInt();
			}
		}
		
		//각행의 합 과 전체 합
		// 각행의 평균 전체 평균을 출력하세요
		
		// [출력예]
//		// 1번째 학생 총점 : ? 평균 ?
//		// 2번째 학생 총점 : ? 평균 ?
//		// 3번째 학생 총점 : ? 평균 ?
//		// 4번째 학생 총점 : ? 평균 ?
//		// 5번째 학생 총점 : ? 평균 ?
		
		// 3과목에 대한 누적 합과 평균을 저장해줄 변수
		int sum = 0;
		double average = 0;
		for (int i = 0; i < std_score.length; i++) {
			sum = 0;
			for (int j = 0; j < std_score[i].length; j++) {
				// 각 학생의 국/영/수 점수를 sum에 더하는 로직.
				sum += std_score[i][j];
			}
			// sum을 구했다. == 다음 반복(다음 학생의 국/영/수 총점, 평균을 구하는 로직을 실행하기) 전에 평균을 구해서 출력해야함.
			average = (double) sum / 3;
			System.out.println((i+1) + "번째 학생의 총점 : " + sum + " 평균 : " + average);
		}
		
		
		int ksum = 0;
		int esum = 0;
		int msum = 0;
		
		double kavg = 0;
		double eavg = 0;
		double mavg = 0;
		
//		// 국어 총점 : ? 국어 평균 : ?
//		// 영어 총점 : ? 영어 평균 : ?
//		// 수학 총점 : ? 수학 평균 : ?
		
		for (int i = 0; i < std_score.length; i++) {
			
			 ksum += std_score[i][0];
			 esum += std_score[i][1];
			 msum += std_score[i][2];
		}
		// 각 과목의 평균
		kavg = (double) ksum / 5;
		eavg = (double) esum / 5;
		mavg = (double) msum / 5;
		System.out.printf("국어 총점 : %d 국어 평균 : %f\n", ksum, kavg);
		System.out.printf("영어 총점 : %d 영어 평균 : %f\n", esum, eavg);
		System.out.printf("수학 총점 : %d 수학 평균 : %f\n", msum, mavg);
		
		
		
		
		
		
		
	}
}
