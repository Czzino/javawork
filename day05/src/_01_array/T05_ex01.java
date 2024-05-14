package _01_array;


import java.util.Scanner;

public class T05_ex01 {

	public static void main(String[] args) {
		// 1. 길이가 10인 배열을 선언하고 1~10까지 반복문을
		// 이용하여 순서대로 넣고 출력하기
		// 2. 길이 10인 배열을 선언하고 1~10까지 값을 반복문을
		// 이용하여 역순으로 배열 인덱스에 넣고 값 출력
		// 3. 사용자로부터 입력받은 수 만큼 배열을 만들고
		// 1~입력받은 수를 차례대로 넣어 출력
		// 4. 길이가 5인 배열에 사과,귤,포도,복숭아,참외로 초기화한후
		// 배열 인덱스를 이용하여 귤 출력
		// 5. 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열
		// 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력
		// ex)
		// 문자열 : application
		
		// 1. 길이가 10인 배열 선언
		int[] arr1 = new int[10];
		for(int i=0; i<arr1.length; i++) {
			arr1[0] = 1;
			arr1[1] = 2;
			arr1[2] = 3;
			
			arr1[i] = i+1;
			System.out.print(arr1[i] + ",");
			
		}
		
		
		};
			
		
		
		
	}

}
