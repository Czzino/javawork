package jhex05;

import java.util.Scanner;

public class SnackMenu extends Snack {
	
	Scanner sc = new Scanner(System.in);
	Snack snack = new Snack();
	
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("스낵류를 입력하세요.");
		String kind = sc.next();
		String name = sc.next();
		String flavor = sc.next();
		int numOf = sc.nextInt();
		int price = sc.nextInt();
		System.out.println("종류 : " + kind);
		System.out.println("이름 : " + name);
		System.out.println("맛 : " + flavor);
		System.out.println("개수 : " + numOf);
		System.out.println("가격 : " + price);	
		System.out.println("저장완료 되었습니다.");
	}
}
