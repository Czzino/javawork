package _06_polymorphismEx;

public class Buyer {
	// 물건 살떄 
	int money = 500;
	int bonusPoint; //초기값 0
	
	/*
	 * void buy(Computer com) {
	 * 
	 * }
	 * 
	 * void buy(Tv tv) {
	 * 
	 * }
	 * 
	 * void buy(GameDevice game) {
	 * 
	 * }
	 */
	
	// 자식타입이 부모타입 형변환
	void buy(Product p) {
		// 잔액보다 많을떄
		if(money < p.price) {
			System.out.println("잔액부족");
			return; //if문 종료 buy 함수 종료
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구입함");
	}
}
