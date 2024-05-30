package Music;

import java.util.Scanner;

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
//+ mainMenu() : void
//사용자가 직접 메인 메뉴를 선택 할 수 있음. 종료 전까지 반복 실행. 각 메뉴를 누를 시 해당 메소드로 이동.
//+addList() : void
//마지막 위치에 곡 추가 성공을 알리는 메소드
//+addAtZero() : void
//첫 위치에 곡 추가 성공을 알리는 하는 메소드
//+printAll() : void
//전체 곡 목록을 출력 성공을 알리는 메소드
//+searchMusic() : void
//특정 곡 검색의 결과를 보여주는 메소드
//+removeMusic() : void
//특정 곡 삭제 결과를 보여주는 메소드
//+setMusic() : void
//특정 곡 정보 수정 결과를 보여주는 메소드
//+ascTitle() : void
//곡 명 오름차순 정렬 성공을 알리는 메소드	
//+descSinger() : void
//가수 명 내림차순 정렬 성공을 알리는 메소드

//		******* 메인 메뉴 *******
//			1. 마지막 위치에 곡 추가		// addList() 실행
//			2. 첫 위치에 곡 추가		// addAtZero()
//			3. 전체 곡 목록 출력		// printAll()
//			4. 특정 곡 검색			// searchMusic()
//			5. 특정 곡 삭제			// removeMusic()
//			6. 특정 곡 정보 수정		// setMusic()
//			7. 곡명 오름차순 정렬		// ascTitle()
//			8. 가수명 내림차순 정렬		// descSinger()
//			9. 종료				// “종료” 출력 후 main()으로 리턴
//			메뉴 번호 선택 : >> 입력 받음

	public void mainMenu() {
		addList();
//		addAtZero();
//		printAll();
//		searchMusic();
//		removeMusic();
//		setMusic();
//		ascTitle();
//		descSinger();
//		9. 종료				// “종료” 출력 후 main()으로 리턴
//		메뉴 번호 선택 : >> 입력 받음
		// 메뉴 화면 반복 실행 처리
	}

	public void addList() {
		System.out.print("곡명과 가수명을 입력해주세요");

		String title = sc.next();
		String singer = sc.next();

		System.out.println("title  : " + title);
		System.out.println("singer : " + singer);
		mc.addList(title, singer);
		if (title.equals(title)) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
//		****** 마지막 위치에 곡 추가 ******
//		// 곡 명과 가수 명을 사용자에게 입력 받는다.
//		// MusicController에 addList()를 이용해서 입력한 정보를 넘기고
//		// 추가 성공 시 “추가 성공”, 추가 실패 시 “추가 실패” 콘솔창에 출력
	}

	public void addAtZero() {
	}

	public void printAll() {
	}

	public void searchMusic() {
	}

	public void removeMusic() {
	}

	public void setMusic() {
	}

	public void ascTitle() {
	}

	public void descSinger() {
	}

}
