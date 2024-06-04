package _04_consumer;

import java.util.function.*;

public class T01_consumer {

	public static void main(String[] args) {

		/*
		 * Consumer interface : 미리 구현되어 있음
		  매개 변수만 있고, 반환형이 없는 인터페이스
		 * @FunctionalInterface public interface Consumer<T> { void accept(T t); }
		 */

		// Consumer interface : 매개변수1개, 리턴값없음
		// 1. 매개변수 1개 모든 객체
		// 2. 변수명은 아무렇게나 지어도도됨
		Consumer<String> consumer = x -> System.out.println(x);
		consumer.accept("java");

		// 2. 매개변수가 2개 : 앞에 Bi라는 접두어를 붙임
		// 매개변수 두개면 () 
		BiConsumer<String, String> biCon = (a, b) -> System.out.println(a + ", " + b);
		biCon.accept("더조은", "의료용 AI");

		// 3. 매개변수 1개의 double형
		// 정수넣어도 자동형변환
		DoubleConsumer douCon = d -> System.out.println(d);
		douCon.accept(4.67);

		// 4. 매개변수 2개중 1개는 모든 객체, 1개는 int형
		// generic 내가만든 객체도 가능
		// 변수이름은 내맘대로 해도됨
		ObjIntConsumer<String> oiCon = (o, i) -> System.out.println(o + ", " + i);
		oiCon.accept("program", 2);

	}

}
