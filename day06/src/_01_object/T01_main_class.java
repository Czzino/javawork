package _01_object;

public class T01_main_class {

	public static void main(String[] args) {
		// main 메소드에서 실행 class에선 실행 안됨
		T01_api_class ob1 = new T01_api_class();
		int result = ob1.num;
		double dou = ob1.dou;
		boolean b1 = ob1.bool;

		// ; 출력하고 스택에서 사라짐
		System.out.println(result);
		System.out.println(ob1.num);
		System.out.println(ob1.dou);
		System.out.println(ob1.bool);
		System.out.println(ob1.name);
		ob1.name = "이수현";
		System.out.println(ob1.name);

		T02_api_class ob2 = new T02_api_class();
		System.out.println(ob2.address);
		System.out.println(ob2.age + "살");
		System.out.println("주소 : " + ob2.address);

		ob2.address = "서울시 동작구";
		ob2.age = 40;
		System.out.println(ob2.address);
	}

}
