package run;

import java.util.Scanner;

// import 전부 패키지 이름
import kr.co.tjeun.Book;

public class BookRun {
	
	public String title;
	public String author;
	public int price;
	public String publisher;
	public static void main(String[] args) {
	// 1. 기본생성자로 객체를 생성하여 getter/setter메솓드로 값 초기화
//		Book book = new Book();
//		book.setTitle("JAVA");
//		book.setAuthor("천진호");
//		book.setPrice(350000);
//		book.setPublisher("tjeun");
//		System.out.println(book.information());
		// 사용자로 부터 값을 입력받아 초기화 하여 출력하기
		// 내코드
//		Book book = new Book("springBook", "이강도", 270000, "저강도");;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("title을 입력해주세요 : ");
//		String title = sc.next();
//		System.out.print("autho을 입력해주세요 : ");
//		String author = sc.next();
//		System.out.print("price을 입력해주세요 : ");
//		int price = sc.nextInt();
//		System.out.print("publisher을 입력해주세요 : ");	
//		String publisher = sc.next();
//		// 초기화 방법 2. 매개변수가 있는 생성자 이용
//		System.out.println("title : " + title);
//		System.out.println("autho : " + author);
//		System.out.println("price : " + price);
//		System.out.println("publisher : " + publisher);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("책제목 입력 : ");
//		String title = sc.nextLine();
//		System.out.println("저자 입력 : ");
//		String author = sc.nextLine();
//		System.out.println("가격 입력 : ");
//		int price = sc.nextInt(); // 엔터 역할
//		sc.nextLine();
//		System.out.println("출판사 입력 :");
//		String pubilser = sc.nextLine();
//		
//		Book book4 = new Book();
//		
//		System.out.println("책제목 입력 : ");
//		book4.setTitle(sc.nextLine());
//		
//		System.out.println("저자 입력 : ");
//		book4.setTitle(sc.nextLine());
//		
//		System.out.println("가격 입력 : ");
//		book4.setPrice(sc.nextInt()); // 엔터 역할
//		sc.nextLine();
//		System.out.println("출판사 입력 :");
//		book4.setPublisher(sc.nextLine());
		
		// 관리 해야 되는데 일반 변수 사용
		// 아무것도 없을때는 null로 초기화
		Book book1 = null;
		Book book2 = null;
		Book book3 = null;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.println(i+1 + "번째 도서 정보 입력");
			
			System.out.print("책 제목 입력 : ");
			String title = sc.next();
			
			System.out.print("저자 입력해주세요 : ");
			String author = sc.next();
			
			System.out.print("가격 입력해주세요 : ");
			int price = sc.nextInt();
			
			System.out.print("출판사 입력해주세요 : ");	
			String publisher = sc.next();
			if(i == 0) {
				book1 = new Book(title, author, price, publisher);	
			} else if(i == 1) {
				book2 = new Book(title, author, price, publisher);
			} else {
				book3 = new Book(title, author, price, publisher);
			}
			
		}
		
		System.out.println(book1.information());
		System.out.println(book2.information());
		System.out.println(book3.information());
		
		
		// 도서 제목으로 검색하는 서비스
		System.out.println("검색할 책 제목 : ");
		String search = sc.next();
		
		if(book1.getTitle().equals(search)) {
			System.out.println(book1.information());
		}
		if(book2.getTitle().equals(search)) {
			System.out.println(book2.information());
		}
		if(book3.getTitle().equals(search)) {
			System.out.println(book3.information());
		}
		
		if(!book1.getTitle().equals(search) && !book2.getTitle().equals(search) 
				&& !book3.getTitle().equals(search)) {
			System.out.println("그런책 없어요");
		}
		
		
	}
}
