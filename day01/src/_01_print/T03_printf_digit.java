package _01_print;

public class T03_printf_digit {

	public static void main(String[] args) {
		// 7은 7자리
		System.out.printf("%7d\n", 32000);
		System.out.printf("%7d\n", 320000);
		System.out.printf("%7d\n", 3200);
		System.out.printf("--------------------");
		
		System.out.printf("%07d\n", 32000);
		System.out.printf("%07d\n", 320000);
		System.out.printf("%07d\n", 3200);
		System.out.printf("--------------------");
		
		System.out.printf("[%10s]\n", "천진호abcd");
		System.out.printf("[%-10s]\n", "adsfeg");
		System.out.printf("[%s]\n", "adsfeg");
		System.out.printf("--------------------");
		
		// 소수점 몇재짜리 까지 설정
		System.out.printf("%6.2f\n", 13.456);
		System.out.printf("%.3f\n", 2323232.232323);
		
		// printf와 똑같은 기능
		System.out.format("%.3f", 2323232.232323);
	}

}
