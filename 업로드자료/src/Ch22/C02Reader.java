package Ch22;

import java.io.FileReader;
import java.io.Reader;

public class C02Reader {
	public static void main(String[] args) {
		// 파일 경로 설정
		String filepath = "c:\\testFolder\\test.txt";
		
		// MacOS
//		String filepath = "/Users/username/desktop/testFolder/test.txt";
		
		
		
		try {
			// FileReader를 사용하여 파일에서 텍스트를 읽기
			Reader in = new FileReader(filepath);
			// 파일에서 한 글자씩 읽어오기
			while(true)	 {
				int data = in.read();
				if (data == -1) {
					break;
				}
				System.out.print((char) data);
			}
			in.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
