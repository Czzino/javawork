package _02_exception;

public class T05_numberFormat {

	public static void main(String[] args) {
	
		// 정수형 Exception
		String[] str = {"23","17","a","3.14159"};
		int i=0;
		try {
		
			for(i=0; i<str.length; i++) {
				// int형으로 형변환
				int num = Integer.parseInt(str[i]);
				System.out.println(num);
			}
	
		} catch(NumberFormatException e) {
			System.out.println(str[i] + "정수로 변경할 수 없음");
//			e.printStackTrace();
		}
		
	}

}
