package Ch14;

class Seller {
	private int savedMoney;
	private int appleCnt;
	private int price;
	
	public Seller(int savedMoney, int appleCnt, int price) {
		this.savedMoney = savedMoney;
		this.appleCnt = appleCnt;
		this.price = price;
	}
	
	public int sell(int money) {
		savedMoney += money;
		int cnt = money / price;
		appleCnt -= cnt;
		return cnt;
	}

	@Override
	public String toString() {
		return "Seller [savedMoney=" + savedMoney + ", appleCnt=" + appleCnt + ", price=" + price + "]";
	}
}

class Buyer {
	int myMoney;
	int appleCnt;
	public Buyer(int myMoney, int appleCnt) {
		this.myMoney = myMoney;
		this.appleCnt = appleCnt;
	}
	
	public void pay(Seller seller, int money) {
		myMoney -= money;
		// seller의 savedMoney에 접근할 수 있는 방법!?
		int cnt = seller.sell(money);
		
		appleCnt += cnt;
		
	}

	@Override
	public String toString() {
		return "Buyer [myMoney=" + myMoney + ", appleCnt=" + appleCnt + "]";
	}
}


public class C03AppleMain {
	
	public static void main(String[] args) {
		Seller cat = new Seller(10000, 100, 1000);		// 보유금액, 사과개수, 사과가격
		Seller dog = new Seller(32000, 32, 800);		// 보유금액, 사과개수, 사과가격
		
		Buyer dong = new Buyer(5000, 0);				// 보유금액, 사과보유량
		
		dong.pay(cat, 2000);
		
		System.out.println(cat); 						//보유금액, 사과개수 출력   // 12000, 98, 1000
		System.out.println(dong); 						//보유금액, 사과개수 출력   // 3000, 2
	}
}
