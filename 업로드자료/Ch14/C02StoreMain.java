package Ch14;
class Customer {
	// 속성
	int myMoney;			// 보유금액
	int colaCnt;			// 콜라보유량
	// 기능
	public Customer(int myMoney, int colaCnt) {
		this.myMoney = myMoney;
		this.colaCnt = colaCnt;
	}
	
	// 구매하기
	public void pay(Store store, int money){
		// 1. 보유금액(지갑) -= 지불할 금액
		myMoney -= money;
		// 2. 지정된 편의점 객체에 money를 전달.
		colaCnt += store.function1(money);
		
	}
	@Override
	public String toString() {
		return "Customer [myMoney=" + myMoney + ", colaCnt=" + colaCnt + "]";
	}
	
}


class Store  {
	// 속성
	private int savedMoney;			// 보유금액
	private int colaCnt;			// 콜라재고량
	private int price;				// 콜라가격
	public Store(int savedMoney, int colaCnt, int price) {
		this.savedMoney = savedMoney;
		this.colaCnt = colaCnt;
		this.price = price;
	}
	// 기능
	public int function1(int money) {
		// 1. 돈을 돈통에 넣기
		savedMoney += money;
		// 2. 내 매장의 재고량 -= 손님이 사려는 콜라 개수
		int cnt = money / price;		// 손님이 사려는 콜라개수
		colaCnt -= cnt;					// 내 재고량 -= 손님콜라개수
		
		// 3. 콜라개수를 돌려줌(손님에게)
		return cnt;
		
		
	}
	
	@Override
	public String toString() {
		return "Store [savedMoney=" + savedMoney + ", colaCnt=" + colaCnt + ", price=" + price + "]";
	}
	
}

public class C02StoreMain {
	public static void main(String[] args) {
		Customer dong = new Customer(10000, 0);
		
		Store 반월CU = new Store(100000, 100, 1000);
		Store 대구역GS = new Store(250000, 12, 500);
		
		dong.pay(대구역GS, 2000);
		
		System.out.println(dong);
		System.out.println(대구역GS);
			
		
		
		
		
	}
	
}
