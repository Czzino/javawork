package _03_abstract;

public class FolderPhone extends Phone {

	FolderPhone(String owner) {
		super(owner);

	}

	@Override
	void trunOn() {
		System.out.println("뚜겅을 열어 전화를 받습니다");
	}

	@Override
	void trunOff() {
		System.out.println("종료 버튼을 눌러 전화를 끊습니다");
	}

}
