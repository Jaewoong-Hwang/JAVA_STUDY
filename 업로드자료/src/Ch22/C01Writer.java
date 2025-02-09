package Ch22;

import java.io.FileWriter;
import java.io.Writer;

public class C01Writer {
	public static void main(String[] args) {
		// 파일 경로 설정
		String filepath = "c:\\testFolder\\test.txt";
		
		// MacOS
//		String filepath = "/Users/username/desktop/testFolder/test.txt";
		
		
		
		try {
			// FileWriter를 사용하여 파일에 텍스트를 추가 (true : 기존 내용 유지, 파일 끝에 데이터(내용) 추가)
			Writer out = new FileWriter(filepath, true);
			
			// 추가할 텍스트 작성
			out.write("안녕하세요 \n");
			
			out.write("파일 테스트 중입니다. \n");
			out.write("파일을 생성하고 있습니다. \n");
			
			// 버퍼 비우기 & 스트림 닫기
			out.flush();
			out.close();
			System.out.println("텍스트 파일이 추가되었습니다. 확인해보세요 'ㅡ' !!!! ");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
