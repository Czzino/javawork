package _01_phone;

public class PhoneRun {

	public static void main(String[] args) {
		
		// main 클래스 객체생성해서 사용
		// 자식과부모의 주소값중에 자식이 우선순위
		SmartPhone sPhone1 = new SmartPhone("note","white");
		System.out.println("model명 : " + sPhone1.model);
		System.out.println("색상 : " + sPhone1.color);
	
		sPhone1.bell();
		sPhone1.hangUP();
		sPhone1.receveVioce("안녕하세요 천진호 입니다");
		sPhone1.sendVoice("네 반가워요");
		sPhone1.hangOut();
		sPhone1.serach("java");
		
		Phone phone1 = new Phone("apple3","black");
		phone1.bell();
		phone1.hangOut();
		
//		phone1.search(); 사용 못함
	}
	
	

}
