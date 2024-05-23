package jhex03;

import java.util.ArrayList;

public class BookRun {

	public static void main(String[] args) {
		// 강사님 코드
		// member의 줏소가 들어있음
		LibraryController lc = new LibraryController(new Member("천진호", 35, "남자"));
		lc.insertBook();// void라 출력할수 없음
		System.out.println(lc.selectAll());

		ArrayList<Book> aList = lc.selectAll();

		// 1. System.out.print("[");
//		for(int =0; i<aList.size(); i++) {
//			if(i<aList.size()-1)
//				System.out.println(aList.get(i));
//			else {
//				System.out.println(aList.get(i));
//			}
//		}
//		System.out.print("]");
		// 2.
//		for(int i=0; i<aList.size(); i++) {
//			System.out.println(aList.get(i));
//		}
		// 3.
//		for(Book book : aList) {
//			System.out.println(book);
//		}

		// 출력 하는부분
		lc.insertBook1(new Book("리액트", "이고잉", "위키북스"));
		System.out.println(lc.selectAll());

		// 검색 하는부분
		Book bookSe = lc.searchBook("spring");
		System.out.println(bookSe);
		if (bookSe == null) {
			System.out.println("찾는 책이 없습니다.");
		} else {
			System.out.println(bookSe);
		}

	}

}
