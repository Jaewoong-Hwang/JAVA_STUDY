package Ch15;

//부모 클래스 : SmartPhone

//속성
//인치(사이즈)
//배터리 용량
class SmartPhone {
	private int inch;
	private int battery;
	
	public SmartPhone(int inch, int battery) {
		this.inch = inch;
		this.battery = battery;
	}
	public int getInch() {
		return inch;
	}
	public int getBattery() {
		return battery;
	}
}
//==========================================================
//자식 클래스 : SmartPhoneWithCamera
//
//속성
//카메라 해상도(메가픽셀)

//기능
//printDetails() 	: 스마트폰의 속성 정보 출력

class SmartPhoneWithCamera extends SmartPhone {
	private int cameraResolution;
	
	public SmartPhoneWithCamera (int inch, int battery, int cameraResolution) {
		super(inch, battery);
		this.cameraResolution = cameraResolution;
	}

	public void printDetails() {
		System.out.println("[스마트폰 정보 출력]");
		System.out.println(getInch()+ "인치");
		System.out.println(getBattery() + "mAh");
		System.out.println(cameraResolution + "MP");
		
	}
	
}
public class C02PracSmartPhone {
	public static void main(String[] args) {
		// SmartPhoneWithCamera 객체 생성
		// 														인치, 배터리용량, 카메라 해상도(메가픽셀)
		SmartPhoneWithCamera myPhone = new SmartPhoneWithCamera(6, 4000, 108); 	
		// 스마트폰 속성 출력
		myPhone.printDetails();					
		// [결과값]
		// 6인치
		// 4000mAh
		// 108MP 
	}
}
