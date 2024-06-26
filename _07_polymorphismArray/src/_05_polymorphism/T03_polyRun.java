package _05_polymorphism;
class Car {
	String color;
	int speed;
	void drive() {
		System.out.println("운전중 빵빵!!!!");
	}
	
	void stop() {
		System.out.println("stop!!!!");
	}
}
class FireCar extends Car{
	void water() {
		System.out.println("물을 뿌립니다!~~");
	}
}

public class T03_polyRun {

	public static void main(String[] args) {
		
		// 자식객체에서 객체 생성
		FireCar fCar = new FireCar();
		fCar.drive();
		fCar.water();
		fCar.stop();
		
		// Car 형변환 되서 Firecar 객체가 사라져서 water 사용불가
		Car car = fCar;
		car.drive();		
		car.stop();
//		car.warter(); 사용 불가
		
		FireCar fCar2 = (FireCar)car; // 부모타입 > 자식타입으로 강제 형변환
		/*
		 * 주의
		 * 반드시 부모는 최초객체생성시 자식의 타입으로 객체 생성 되어 있어야 됨 
		 */	
		
		// 새로운 Car객체 생성
		// 처음에 FireCar객체가 있는지 확인
		Car car2 = new Car();
		// 컴파일 오류(실행시 오류가 발생)
//		FireCar fCar3 = (FireCar)car2; 
		
	}

}
