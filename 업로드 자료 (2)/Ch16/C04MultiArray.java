package Ch16;

public class C04MultiArray {
	public static void main(String[] args) {

		
		// 이차원배열 [행][열]
		// 이차원 배열의 각 행마다의 배열 길이가 동일할 때
		int [][] arr = new int[2][4];
		
		
		
		
		// ### 중요!! ###
		// 밑에 이중 for문 arr_test로 바꾸어서 복습해보기!!!!
		// ###       ###
		
		
		// 이차원 배열의 각 행마다의 배열 길이가 다를 때
//		int [][] arr_test = {
//				
//				{1, 2},
//				{1, 2, 3},
//				{1, 2, 3, 4},
//				{1, 2, 3, 4, 5}
//				
//		};
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;
		
		arr[1][0] = 11;
		arr[1][1] = 22;
		arr[1][2] = 33;
		arr[1][3] = 44;
		
		System.out.println("행 개수 : " + arr.length);
		System.out.println("0행 열 개수 : " + arr[0].length);
		System.out.println("1행 열 개수 : " + arr[1].length);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
