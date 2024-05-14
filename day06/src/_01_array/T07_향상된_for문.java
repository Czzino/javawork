package _01_array;

import java.util.Arrays;

public class T07_향상된_for문 {

	public static void main(String[] args) {
	
		// 향상된 for문 배열에서만 사용 가능
		// 배열을 처음부터 끝까지 사용할 떄
		int num[] = {1,2,3,4,5};
		
		for(int result : num) {
			System.out.println(result);
		}
		
		System.out.println("------------------");
		String name[] = {"홍길동","아무개","김길동"};
		
		for(String result : name) {
			System.out.println(result);
		}

		// 배열의 크기를 정할떄 10 20 크게 해야 넘치지 않음
		// 배열의 단점 : 배열의 크기 넣을 값보다 크기 메모리 낭비
		// 배열의 단점 : 배열의 크기 적을 경우 나중에 늘릴 수 없다
		
		// 배열의 크기가 적을경우 copy하여 만들어야함
		// newScore는 배열 에러 더 크기때문에
		int[] oldScore = {98,67,48,100,94};
		int[] newScore = new int[10];
		
		for(int i=0; i<oldScore.length; i++) {
			newScore[i] = oldScore[i];
		}
		
		// 안넣은것은 초기값 0
		newScore[5] = 57;
		System.out.println(Arrays.toString(newScore));
		
		// 미리 만들어 놓은게 있음
		// index 번호를 넣어서 사용
		// 라이브러리(api) : arraycopy(복사할배열,복사할index번호,새배열,새배열의 index번호(부터넣기),갯수)
		System.arraycopy(oldScore, 0, newScore, 6, 4);
		System.out.println(Arrays.toString(newScore));
		
		// 3개를 넣을 수 있는 문자열 배열 만들어서 값을 넣기
		// 5개짜리 배열을 만들어서 복사하여 넣기 (index 5번부터 넣기 2개만 넣기)
		
		String[] oldStr = {"천진호","김수현","김지원"};
		String[] newStr = new String[10];
		
		// 향상된 for문 
//		for(int i=0; i<oldStr.length-1; i++) {
//			newStr[i+5] = oldStr[i];
//		}
		
		// 향사된 for문 사용
		// index번호를 넣어줘야지 어디서부터 시작하는지 알수 있음
		int index = 5; // 5번부터 시작
		for(String str : oldStr) {
			newStr[index++] = str;
		}
		
		
//		System.arraycopy(oldStr, 0, newStr, 5, 4);
		System.out.println(Arrays.toString(newStr));
		
 	}

}
