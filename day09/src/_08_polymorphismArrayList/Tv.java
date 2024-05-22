package _08_polymorphismArrayList;

public class Tv extends Product {
	// 생성자
	Tv() {
		super(300);
	}

	@Override
	// 주소가 안나오고 글자 출력
	public String toString() {
		return "Tv";
	}

}
