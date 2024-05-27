package _01_StringBuffer_Builder;

public class T02_StringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		// 오버라이딩 되어있음
		sb.append("java");
		sb.append(" program study");
		System.out.println(sb);

		// 배열 중간에 데이터 삽임
		sb.insert(4, "2");
		System.out.println(sb);
	
		// charat 문자하나만 넣을수 있음
		sb.setCharAt(4, '7');
		System.out.println(sb);
		
		/*
		String(불변성) : 한번 객체가 생성되면 덮어쓰기 안됨(무조건 새로 생성)
					   변하지 않는 문자열을 사용할 떄 (혹은 변경이 별로 없는 문자열일 떄)
		
		StringBuffer : 추가, 삭제, 수정을 할수 있다. 동기화를 지원(멀티 쓰레드 일떄 사용)
				       자주 변경되는 문자열을 사용할 때, 멀티쓰레디 일 떄 사용
				       
		StringBuilder : 추가, 삭제, 수정을 할수 있다. 동기화를 지원하지 않음
				       자주 변경되는 문자열을 사용할 때, 단일 , 메인 쓰레드 일떄 사용()
				       StringBuffer보다 빠름  
		*/	
		
		
	}

}
