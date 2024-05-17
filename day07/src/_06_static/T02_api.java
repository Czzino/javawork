package _06_static;

public class T02_api {

	String empName = "홍길동";
	String dept = "영업부";
	String job = "과장";
	String gender = "남";
	String phone = "010-1234-5678";
	String address = "서울시 강남구";
	int empNo = 101;
	int age = 25;
	double salary; // 기본값 0.0
	double bonusPoint; // 기본값 0.0
	double bonusRatio; // 기본값 0.0

	T02_api() {
		this("홍길동", "영업부", "과장");
		System.out.println("매개변수가 없는 생성자");
	}

	// 사용자가 넣은값으로 인스턴스에 넣고 나머지는 위에표에 있는 값을 인스턴스 필드에 넣는다
	T02_api(String empName, String dept, String job) {
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.gender = "남";
		this.address = "서울시 강남구";
		System.out.println("매개변수가 3개인 생성자");
	}

	T02_api(double salary, double bonusPoint) {
		bonusPoint += salary * bonusRatio; // 포인트 계산
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		System.out.println("보너스 포인트는 : " + bonusPoint + "입니다.");
	}

}
