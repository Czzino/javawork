package _01_obj;

public class T01_main_car {

	public static void main(String[] args) {

		T01_api_car car = new T01_api_car();
		T01_api_car car2 = new T01_api_car();
		
		// 시동을 킴 메소드
		car.power();
		
		// 스피드 올리기
		int speed = car.speed(100);
		System.out.println("현재 속도 : " + speed);
		System.out.println("현재 속도 : " + car.speed(100));
		// 매개변수 없어서 출력하면 오류
		speed  = car.speedDown(); // 두번 실행되서 -5 , -5 함수실행
		System.out.println("현재 속도 : " + car.speedDown());
		
		car.color = "검정색";
		System.out.println(car.color);
		
		String car1Color = car.color;
		System.out.println(car1Color);
		System.out.println("-----------------------------");
		
		System.out.println("car2의 현재 속도 : " + car2.speed);
		System.out.println("car2의 색상  : " + car2.color);
	}

}
