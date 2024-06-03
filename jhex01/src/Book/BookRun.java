package Book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import BookClass.Book;

public class BookRun {
	static BookController bc = new BookController();;

	public static String title;
	public static String author;

	public static void main(String[] args) {

		mainMenu();
	}

	public static void mainMenu() {
		insertBook();
		listAll();
		searchBook();
		deleteBook();
		ascBook();
	}

	public static void insertBook() {

		Scanner sc = new Scanner(System.in);

		System.out.print("도서명 : ");
		String title = sc.nextLine();
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		System.out.print("장르 = 인문 /자연과학 /컴퓨터 /요리 /기타 : ");
		String category = sc.nextLine();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		bc.insertBook(new Book(title, author, category, price));
	}

	public static void listAll() {

		ArrayList<Book> bookList = bc.listAll();
		if (bookList.isEmpty())
			System.out.println("도서가 하나도 없습니다.");
		else {
			for (Book b : bookList) {
				System.out.println(b);
			}
		}
	}

	public static void searchBook() {
		Scanner sc = new Scanner(System.in);

		System.out.print("검색할 제목 입력 : ");
		String title = sc.nextLine();

		// 글자가 들어가져 있으면 다 검색
		ArrayList<Book> searchList = bc.searchBook(title);
		if (searchList.isEmpty()) {
			System.out.println("도서가 없습니다");
		} else {
			for (Book book : searchList) {
				System.out.println(book);
			}
		}
	}

	public static void deleteBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========= 도서 삭제 =========");
		System.out.print("삭제할 제목 입력 : ");
		String title = sc.nextLine();
		System.out.print("삭제할 저자명 입력 : ");
		String author = sc.nextLine();

		Book delBook = bc.deleteBook(title, author);

		if (delBook == null) {
			System.out.println("찾는 도서가 없어서 삭제하지 못함");
		} else {
			System.out.println(delBook.getTitle() + "책을 삭제하였습니다.");
		}
	}

	static void ascBook() {
		int result = bc.ascBook();
		if (result == 1)
			System.out.println("정렬에 성공하였습니다.");
		else
			System.out.println("정렬에 실패하였습니다.");
	}

}
