package _02_constructor;

public class T01_api_tv {
	String company; // 기본갑 null
	String model; // 기본값 null
	int channel; // 기본값 0
	
	// 기본 생성자
//	T01_api_tv(){
//		System.out.println("기본 생성자");
//	}
	
	// 매개변수가 1개인 생성자
//	T01_api_tv(String company){
//		this.company = company;
//	}

	// 매개변수가 3개인 생성자
	// 지역변수 이름이 다르면 인스턴스 변수에 지역변수를 넣음
	T01_api_tv(String company, String modelName, int channel){
		this.company = company;
		model = modelName; //  지역변수와 인스턴수변수가 다를경우 this를 안붙여도 됨
		this.channel = channel;
	}
	
	
}
