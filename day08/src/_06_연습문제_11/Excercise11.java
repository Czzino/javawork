package _06_연습문제_11;

class Math {
	
	int max(int[] intArray) {
		
		int max = intArray[0]; // 첫번쨰 값이 9 i=1 일떄 9랑 9를 비교할필요가 없어서 i=1 부터 비교
		for(int i=1; i<intArray.length; i++) {
			
			if(max < intArray[i]) 
				max = intArray[i];
		}
		return max; // 리턴값 정수
	}
	
	int min(int[] intArray) {
		
		int min = intArray[0];
		// for-each문 min 변수에 저장된 값보다 더작은 값이 배열에 있을경우
		// min에 해당값을 저장
		for(int num : intArray) {
			if(min > num)
				min = num;
		}
		return min;
	}
}

public class Excercise11 {
	
	public static void main(String[] args) {
		
		int[] arr = {9, 5, 24, 13,3,21}; // 매개변수를 받기위해 정수타입 배열 초기화
		
		Math m = new Math(); // 최대값 및 최소값을 구하려면 Math 함수를 써야함
		int max = m.max(arr); // max는 최대값
		int min = m.min(arr); // min은 최소값
		
		System.out.println("최대값 : " + max);
		System.out.println("최대값 : " + min);
	}
}

