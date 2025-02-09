package Ch15;
//부모 클래스 : 호텔(Hotel)


class Hotel {
	String name;
	String location;
	
	public Hotel(String name, String location) {
		this.name = name;
		this.location = location;
	}

	
//	public void show() {
//		
//	}
	
	
}

class LuxuryHotel extends Hotel {
	// 별점
	int starCount;
	public LuxuryHotel (String name, String location, int starCount) {
		super(name, location);
		this.starCount = starCount;
	}
	@Override
	public String toString() {
		return "LuxuryHotel [starCount=" + starCount + ", name=" + name + ", location=" + location + "]";
	}
	
	
	
	
	

//	@Override
//	public void show() {
//		System.out.println("--------------------------------------------------");
//		System.out.println("==== 럭셔리 호텔 정보 ====");
//		System.out.println("호텔 이름 : " + name);
//		System.out.println("위치 : " + location);
//		System.out.println("별점 : " + starCount);
//		System.out.println("--------------------------------------------------");
//		System.out.println();
//	}
	
}

class ThemeHotel extends Hotel{
	// 테마
	String theme;
	public ThemeHotel (String name, String location, String theme) {
		super(name, location);
		this.theme = theme;
	}
	@Override
	public String toString() {
		return "ThemeHotel [theme=" + theme + ", name=" + name + ", location=" + location + "]";
	}
	
	
	
//	@Override
//	public void show() {
//		System.out.println("--------------------------------------------------");
//		System.out.println("==== 럭셔리 호텔 정보 ====");
//		System.out.println("호텔 이름 : " + name);
//		System.out.println("위치 : " + location);
//		System.out.println("테마 : " + theme);
//		System.out.println("--------------------------------------------------");
//		System.out.println();
//	}
	
	
}
public class C03PracHotel_Clean {
	public static void ShowInfo(Hotel obj) {
		System.out.println(obj.toString());
	
	}

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
