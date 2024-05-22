package _08_polymorphismArrayList;

public class Computer extends Product {
	// 생성자
	Computer() {
		super(120);
	}

	@Override
	// 주소가 안나오고 글자 출력
	public String toString() {
		return "Computer";
	}
}
