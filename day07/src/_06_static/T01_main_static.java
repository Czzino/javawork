package _06_static;

public class T01_main_static {

	public static void main(String[] args) {
		// 클래스는 하나고 객체는 따로 생성됨 주소가 따로 되어있음
		T01_api_static as1 = new T01_api_static();
		T01_api_static as2 = new T01_api_static();
		
		// as1 클래스 객체안에 10 이들어가있음
		as1.num = 1000;
		System.out.println(as1.num);
		System.out.println(as2.num);
		
		as1.sNum = 20000;
		System.out.println("as1.sNum : " + as1.sNum);
		System.out.println("as2.sNum : " + as2.sNum);
		
	}

}
