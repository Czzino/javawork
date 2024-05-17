package _03_overloading;

public class T01_main_book {
	int instanceValue;
	
	public static void main(String[] args) {
		
		// 객체 생성할때 파라미터를 넘겨줘야함
		T01_api_book bk1 = new T01_api_book("천진호");
		T01_api_book bk2 = new T01_api_book("천진호123",10);
		T01_api_book bk3 = new T01_api_book();
		// 노란색 표시는 잠재적 오류가 날수있음
		T01_api_book bk4 = new T01_api_book("천진호456",20,30);
		
		System.out.println("bk 1 : " + bk1.bookName);
		
		System.out.println("bk 2 : " + bk2.bookName);
		System.out.println("bk 2 : " + bk2.ISBN);
		
		System.out.println("bk 3 : " + bk3.bookName);
		System.out.println("bk 3 : " + bk3.ISBN);
		
	}
	
	

}
