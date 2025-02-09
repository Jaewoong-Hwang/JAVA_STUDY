package Ch15;
//부모 클래스 : 호텔(Hotel)

//
//class Hotel {
//	String name;
//	String location;
//	
//	public Hotel(String name, String location) {
//		this.name = name;
//		this.location = location;
//	}
//}
//
//class LuxuryHotel extends Hotel {
//	// 별점
//	int starCount;
//	public LuxuryHotel (String name, String location, int starCount) {
//		super(name, location);
//		this.starCount = starCount;
//	}
//}
//
//class ThemeHotel extends Hotel{
//	// 테마
//	String theme;
//	public ThemeHotel (String name, String location, String theme) {
//		super(name, location);
//		this.theme = theme;
//	}
//	
//	
//}
//[결과값]
//=== 럭셔리 호텔 정보 ===
//호텔 이름 : 힐튼
//위치     : 서울
//별점	   : 5 stars

//=== 테마 호텔 정보 ===
//호텔 이름 : 디즈니 호텔
//위치	   : 파리
//테마     : 디즈니 캐릭터 테마

public class C03PracHotel {
	//------------------------------------ UpCasting과 DownCasting을 몰랐던 경우 ----------------------------
//	public static void ShowInfo(LuxuryHotel obj) {
//		System.out.println("--------------------------------------------------");
//		System.out.println("==== 럭셔리 호텔 정보 ====");
//		System.out.println("호텔 이름 : " + obj.name);
//		System.out.println("위치 : " + obj.location);
//		System.out.println("별점 : " + obj.starCount);
//		System.out.println("--------------------------------------------------");
//		System.out.println();
//		
//	}
//	
//	public static void ShowInfo(ThemeHotel obj) {
//		System.out.println("--------------------------------------------------");
//		System.out.println("==== 테마 호텔 정보 ====");
//		System.out.println("호텔 이름 : " + obj.name);
//		System.out.println("위치 : " + obj.location);
//		System.out.println("테마 : " + obj.theme);
//		System.out.println("--------------------------------------------------");
//		System.out.println();
//	}
// ---------------------------------------------------------------------------------------------------------
	
	
	
	
	// ---------------------------------------------UPCASTING && DOWNCASTING ----------------------------------------	
//	public static void ShowInfo(Hotel obj) { 			// 자동 업캐스팅 발생
//														// Hotel obj = lxH;
//														// Hotel obj = tmH;
//		
//		if(obj instanceof LuxuryHotel) {
//			System.out.println("--------------------------------------------------");
//			System.out.println("LuxuryHotel의 다운캐스팅을 진행하겠습니다.");
//			LuxuryHotel down = (LuxuryHotel) obj;
//			System.out.println("호텔 이름 : " + down.name);
//			System.out.println("위치 : " + down.location);
//			System.out.println("별점 : " + down.starCount);
//			System.out.println("--------------------------------------------------");
//			System.out.println();
//		} else if (obj instanceof ThemeHotel) {
//			System.out.println("--------------------------------------------------");
//			System.out.println("ThemeHotel의 다운캐스팅을 진행하겠습니다.");
//			ThemeHotel down = (ThemeHotel) obj;
//			System.out.println("호텔 이름 : " + down.name);
//			System.out.println("위치 : " + down.location);
//			System.out.println("테마 : " + down.theme);
//			System.out.println("--------------------------------------------------");
//		}
//		
//	}
// ---------------------------------------------------------------------------------------------------------
	

	public static void main(String[] args) {
		// 럭셔리 호텔 객체 생성
		LuxuryHotel lxH = new LuxuryHotel("힐튼", "서울", 5);
		
		// 테마 호텔 객체 생성
		ThemeHotel tmH = new ThemeHotel("디즈니 호텔", "파리", "디즈니 캐릭터 테마");
		ShowInfo(lxH);		// 럭셔리 호텔 정보 출력
		System.out.println();
		ShowInfo(tmH);		// 테마 호텔 정보 출력
		
		
		
	}

}
