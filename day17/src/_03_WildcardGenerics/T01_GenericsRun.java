package _03_WildcardGenerics;

public class T01_GenericsRun {

	public static void main(String[] args) {

		// 모든 사람이 시청가능
		// 부모 = 자손
		// Course 에 static 함수 사용
		Course.registerCourse(new Applicent<Person>(new Person()));
		Course.registerCourse(new Applicent<Worker>(new Worker()));
		Course.registerCourse(new Applicent<Student>(new Student()));
		Course.registerCourse(new Applicent<HighStudent>(new HighStudent()));
		Course.registerCourse(new Applicent<MiddleStudent>(new MiddleStudent()));
		System.out.println("----------------------------");

		// 학생만 신청가능
//		Course.registerCourse2(new Applicent<Person> (new Person())); // 부모 안됨
		Course.registerCourse(new Applicent<Student>(new Student()));
		Course.registerCourse(new Applicent<HighStudent>(new HighStudent()));
		Course.registerCourse(new Applicent<MiddleStudent>(new MiddleStudent()));
		System.out.println("-----------------------------");

		// 직장인과 일반인만 신청 가능
		Course.registerCourse3(new Applicent<Person>(new Person()));
		Course.registerCourse3(new Applicent<Worker>(new Worker())); // worker의 worker의 부모 됨
//		Course.registerCourse3(new Applicent<Student>(new Student()));
//		Course.registerCourse3(new Applicent<HighStudent>(new HighStudent()));
//		Course.registerCourse3(new Applicent<MiddleStudent>(new MiddleStudent()));

	}

}
