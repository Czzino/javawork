package jhex03;

public class Book {
	// 강사님 코드
	private String title;
	private String publisher;
	private String author;

	Book() {

	}

	Book(String title, String author, String publisher) {
		this.title = title;
		this.publisher = publisher;
	}

	String getTitle() {
		return title;
	}

	void setTitle(String title) {
		this.title = title;

	}

	String getAuthor() {
		return author;
	}

	void setAthor(String author) {
		this.author = author;

	}

	String getPublisher() {
		return publisher;
	}

	void setPublisher(String publisher) {
		this.publisher = publisher;

	}

	@Override
	public String toString() {
		return "제목 : " + title + ", 저자 : " + author + ", 출판사 : " + publisher;
	}
}
