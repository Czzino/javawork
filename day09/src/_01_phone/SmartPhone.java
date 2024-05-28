package _01_phone;

public class SmartPhone extends Phone {
	String serach;
	
	// 부모의 생성자에 매개변수가 있으면 자식도 반드시 생성자가 있어야 됨
	// 부모 생성자의 인자값을 넘겨줘야 됨
	// 이유 : 자식의 객체를 생성하면 부모의 객체도 생성됨
	SmartPhone(String model, String color) {
		// super 부모의 생성자 호출
		super(model, color); // 생성자의 인자
	}

//	빈 생성자 호출
//	SmartPhone(){
//		super("note1","white");
//	}
	
	String serach(String serach) {
		this.serach = serach;
		return this.serach + "를 검색합니다";
	}
}