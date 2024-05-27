package _02_wrapperClass;

public class T01_wrapper {

	public static void main(String[] args) {

		// deprecated : 앞으로 없어질 가능성이 있는 것 되도록이면 쓰지마시오
		Integer iiii = new Integer(3);
		Integer i = Integer.valueOf(3);
		Integer i2 = Integer.valueOf(100);
		
		// compareTo() 
		// 문자하나하나 인덱스를 비교
		// - 0 : 비교해서 같으면 0
		// - 1 : 문자열이면 사전순의 반대 (숫자도 같음)
		// - -1 : 문자열의 사전순일떄
		System.out.println(i.compareTo(i2));
		
		// 연산된값이 6
		// 반환형이 String
		int result = i;
		String result2  = i.toString();
		System.out.println("result = " + (result+3));
		System.out.println("result = " + (result2+3));
		
		
		// static 함수로 상수 값 변경불가
		System.out.println("MAX_VALUE : " + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE : " + Integer.MIN_VALUE);
		System.out.println("size = " + Integer.SIZE + "bit");
		System.out.println("Bytes = " + Integer.BYTES + "Byte");
		System.out.println("type = " + Integer.TYPE);
	}

}
