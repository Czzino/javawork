package _03_WildcardGenerics;

public class Course {
	// 모든 사람이면 등록 가능
	// 모든 객체 들어올수있음
	// ? = extends Object
	static void registerCourse(Applicent<?> a) {
		// 클래스 이름 나옴 패키지 경로
		System.out.println(a.kind.getClass().getSimpleName() + "가 course에 등록함");
	}

	// 학생만 등록 가능
	static void registerCourse2(Applicent<? extends Student> a) {
		// 클래스 이름 나옴 패키지 경로
		System.out.println(a.kind.getClass().getSimpleName() + "가 course2에 등록함");
	}

	// 직장인 일반인 등록가능
	static void registerCourse3(Applicent<? super Worker> a) {
		// 클래스 이름 나옴 패키지 경로
		System.out.println(a.kind.getClass().getSimpleName() + "가 course3에 등록함");
	}
}
