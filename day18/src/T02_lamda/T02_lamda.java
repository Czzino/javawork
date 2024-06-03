package T02_lamda;

public class T02_lamda {

	public static void main(String[] args) {

		MyOneArgs02 mo = new MyOneArgs02() {

			@Override
			public void method(int x) {
				// int형으로 받음

				int result = x * 2;
				System.out.println(result);
			}

		};
//		public void method(int x) {
//			// int형으로 받음
//
//			int result = x * 2;
//			System.out.println(result);
//		}
		// 람다식 변경
		mo.method(4);

		mo = (x) -> {
			int result = x * 3;
			System.out.println(result);
		};

		mo.method(4);
		mo = (x) -> {
			int result = x * 3;
			System.out.println(x * 4);
		};

		mo = (x) -> System.out.println(x * 4);
		mo.method(4);

		mo = (x) -> System.out.println(x * 4);
		mo.method(4);

	}

}
