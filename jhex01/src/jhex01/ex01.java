package jhex01;

public class ex01 {
	public static void main(String[] args) {
		
		//01 다음중 클래스의 구성 멤버가 아닌것은?
		// 답은 3
		
		//02 객체에 대한 설명으로 올바르지 않은 것은?
		// 답은 3
		
		// 다음표에 나와있는 필드를 갖는 Person 클래스를 작성하시오
		
		//03 person 클래스 작성
		
		//04 생성자에 대한 설명으로 올바르지 않은 것은?
		// 답은 1
		
		// 05
		// 답은 4
		
		// 06 
		// 클래스 내에서 메소드를 재사용 하기위해 
		
		// 07
		// getAverage
		
		// 08
//		String number = "123";
//		System.out.println("출력값 : " + add(number));
		
		// 09
//		Excercise ex1 = Excercise.getInstance();
//		Excercise ex2 = Excercise.getInstance();
//		
//		System.out.println("ex1 == ex2 : "+ (ex1 == ex2));
		
		// 10
		// 답은 this
		int [] arr = {9, 5, 24, 13, 3,21};
		
		Math m = new Math();
		int max = m.max(arr);
		int min = m.min(arr);
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	
	}
	
	public static String add(String number) {
		return number + 456;
	}
}
