package _04_interface;

public class RemoteRun {

	public static void main(String[] args) {
		// 인터페이스는 객체 생성할수 없다
		// 형변환은 가능
//		RemoteControl control = new RemoteContrl();
		Audio audio1 = new Audio();
		audio1.trunOn();
		audio1.trunOff();
		System.out.println("------------------------");
		// 형변환은 가능 주소 복사
		RemoteControl rc = audio1;
		rc.trunOn();
		rc.trunOff();
		System.out.println("------------------------");
		rc = new Tv();
		rc.trunOn();
		rc.trunOff();
		
	}

}
