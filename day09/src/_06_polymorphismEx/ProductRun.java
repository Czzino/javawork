package _06_polymorphismEx;

public class ProductRun {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		b.buy(new Tv()); // 1번째 주소 값이 들어오고 함수종료
		
		b.buy(new Computer());
		b.buy(new GameDevice());
		System.out.println("현재 남은 돈 : " + b.money + "만원");
		System.out.println("보너스 : " + b.bonusPoint + "점" );
		b.buy(new Tv());
	}

}
