package _08_polymorphismArrayList;

public class GameDevice extends Product {
	// 생성자
	GameDevice() {
		super(80);
	}

	@Override
	// 주소가 안나오고 글자 출력
	public String toString() {
		return "GameDevice";
	}
}
