package _02_method;

public class T02_api_method {

	// 5칙 연산 +.-,*,/,
	// 나누기는 double형으로
	// 메소드는 4개
	// return값이 있는걸로
	// 매개변수 2개
	
	int add(int num1, int num2) {
		return num1+num2;
	}
	
	int minus(int num1, int num2) {
		return num1-num2;
	}
	
	int multiply(int num1, int num2) {
		return num1*num2;
	}
	
	
	double divide(double dou1, double dou2) {
		return dou1/dou2;
	}
	double divide2(int dou1, int dou2) {
		return (double)dou1/dou2;
	}
}
