package _01_localDateTime;

import java.time.LocalDate;

public class T01_LocalDate {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now(); // 현재 날짜
		System.out.println(today);
		System.out.println(today.getYear() + "년"); // 현재 년도
		System.out.println(today.getMonth()); // 영문으로 달 출력
		System.out.println(today.getMonthValue() + "월");
		System.out.println(today.getDayOfMonth()+ "일");	
		System.out.println("365일 중 " + today.getDayOfYear() + "일");
		System.out.println(today.getDayOfWeek()); // 그주의 요일 출력
		System.out.println(today.getDayOfWeek().getValue()); // 1=월요일
		System.out.println("이달은 총 : " + today.lengthOfMonth() + "일까지 있다"); // 이달의 가장 마지막 날
		System.out.println("올해는 총 : " + today.lengthOfYear() + "일까지 있다" ); // 올해의 총 날
		System.out.println("올해는 윤년인가? : " + today.isLeapYear()); // 윤년 확인
		
		
		// 내가만든 커스텀 날짜
		LocalDate day = LocalDate.of(2024, 5, 7); // toString 오버라이딩 되어있음
		System.out.println(day);
		
		
	}

}
