package Book;

import java.util.ArrayList;

public class BookController {
	String title;
	String author;
	String category;
	int price;
	ArrayList<Book> list = new ArrayList<Book>();

	public BookController() {

	}

	public BookController(String title, String author, String category, int price, Book b) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
		list.add(b);
		list.add(b);
		list.add(b);
		list.add(b);

	}

	public void insertBook(String title) {

		this.title = title;

	}

	public void listAll() {
		if (title.equals(title)) {
			System.out.println("책이 있습니다.");

		} else {
			System.out.println("책이 없습니다.");
		}
	}

	// 5번을 선택했으면 호출
	public void ascBook(String title) {

		if (title.equals(title)) {
			System.out.println("정렬을 하였습니다.");

		} else {
			System.out.println("정렬에 실패 했습니다.");
		}

	}

	public void searchBook(String title) {
		if (title.equals(title)) {
			System.out.println("책정보 : " + "title");
		} else {
			System.out.println("책정보가 없습니다.");
		}
	}

	public void deleteBook(String title, String author) {
		if (title.equals("") && author.equals("")) {
			System.out.println("삭제할 도서를 찾지 못했습니다");
		} else {
			System.out.println("도서를 삭제하였습니다");
		}
	}
}
