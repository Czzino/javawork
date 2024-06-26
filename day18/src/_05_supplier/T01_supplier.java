package _05_supplier;

import java.util.function.*;

public class T01_supplier {

	public static void main(String[] args) {
		// 반환형 지정 리턴값이 있음
//		supplier : 매개변수 없고, 리턴값이 있는 인터페이스
//		Supplier<String> sup = () -> {return "aaa"; };
		Supplier<String> sup = () -> "aaa";
//		String str = sup.get();
		System.out.println(sup.get());

		IntSupplier isup = () -> 5;
		IntSupplier isup2 = () -> (int) (Math.random() * 45 + 1);
		System.out.println(isup2.getAsInt());

		DoubleSupplier dou = () -> (double) (Math.random() * 45 + 1);
		System.out.println(dou.getAsDouble());
		// boolean 형은 참거짓 사용
		// 결과값이 true, false 이면됨
		BooleanSupplier bsup = () -> 5 > 6;
		System.out.println(bsup.getAsBoolean());

	}

}
