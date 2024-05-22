package _08_polymorphismArrayList;

public class Product {
	// 제품 
	int price;  // 가격
	int bonusPoint; // 보너스 포인트
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price * 0.05); // 5퍼센트 나누기 몫값
		
	}
}
