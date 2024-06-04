package _02_Stream;

public class T01_ByteStream {

	public static void main(String[] args) {
		/*
		프로그램상의 데이터를 외부매체로 부터 입력 받거나 출력을 한다.
		반드시 그 외부매체와 통로를 만들어야됨. 이게 바로 스트림
		
		스트림(통로)의 특징
		 - 단방향 : 입력 혹은 추력 하나만 가능
		     => 입력과 출력을 동시에 하고자 한다면 => 입력용 스트림/ 출력용 스트림/ 출력용 스트림을 따로 열어야 됨
		 - 선입선출(FIFO) : 통로가 파이프같은 개념이기 떄문에 먼저 들어온 값이 먼저 나감.
		 = 시간지연(delay)라는 문제가 생길 수 있음
		
		 스트림의 구분
		 // 영문이나숫자는 1바이트
		  > 통로의 사이즈 (1byte 짜리 / 2byte짜리)
			- 바이트 스트림 : 1byte짜리만 왔다 갔다 할 수 있는 정도의 사이즈 => 입력(InputStream) / 출력(OutputStream)
			- 문자 스트림 : 2byte짜리 까지 왔다 갔다 할 수 있는 정도의 사이즈 => 입력(Reader) / 출력(Wirter)
		  > 외부 매체와 직접 연결 유무
		   - 기반 스트림 : 외부 매체와 직접 연결되는 통로(필수) 
		   - 보조 스트림 : 보조 역할을 하는 통로(속도를 빠르게 한다거나, 그외 유용한 기능제공 해줌)
						단독 사용불가 => 반드시 기반스트림 있어야 사용가능
		*/
		
		ByteStreamApi stapi = new ByteStreamApi();
//		stapi.fileSave(); // 파일 저장
		
		stapi.fileRead();
	}

}
