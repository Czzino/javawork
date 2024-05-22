package _08_polymorphismArrayList;

import java.util.ArrayList;

public class Buyer {
	// 물건 살떄
	int money = 500;
	int bonusPoint;
	ArrayList<Product> cart = new ArrayList<Product>();
	// Product[] cart = new Product[10];

	void buy(Product p) {
		// 잔액보다 많을떄
		if (money < p.price) {
			System.out.println("잔액부족");
			return; // if문 종료 buy 함수 종료
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart.add(p); // 배열의 끝에 추가
		System.out.println(p + "를 구입함");
	}

	void info() {
		int sum = 0;
		String list = "";

		if (cart.isEmpty()) {
			System.out.println("구입한 제품이 없습니다");
			return;
		}

		for (int i = 0; i < cart.size(); i++) {
			Product p1 = cart.get(i); // 자료형이 Product 저장
			sum += p1.price;
			list += p1 + ", "; // null 오류
		}
		System.out.println("구입한 물품의 총액 : " + sum + "만원입니다");
		System.out.println("구입한 물품의 목록 : " + list);

	}
	
	// 반품 제품이 있고 없고
	void refund(Product p) {
		if(cart.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "반품");
		} else {
			System.out.println("구입하지 않은 상품입니다");
		}
	}
	
	
	
	
}
