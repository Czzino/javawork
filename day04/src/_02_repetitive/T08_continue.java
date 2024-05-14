package _02_repetitive;

public class T08_continue {

	public static void main(String[] args) {
		
		// while continue : 실행문을 실행하지 않고 다시 반복문을 실행
		// 					~을 제외 할떄 많이 사용
		// 1~100까지 3의 배수를 제외한 합계 구히기
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%3 == 0) {
				continue; // 3의 배수 3,6,9를 만나면 continue 를 실행학고 for문 다시 실행
	
		}
			sum += i;
		}
		System.out.println("1~100까지 3의 배수를 제외한 합계 : " + sum);
		
		
		// 같은 값을 초기화 할때 일떄 (같은 자료형)
		/*
		 * int num1=4; int num2=7; int num=9;
		 */
		// int num1, num2, num3;
		// int num1=4, num2=9, num3=5;
		// int num1=5, num2=5, num3=5;
		int num4, num5, num6;
		num4=num5=num6=5;
		
		// for문 사용시 여러개의 변수 사용가능
		// 변수를 여러개 사용가능하지만 조건식은 무조건 하나
		for(int i=1, j=20; i<10; i++, j--) {
			System.out.println(i + "," +j);
		}

		// j의 변수는 조건식에 들어가므로 20 부터 감소
		for(int i=1, j=20, x=15, y=3; j>=10; i++, j--, x-=2, y+=5) {
			System.out.println(i + "," + j + "," + x + "," + y);
		}
	
		System.out.println("-----------------------------------");
		// while(true) 무한반복 동일
		for(;;) {
			System.out.println(num4);
		  //if(num4 >= 8)
			if(num4 == 8)
				break;
			
			num4++;
		}
		System.out.println("-----------------------------------");
		// 중첩for문에서 원하는 반복문을 빠져나오고 싶을 때
		// forloop 포문 이름으로 break 문을 빠져나오고 싶을 떄 사용
		forloop : for(int dan=2; dan<=9; dan++) {
			for(int i=1; i<=9; i++) {
				System.out.println(dan + "*" + i + "=" + dan*i);
				if(i==5) {
					break forloop;
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------");
		
		outer : for(int dan=2; dan<=9; dan++) {
			mid : for(int i=1; i<=9; i++) {
				for(int z=1; z<=5; z++) {
					System.out.println(dan + "," + i + "," + z);
					if(z==3) 
						break outer;
					
				}
				System.out.println("mid for문 종료");
			}
			System.out.println();
		}
		System.out.println("for문 완전 종료");

	}
}


