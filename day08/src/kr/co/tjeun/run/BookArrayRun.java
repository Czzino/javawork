package kr.co.tjeun.run;

import java.util.Arrays;
import java.util.Scanner;

import kr.co.tjeun.Book;

public class BookArrayRun {

	public static void main(String[] args) {
		Book[] books = new Book[3];
		// 내코드
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		for(int i=0; i<books.length; i++) {
//	
//			System.out.println(i+1 + "번째 도서 정보 입력");
//			
//			System.out.print("책 제목 입력 : ");
//			String title = sc.next();
//			
//			System.out.print("저자 입력해주세요 : ");
//			String author = sc.next();
//			
//			System.out.print("가격 입력해주세요 : ");
//			int price = sc.nextInt();
//			
//			System.out.print("출판사 입력해주세요 : ");	
//			String publisher = sc.next();
//			
//			if(i == 0) {
//				books[0] = new Book(title, author, price, publisher);	
//			
//			}
//			if(i == 1) {
//				books[1] = new Book(title, author, price, publisher);	
//				
//			}
//			if(i == 2) {
//				books[2] = new Book(title, author, price, publisher);	
//				
//			}
//			sum = i;
//			
//		}
//		System.out.println(books[sum].information());

		// 강사님 코드
		
		Scanner sc = new Scanner(System.in);
			
		for(int i=0; i<books.length; i++) {
			System.out.println(1+1 + "번ㄴ쨰 도서 정보 입력 : ");
			System.out.print("책 제목 입력 : ");
			String title = sc.next();
			
			System.out.print("저자 입력해주세요 : ");
			String author = sc.next();
			
			System.out.print("가격 입력해주세요 : ");
			int price = sc.nextInt();
			
			System.out.print("출판사 입력해주세요 : ");	
			String publisher = sc.next();
			
			
			books[i] = new Book(title, author, price, publisher);
			
		}
		// 도서목록 조희
		// 향상된 for 문
		for(Book book: books) {
			System.out.println(book.information());
		}
//		System.out.println();
//		// 그냥 for 문
//		for(int i=0; i<books.length; i++) {
//			System.out.println(books[i].information());
//		}
		
		// 도서 제목으로 검색하는 서비스
		// 사용자로부터 검색할 서비스가 뭔지 받아야함
		System.out.println("검색할 도서명 : ");
		String serach = sc.next();
		
//		for(int i=0; i<books.length; i++) {
//			if(search.equals[books[i].getTitle())
//				System.out.println(books[i].information());
//		}
		
		
		
		
	}

}
