package _01_StringBuffer_Builder;

public class T01_StringBuffer {

	public static void main(String[] args) {
	
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		// 값이 같은가 비교
		System.out.println("sb1 == sb2 ? " + (sb1 == sb2));
		// equals ()를 오버라이딩 하지 않음(주소가 같은가)
		System.out.println("sb1.equals(sb2) ? " + sb1.equals(sb2));
	
		// 기본 16Byte + "abc"
//		String s1 = new String()
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println("s1 == sb2 ? " + (s1 == s2));
		System.out.println("s1.equals(sb2) ? " + s1.equals(s2));
		System.out.println("----------------------------------");
		
		// toString()은 오버라이딩 되어 있음(문자열 반환)
		// append 마지막 인덱스에 추가
		// 모든 자료형을 출력할수 있음
		System.out.println("sb1=" + sb1);
		sb1.append("def");
		System.out.println("sb1=" + sb1);
		sb1.append(123);
		System.out.println("sb1=" + sb1);
		sb1.append(true);
		System.out.println("sb1=" + sb1);
		
		//Delete 삭제 기능
		
		sb1.deleteCharAt(8);
		System.out.println("sb1=" + sb1);
		sb1.delete(6, 12);
		System.out.println("sb1=" + sb1);
		System.out.println("----------------------------------");
		
		// 중간에 데이터삽입 insert
		// insert(얼만큼떨어뜨려서, 문자열)
		sb1.insert(1, "java");
		System.out.println("sb1=" + sb1);
		
		// replace oldstr > newstr
		
		sb1.replace(5, sb1.length(), " spring");
		System.out.println("sb1=" + sb1);
		System.out.println("sb1.reverse = " + sb1.reverse());
		
		// capacity() : StringBuffer의 객체가 생성될때 기본 버퍼의 크기는 16Byte+문자크미
		StringBuffer sb5 = new StringBuffer();
		StringBuffer sb6 = new StringBuffer("a");
		System.out.println("sb5의 버퍼크기 : " + sb5.capacity());
		System.out.println("sb6의 버퍼크기 : " + sb6.capacity());
		
		// 버퍼의 크기를 지정
		StringBuffer sb7 = new StringBuffer(32);
		System.out.println("sb7의 버퍼크기 : " + sb7.capacity());
	} 

}
