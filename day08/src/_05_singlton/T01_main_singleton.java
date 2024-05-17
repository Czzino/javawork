package _05_singlton;

public class T01_main_singleton {

	public static void main(String[] args) {
//		객체 생성 불가
//		T01_api_singleton sig = new T01_api_singleton();
		T01_api_singleton.getSingleton();
		T01_api_singleton singleton1 = T01_api_singleton.getSingleton();
		T01_api_singleton singleton2 = T01_api_singleton.getSingleton();
		T01_api_singleton singleton3 = T01_api_singleton.getSingleton();
		
		
		if(singleton1 == singleton2){
			System.out.println("같은 객체를 가리키고 있음");
		} else {
			System.out.println();
		}
		
		System.out.println(singleton1);
		System.out.println(singleton2);
		System.out.println(singleton3);
		
		
	}

}
