package _03_overloading;

public class T03_main_thisConOverloading {

	class ThisAaa {
		// 기본생성자
		int num;
		double dou;
		String name;

		// 생성자에서 this() : 다른생성자 호출
		// this()는 맨첫줄에 있어야 함
		ThisAaa() {
			// 생성자에서 매개변수가 3개인것 찾음
			this(1, 1.0, "홍길동");
			num = 1;
			dou = 1.0;
			name = "천진호";
			System.out.println("매개변수가 없는 생성자");
		}

		ThisAaa(int num) {
			// this는 맨첫줄에
			this(num, 1.0, "홍길동");
			System.out.println("매가변수가 1개인 생성자");
		}

		ThisAaa(int num, double dou) {
			this(num, dou, "홍길동");
			System.out.println("매개변수가 2개인 생성자(int,double)");
		}

		ThisAaa(int num, String name) {
			this.num = num;
			dou = dou;
			this.name = "천진호";
			System.out.println("매개변수가 2개인 생성자(int,String");
		}

		ThisAaa(int num, double dou, String name) {
			this.num = num;
			this.dou = dou;
			this.name = name;
			System.out.println("매개변수가 3개인 생성자");
		}

		// 가변인자 : 들어올 인자의 갯수를 모를떄
		// (int.. str) : 인자는 0개 이상
		void method(int... str) {
			System.out.println("인자가 0개 이상");
		}

		// (String num, String... str) : 인자는 1개 이상
		void method(int num, String... str) {
			System.out.println("인자가 반드시 1개 이상");
		}
		// 2개이상일떄 비효율적
//	void method(String name, int num, String... str) {
//		
//	}
		// 오류 : 모든 인자는 가변인자에 들어감
//	void method(String... str, String num) {

	}

	public static void main(String[] args) {
//		ThisAaa a1 = new ThisAaa();
//		ThisAaa a2 = new ThisAaa(5, 10.56, "나야나");
//		ThisAaa a3 = new ThisAaa(10, "문자열");
//		ThisAaa a4 = new ThisAaa(50, 50.1234);

	}
}
