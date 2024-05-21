package _02_접근제한자;

public class T01_api_AccessModifier {
	// private를 사용하는것은 속성 변수에만 사용
	private int priNum = 5;
	
	// getter , setter
	// set 값을 가져오는 부분
	void setPriNum(int priNum) {
		this.priNum = priNum;
	}
	
	// 값을 얻어와서 리턴
	int getPriNum() {
		return priNum;
	}
	
}
