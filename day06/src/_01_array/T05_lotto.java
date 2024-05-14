package _01_array;

import java.util.Arrays;

public class T05_lotto {

	public static void main(String[] args) {
		// 로또 연습 문제
		// 1. 6개의 1차원 배열
		// 2. 1~45숫자를 랜덤으로 추출해서 배열에 넣기
		// 3. 배열에 들어있는값과 랜덤추출한값이 같은가 비교
		// 3.1 같은값이면 다시 랜덤추출(2번 index로 돌아감)
		// 3.2 다른면 배열에 넣기,
		// 4. 6개의 배열이 꽉 찰떄가지 반복
		
		// new 라서 객체 생성
		int lotto[] = new int [6];
		
		// index 가 0 부터 시작 해서 6이 될떄까지 반복
		int index =0;
		while(true) {
			// index값이 초기에 0으로 되어있음
			// while 문 스택안에 변수들이 쌓임
			int temp = (int)(Math.random()*45) + 1;
		
			// index가 0번부터 돌기위해 사용
			boolean insert = true; // 배열에 들어있는값과 temp의 값이 다르면

			for(int i=0; i<=index; i++) {
				// 현재 들어온값이 같은가?
				if(lotto[i] == temp) {
					insert = false; // 배열에 들어있는 값과 temp의 값 같으면
					break;
				}
			}
			
			// insert의 값이 true이면 배열에 temp의 값을 넣어줌
			// insert의 값이 false이면 배열에 temp 값을 안넣어줌
		
			// insert의 값이 true로 초기화되서 false는 실행하지 않음
			// index의 갑이 6과 같은지 확인
			// index 값이 true false바뀌면서 사용 
			if(insert) {
				lotto[index] = temp;
				index++;
			}
			// index == 6 일떄 break;
			if(index == 6) { // 배열이 6개가 꽉 차면 while 빠져나오기	
				break;
			}
			// Arrays안에 있는 데이터를 추출하기위해 toString 사용
			System.out.println(Arrays.toString(lotto));
			
			// 1. 갈아 19인 배열을 선언하고 1~10까지 반복문을
			// 이용하여 순서대로 넣고 출력하기
			// 2. 길이 10인 배열을 선언하고 1~10까지 값을 반복문을
			// 이용하여 역순으로 배열 인덱스에 넣고 값 출력
			// 3. 사용자로부터 입력받은 수 만큼 배열을 만들고
			// 1~입력받은 수를 차례대로 넣어 출력
			// 4. 길이가 5인 배열에 사과,귤,포도,복숭아,참외로 초기화한후
			// 배열 인덱스를 이용하여 귤 출력
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}

}
