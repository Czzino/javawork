package jhex02;

import java.util.ArrayList;

public class LibraryController {
	String name;
	String age;
	String gender;
	ArrayList<Book> aList = new ArrayList<Book>();
	
	LibraryController(String name, String age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	

	void info() {
		System.out.println("이름 : " + name + "," + "나이" + ":" + age + ":" + ", 성별" + ":"  + gender);

	}
	void insertBook(Book b) {
		aList.add(b);
		aList.add(b);
		aList.add(b);
		System.out.println("size" + aList.size());
	}

	ArrayList<Book> selectAll() {
		return aList;
	}

//	Book serachBook(String bookTitle) {
//		Book book = null;
//	
//		for(int i=0; bookTitle == book.geTitle(); i++) {
//			
//			System.out.println(i);
//		}
//		return book;
//	}
}
