package Ch16;

public class C03Copy {
	public static void main(String[] args) {
//		
//		int[] test_arr = new int[5];
//		test_arr[0] = 10;
//		test_arr[1] = 20;
//		test_arr[2] = 30;
//		test_arr[3] = 40;
//		test_arr[4] = 50;
		
		int[] arr = {10, 20, 30, 40,50};
		
		System.out.println(arr);
		System.out.println(arr.hashCode());			// 내용을 기반으로 해싱 값 생성
		System.out.println(System.identityHashCode(arr));	// 물리적 위치(메모리)를 기반으로 해싱 값 생성
		System.out.println(System.identityHashCode(arr[0]));	// 물리적 위치(메모리)를 기반으로 해싱 값 생성
		System.out.println(System.identityHashCode(arr[1]));	// 물리적 위치(메모리)를 기반으로 해싱 값 생성
		System.out.println(System.identityHashCode(arr[2]));	// 물리적 위치(메모리)를 기반으로 해싱 값 생성
		System.out.println(System.identityHashCode(arr[3]));	// 물리적 위치(메모리)를 기반으로 해싱 값 생성
		System.out.println(System.identityHashCode(arr[4]));	// 물리적 위치(메모리)를 기반으로 해싱 값 생성
		
		
		// 얕은 복사 ( 메모리 주소값 복사 )
		// 같은 배열 객체를 가리키도록 만드는 복사
		// == 하나의 배열 객체를 여러개의 참조변수가 참조하는 형태
		
		int[] arr2 = arr;
		
		arr2[0] = 100;
		System.out.println(arr[0]);
		
		// 깊은 복사 ( 데이터 복사 )
		int[] arr3 = new int[5];
		
//		arr3[0] = arr[0];
//		arr3[1] = arr[1];
//		arr3[2] = arr[2];
//		arr3[3] = arr[3];
		
		// 어? 형식이 똑같고 0부터 3까지 인덱스번호만 순차적으로 증가하네? ==> 반복문 (while문, for문)
		
		// arr3 배열 객체의 데이터에 arr 배열객체의 데이터를 넣는 과정 == 깊은 복사 == 데이터 복사
		for(int i = 0; i < arr.length; i++) {
			arr3[i] = arr[i];
			System.out.println("arr3의 " + (i + 1) + "번째 요소값 : " + arr3[i]);
		}
		System.out.println("----------------------------------------------");
		
		arr3[0] = 2222;
		arr3[1] = 222;
		arr3[2] = 22;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr의 " + (i+1) + "번째 요소값 : " + arr[i]);
			System.out.println("arr3의 " + (i+1) + "번째 요소값 : " + arr3[i]);
			System.out.println();
		}
		
		
	}

}
