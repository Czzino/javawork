package jhex02;

public class Book extends LibraryController{
	String title;
	String author;
	String publisher;

	Book() {
		this("title", "author", "publisher");
	}

	Book(String title, String author, String publisher) {
		super(title, author, publisher);
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	String geTitle() {
		return title;
	}

	String getAuthor() {
		return author;
	}

	String getPublisher() {
		return publisher;
	}
	
	@Override
	public String toString() {
		return "제목 : " + ":" + title + "," + "저자" + ":" + author + ":" + ", 출판사" +  publisher;
	}
}
