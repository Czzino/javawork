package jhex03;

import java.util.ArrayList;

public class LibraryController {
	// 멤버 객체 생성
	Member member;
	ArrayList<Book> aList = new ArrayList<Book>();

	// 멤버 객체를 매개변수로 받는 생성자
	LibraryController(Member m) {
		member = m;
	}

	// member의 toString 출력
	void info() {
		System.out.println(member);
	}

	// 반환 하고싶으면
//	ArrayList<Book> insertBook(Book book) {
//		aList.add(new Book("123","스프링","13")); // 리스트 0 번
//		aList.add(new Book("spirng","스프링","13")); // 리스트 0 번
//		aList.add(new Book("구인","파이썬","45")); // 리스트 0 번
//		return aList;
//	}
	void insertBook() {
		aList.add(new Book("123", "스프링", "13")); // 리스트 0 번
		aList.add(new Book("spirng", "자바", "26")); // 리스트 0 번
		aList.add(new Book("356", "파이썬", "38")); // 리스트 0 번
	}

	void insertBook1(Book book) {
		aList.add(book);
	}

	ArrayList<Book> selectAll() {
		return aList;
	}

	Book searchBook(String bookTitle) {

		Book book = null;
		for (int i = 0; i < aList.size(); i++) {
			if (aList.isEmpty()) {
				System.out.println("책이 없습니다");
				break;
			} else if (bookTitle.equals(aList.get(i).getTitle())) {
				book = aList.get(i);
				break;
			}
		}
		return book;
	}
}
