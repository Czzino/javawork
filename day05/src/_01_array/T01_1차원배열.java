package _01_array;

public class T01_1차원배열 {

	public static void main(String[] args) {
		// 배열
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;

		// 3000 번지주소에서 int는 4바이트 씩이니까 3004 3008로 주소값을 찾아서 감
		// 비어있는 배열에 데이터 넣는 방법 [0] [1] [2] [3] [4]
		// new int[5] = 반드시 갯수를 정해주지 않으면 생성을 못함
		// 배열[] : 배열표시는 자료형 또는 변수명에 붙여준다

		// 두개다 가능
		int[] arrayInt = new int[5];
		// int arrayInt1 = new int[3];

		arrayInt[0] = 10;
		arrayInt[2] = 20;
		System.out.println(arrayInt[2]);

		// 4byte 씩 5개를 만들고 int형으로 배열을 만듬
		// 띄어쓰기 해도 되고 안해도 됨
		// 자료형에 맞게 데이터를 추가
		int arrayInt2[] = { 1, 2, 3, 4, 5 };
		char[] arrayChar = { 'a', 'b', 'c' };
		String[] arrayStr = { "홍길동", "아무개" };
		double[] arrayDou = { 35.66, 89.34, 7 }; // 7이라 썼지만 7.0으로 데이터가 들어감

		// int[] arrayInt3 = new int[5]; // index번호 : 0~4
		// arrayInt3[5] = 9; // 오류 : index의 범위를 넘어서 넣을 수 없음 out of index

		// 배열 100개를 만들어서 1~100까지의 값을 넣는다
		// 1 ~ 100 까지의 규칙이 있으니까 for 문 사용
		int[] arrayInt4 = new int[100];
//		arrayInt4[0] = 1;
//		arrayInt4[1] = 2;
//		arrayInt4[2] = 3;
		for (int i = 0; i < 100; i++) {
			// i의 값이 계속 추가되서 i+1;
			arrayInt4[i] = i + 1;
			System.out.println(arrayInt[i] + ",");
		}
		// 객체를 생성할떄 값을 설정 해주지 않았을떄 초기값
		// int , double 기본 초기화값이 0 , 0.0 , char 0 , String null , boolean false

	}

}
