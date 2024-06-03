package _04_consumer;

import java.util.function.*;

public class T01_consumer {

	public static void main(String[] args) {

		// Consumer의 원형 : 미리 구현되어 있음
//		@FunctionalInterface
//		public interface Consumer<T> {
//
//		    /**
//		     * Performs this operation on the given argument.
//		     *
//		     * @param t the input argument
//		     */
//		    void accept(T t);
//		}
		// Consumer interface : 매개변수1개, 리턴값없음
		// 1. 매개변수 1개 모든 객체
		Consumer<String> consumer = x -> System.out.println(x);
		consumer.accept("java");

		// 2. 매개변수가 2개 : 앞에 Bi라는 접두어를 붙임
		// 제네릭 타입이라 객체 다른것 사용해도됨
		BiConsumer<String, String> biCon = (a, b) -> System.out.println(a + ", " + b);
		biCon.accept("더조은", "의료용 AI");

		// 매개변수 1개의 double형
		DoubleConsumer douCon = d -> System.out.println(d);
		douCon.accept(4.67);

		// 4. 매개변수 2개중 1개는 모든 객체, 1개는 int형
		// generic 내가만든 객체도 가능
		// 변수이름은 내맘대로 해도됨
		ObjIntConsumer<String> oiCon = (o, i) -> System.out.println(o + ", " + i);
		oiCon.accept("program", 2);

		
		
	}

	
}
