package _01_array;

public class T02_2차원배열 {

	public static void main(String[] args) {
		// 2차원 배열 : [행의index][열의index]
		// 0,1,2,3,4
		// 0
		// 1
		// 3차원배열은 z축으로 생성
		int[][] score = {{1,2,3,4,5}, // [0]
						{ 6, 7, 8, 9,10}, // [1]
						{11,12,13,14,15}}; // [2]
//					    [0],[1],[2],[3],[4]

		// [0] [1] 앞에 인덱스는 행 , 뒤에 인덱스는 열의 인덱스
		System.out.println(score[0][2]); // 3
		System.out.println(score[2][3]); // 14
//		
//		// 행의 길이를 출력 
		System.out.println("행의 길이는 : " + score.length);
		
		// 열의 길이를 출력
		System.out.println("score[0]의 길이(열길이) : " + score[0].length);
//		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] + ", ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		// score[0][0]
		// score[1][1]
		// score[2][2]
		// score[3][0]
		// score[4][4]
		
		// score[1][0]
		// score[1][1]
		// score[1][2]
		// score[1][3]
		// score[1][4]
		
	    System.out.println("[score] 행의 길이는 : " + score.length);
		
		// 열의 길이를 출력
		System.out.println("score[0]의 길이(열길이) : " + score[0].length);

		// 내가 쓴 코드
		int[][] sum = {{1,3,5,7,9}, // [0]
					  { 11, 13 ,15 ,17,19}, // [1]
				      {21,23,25,27,29}}; //
		sum = score;
		for(int i=0; i<sum.length; i++) {
			for(int j=0; j<sum[i].length; j++) {
				System.out.print(sum[i][j] + ", ");
			}
			System.out.println();
		}
		
	    System.out.println("[sum] 행의 길이는 : " + sum.length);
		
		// 열의 길이를 출력
		System.out.println("sum[0]의 길이(열길이) : " + sum[0].length);
		
		System.out.println("------------------------");
		
		// 배열의 데이터를 덮어쓰기
		//1,3,5,7,9
		//11,13,15,17,19
		//21,23,25,27,29

		// 강사님 코드
		int count = 1;
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				score[i][j] = count;
				System.out.print(score[i][j] + ", ");
				count += 2;
			}
			System.out.println();
		}
		
		int[][] iArr = {{1,2,3},
					   {4,5},
					   {6,7,8,9}};
		
		// [][0].length = 3
				// [][1].length = 2
				// [][2].length = 4
		
		for(int i=0; i<iArr.length; i++) {
			for(int j=0; j<iArr[i].length; j++) {
				System.out.print(iArr[i][j] + ", ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
