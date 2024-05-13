package _01_operation;

public class T04_logical {
	public static void main(String[] args) {
		/*
		 * // 논리합과 논리곱
		  x y 논리합(&&)and  논리곱(||) or
 		  0 0		0			0
		  0 1		0			1
		  1 0		0			1
		  1 1		1			1 	  
		 */
		int num1 = 10;
		int num2 = 20;
		// 논리합 false(0)		false(0) 	&& 		true(1)
		boolean result = num1 > num2 && num1 <= num2;
		System.out.println(result);
		// 논리곱 false(0)		false(0) 	|| 		false(0)
		result = num1 > num2 || num1 <= num2;
		System.out.println(result);
		
		// ! : not 참거짓중에 
		result = !result;
		System.out.println(result);
		boolean b1 = false;
		System.out.println(!b1);
		
		// 유니코드 범위를 확인하고 비교
		char ch = 'K'; // 75
		System.out.println(ch);
		System.out.println("소문자 인가? " + (ch >= 'a' && ch <= 'z')); // 97 ~ 122
//										 75 >= 97
		System.out.println("대문자 인가? " + (ch >= 'A' && ch <= 'Z'));	 // 65 ~ 90
//										  75 >= 65=t		75 <= 90
											
	}

}
