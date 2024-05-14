package _03_Tv;

public class T01_api_tv {

	// 속성 변수
	String company = "LG";
	String model = "울트라 FULL HD ";
	int inch = 65;
	int volume; // 기본값 : 0 인스턴스 변수
	int channel = 1;
	boolean power; // 기본값 false
	
	// 메소드 
	void power() {
		power = !power;
		if(power) {
			System.out.println("tv를 켭니다");
		} else {
			System.out.println("tv를 끕니다");
		}
	}
	
	int channerlUp() {
//		channel += 2;
		channel++;
		return channel;
	}
	
	int channerDown() {
		channel--;
		return channel;
	}
	
	int volume(int volumeInput) {
		volume = volumeInput;
		return volume;
	}
}
