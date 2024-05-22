package _03_abstract;

public class SmartPhone extends Phone {

	SmartPhone(String owner) {
		super(owner);

	}

	@Override
	void trunOn() {
		System.out.println("옆으로 밀어서 전화를 받습니다");

	}

	@Override
	void trunOff() {
		System.out.println("종료 버튼을 눌러 전화를 끊습니다");
	}

	// 검색기능
	void serach(String serach) {
		System.out.println(serach + "를 검색함");
	}

}
