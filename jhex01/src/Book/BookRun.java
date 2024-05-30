package Book;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

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
		searchBook(title);
		deleteBook(title, author);
		ascBook(title);
	}

	public static void insertBook() {

		Scanner sc = new Scanner(System.in);

		System.out.print("책제목을 입력 해주세요.");
		title = sc.next();
		bc.insertBook(title);
		System.out.println("책 : " + bc.title);

	}

	public static void listAll() {
		bc.listAll();
	}

	public static void searchBook(String title) {

		bc.searchBook(title);

	}

	public static void deleteBook(String title, String author) {
		bc.deleteBook(title, author);
	}

	public static void ascBook(String title) {

		TreeSet<Book> treeset = new TreeSet<Book>();

		treeset.add(new Book(title, "author", "category", 1000));
		treeset.add(new Book(title, "singer", "sims", 2000));
		treeset.add(new Book(title, "song", "error", 3000));
		treeset.add(new Book(title, "kim", "push", 20000));
		Iterator<Book> iterator = treeset.iterator();
		while (iterator.hasNext()) {

			Book person = iterator.next();
			System.out.println(person.title);
			bc.ascBook(person.title);
		}
	}

}
