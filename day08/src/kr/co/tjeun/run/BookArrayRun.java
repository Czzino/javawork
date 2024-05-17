package kr.co.tjeun.run;

import java.util.Arrays;
import java.util.Scanner;

import kr.co.tjeun.Book;

public class BookArrayRun {

	public static void main(String[] args) {
		Book[] books = new Book[3];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i=0; i<books.length; i++) {
	
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
				books[0] = new Book(title, author, price, publisher);	
			
			}
			if(i == 1) {
				books[1] = new Book(title, author, price, publisher);	
;
			}
			if(i == 2) {
				books[2] = new Book(title, author, price, publisher);	
				
			}
			sum = i;
			
		}
		System.out.println(books[sum].information());

		// 도서 제목으로 검색하는 서비스
				System.out.println("검색할 책 제목 : ");
				int search = sc.nextInt();
				
//				if(!book1.getTitle().equals(search) && !book2.getTitle().equals(search) 
//						&& !book3.getTitle().equals(search)) {
//					System.out.println("그런책 없어요");
//				}
		
		
		
	}

}
