package _01_phone;

public class Phone {
	String model;
	String color;
	
	// 생성자의 값이 없을떄 사용
//	Phone(){}
	
	Phone(String model, String color){
		this.model = model;
		this.color = color;
	}
	// 벨이 울리는 기능
	void bell() {
		System.out.println("벨이 울립니다");
	}
	
	// 전화를 받는 기능
	void hangUP() {
		System.out.println("전화를 받습니다.");
	}
	
	// 전화를 보내는 기능
	void sendVoice(String message) {
		System.out.println("나 : " + message);
	}
	
	// 전화를 받는 기능
	void receveVioce(String message) {
		System.out.println("상대방 : " + message);
	}
	
	// 전하를 끊는
	void hangOut() {
		System.out.println("전화를 끊습니다");
	}
}
