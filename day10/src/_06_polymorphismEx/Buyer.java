package _06_polymorphismEx;

public class Buyer {
	// 물건 살떄 
	int money = 500;
	int bonusPoint; //초기값 0
	Product[] cart = new Product[10]; // 객체 초기화할떄 값이 null
	int index = 0;
	
	
	void buy(Product p) {
		// 잔액보다 많을떄
		System.out.println(p);
		if(money < p.price) {
			System.out.println("잔액부족");
			return; //if문 종료 buy 함수 종료
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[index++] = p;
		System.out.println(p + "를 구입함");
	}
	
	// 물건을샀을떄 합계
		void info() {
		int sum = 0;
		String list = "";
		
		for(int i=0; i<cart.length; i++) {
			if(cart[i]==null) {
				break;
			}
			sum += cart[i].price;
			list += cart[i] + ", "; // null 오류
		}
		System.out.println("구입한 물품의 총액 : " + sum + "만원입니다");
		System.out.println("구입한 물품의 목록 : " + list);

	}
}
