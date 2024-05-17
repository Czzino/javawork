package _03_overloading;

public class T01_api_book {
	String bookName;
	int ISBN;
	int price;
	
	T01_api_book(){
		this("천진호", 1234567, 35000);
	}
	T01_api_book(String bookName){
		this(bookName, 250000, 35000);	
	}
	T01_api_book(String bookName, int ISBN){
		this(bookName, ISBN, 350000);
	}
	T01_api_book(String bookName, int ISBN, int price){
		this.bookName = bookName;
		this.ISBN = ISBN;
		this.price = price;
	}
}
