package _03_Lamda;

public class T01_lamda {

	public static void main(String[] args) {

		MyMethod mm;
		// 매개변수가 2개이상이면 반드시 {}

		mm = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(mm.method(3, 5));

		mm = (x, y) -> {
			return x + y;
		};
		System.out.println(mm.method(5, 9));

		// 한줄이면 {} 안써도됨
		mm = (x, y) -> x + y;
		System.out.println(mm.method(3, 7));

		mm = (x, y) -> sum(x, y);

//		mm = new MyMethod() {
//			@Override
//			public int method(int x, int y) {
//				int result = sum(x, y);
//				return result;
//			}
//		};

	}

	// 내클래스에 객체생성 하지않고 사용할때
	static int sum(int x, int y) {
		return x + y;
	}
//	static int sum2(int y) {
//		return x + y;
//	}
//	static int sum3(int x, int y) {
//		return x + y;
//	}

}
