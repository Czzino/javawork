package _02_variable;

public class T01_var {

	public static void main(String[] args) {
	
	//	기본자료형
	//	정수 : int
	//	실수 : double
	//	참,거짓 : boolean
	//	문자1개 : char(유니코드 사용)

		// ctrl + 
	//  crtrl + shift  	
	//	정수 타입 : 
	//	byte(1byte)
	//  char(2byte)
	//	short(2byte) 
	//	int(4byte) 
	//	long(8byte)

	int num1;
	int num2 = 10;
	
	num1=11;
	System.out.println(num1);
	System.out.println(num2);
	
	System.out.println(num1+num2);
	System.out.println(num1 * 2 + num2);
	
	int sum = num1 + num2;
	System.out.println("num1+num2 = "+sum);
	
	// 변수를 하나 만들어 sum + 5 를 한 결과를 넣으시오. 그리고 출력하시오
	int num3 = sum + num1 +num2;
	System.out.println("sum + num1 + num2 = "+ num3);
	
	int num4 = sum + 5;
	System.out.println("sum + 5 = "+num4);
	
	
	// int 정수형 
	int num5 = sum + 5;
	System.out.println("sum + 5 = "+num5);
	int num6 = sum + 5;
	System.out.println("sum + 5 = "+num6);
	int num7 = sum + 5;
	System.out.println("sum + 5 = "+num7);
	int num8 = sum + 5;
	System.out.println("sum + 5 = "+num8);
	int num9 = sum + 5;
	System.out.println("sum + 5 = "+num9);
	int num10 = sum + 5;
	System.out.println("sum + 5 = "+num10);
	
	// long 자료형
	long long01 = 50000000000000000L;
	
	// double 은소수점 12자리까지 가능
	double doub01 = 37.92139219;
	System.out.println(doub01);
	double doub02 = 78.8383;
	System.out.println(doub01+doub02);
	
	// 기본자료형 8byte 를 float 4byte (큰자료형을 작은 자료형에) 넣어서 오류남
	float float01 = 45.38293892f;
	System.out.println(float01);
	
	
	
	}

}
