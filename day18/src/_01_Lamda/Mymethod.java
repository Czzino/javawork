package _01_Lamda;

// 함수식 interface를 체크하는 어노테이션
// 추상메서드가 1개인지를 체크
@FunctionalInterface
public interface Mymethod {
	// 추상메서드 구현 생략 가능 public abstract
	// 매개변수가 하나도 없음
	int method();
}
