package Book;

import java.util.ArrayList;
import java.util.Objects;

public class Book extends BookController implements Comparable<Book> {
	String title;
	String author;
	String category;
	int price;
	ArrayList<Book> list = new ArrayList<Book>();

	public Book(String string, String author, String category, int price) {
		this.title = string;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", category=" + category + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, category, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(category, other.category) && price == other.price
				&& Objects.equals(title, other.title);
	}

	@Override
	public int compareTo(Book o) {

		if (title != o.title) {
			return -1;
		} else if (title == o.title) {
			return 0;
		} else {
			return 1;
		}

	}

}
