package jhex01;

class Math {
	int max(int[] intArray) {
		int max = intArray[0];
	
		for(int i=1; i<intArray.length; i++) {
			if(max < intArray[i]) {
				max = intArray[i];
			}
		}
		
		// 향산된 for 문
//		for(int num : intArray) {
//			if(max < num) {
//				max = num;
//			}
//		}
		return max;
		
	}
	int min(int[] intArray) {
		int min = intArray[0];
	
		// 향산된 for 문
		for(int num : intArray) {
			if(min > num) {
				min = num;
			}
		}
		return min;
		
	}
}
