package Ch19;


// ### ArrayIndexOutOfBoundsException ###

// 배열의 인덱스가 허용 범위를 벗어날 때 발생하는 예외.
// 이 예외는 실행 시간(RunTime)에 발생
// ==> 배열을 다루는 코드에서 인덱스 오류를 나타냄.


public class C02ArrayIdx {
	public static void main(String[] args) {
		try {
			int arr[] = {10, 20, 30};
			for (int i = 0; i < 5; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("예외 처리했지롱~ 실행되지롱~");
	}


}
