package Ch22;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
class Memo {
	private String title;
	private String content;
	
	// Parameter Constructor
	public Memo(String title, String content) {
		this.title = title;
		this.content = content;
	}

	//getter
	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}
	
	
}
public class C01Prac {
	
	// Key : Value   == 제목, 내용
	private static Map<String, Memo> map = new HashMap();
	
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int num;
		String title = null;
		String contents = "";
		
		while (true) {
			System.out.println("-------------- M E M O ---------------");
			System.out.println("1. 메모하기");			
			System.out.println("2. 불러오기");			
			System.out.println("3. 파일로 저장");			
			System.out.println("4. 종료");
			System.out.println("-------------- M E M O ---------------");
			System.out.print("번호 입력 >>> ");
			num = sc.nextInt();
			
			switch(num) {
			case 1:
				sc.nextLine();
				System.out.println("-------------- MEMO INSERT MODE --------------");
				System.out.println("제목 입력 >>>");		// map의 Key로 저장
				title = sc.nextLine();			// 오후할일
				// 동일한 제목의 데이터가 존재한다면 
				// ex) map 저장구조 안에      "오후할일"(Key) : "빨래"(Value)  이런 데이터가 이미 있다면 
				if (map.containsKey(title)) {
					System.out.println("기존과 동일한 제목이 있습니다");
					break;
				}
				System.out.println("내용 입력 (종료 : -1) >>>");
				while (true) {
					String tmp = sc.nextLine();
					if (tmp.contains("-1")) {
						break;
					}
					contents += tmp+"\n";
				}
				map.put(title, new Memo(title, contents));
				contents = "";
				System.out.println("메모가 저장되었습니다.");
				System.out.println();
				
				break;
				
				
				
			case 2:
				sc.nextLine();
				System.out.print("불러올 메모의 제목 입력 >>>");
				title = sc.nextLine();
				// 제목에 맞는 메모 객체를 불러오는 과정
				Memo memo = map.get(title);
				// 불러왔는데, 그런 제목의 메모가 없다면
				if (memo == null) {
					System.out.println("제목과 일치하는 내용이 없습니다.");
					System.out.println();
				} else {
					System.out.println("내용 : \n" + memo.getContent());
					System.out.println();
			
				}
				break;
				
			case 3:
				sc.nextLine();
				System.out.println("임시 저장된 제목 리스트를 보여드릴게요!!!");
				// map.keySet() : Key들을 모아서 Set자료형에다가 넣어서 반환
				Set<String> set = map.keySet();
				int i = 1;
				for (String key : set) {
					System.out.println((i++) + " " + key);
				}
				System.out.println("--------------------------------------");
				System.out.println();
				
				System.out.println("저장할 메모 제목을 입력하세요 >>>");
				title = sc.nextLine();
				memo = map.get(title);
				if (memo == null) {
					System.out.println("선택된 제목이 존재하지 않습니다.");
					break;
				}
				
				
				// 선택한 제목이 임시저장된 제목과 동일한 제목이라면
				// 파일로 저장
				String filepath = "c:\\testFolder\\" + title + ".txt";
				
				Date now = new Date();
				Writer out = new FileWriter(filepath, true);
				
				out.write("\n-------------------" + now + "-------------------\n");
				out.write(memo.getContent());
				out.flush();
				out.close();
				System.out.println("파일에 저장했습니다.");
				break;
				
				
			case 4:
				System.out.println("메모하기를 종료합니다.");
				System.exit(-1);
				
			default:
				System.out.println("다시 입력하세요 !!! ");
				System.out.println();
				
			}
			
			
			
		}
		
		
	}

}
