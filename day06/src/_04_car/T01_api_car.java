package _04_car;

public class T01_api_car {

	// 속성
//	1. 회사
//	2. 모델
//	3. 컬러 ( 중간에한번 바꾸기)
//	4. 현재 스피드
//	5. 시동
//	
//	메소드
//	1. 시동켜고 끄기
//	2. 스피드 올리기 (10씩 증가)
//	3. 스피드 내리기 (10씩 감소)
//	
//	컬러 화이트 검은색
	String company = "더조은 아카데미";
	String model = "model";
	String color = "화이트";
	int speed = 40;
	boolean power;
	void power() {
		power = !power;
		if(power) {
			System.out.println("시동을 킵니다");
		} else {
			System.out.println("시동을 끕니다");
		}
	}
	
	
	int sppedUp() {
		speed = speed + 10;
		return speed;
	}
	
	int speedDown() {
		speed = speed - 10;
		return speed;
	}
	
		
}
