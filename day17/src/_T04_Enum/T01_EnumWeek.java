package _T04_Enum;

import java.util.Calendar;

public class T01_EnumWeek {

	public static void main(String[] args) {

		Week today = null;

		Calendar cal = Calendar.getInstance();
		// 요일 1~7
		int week = cal.get(cal.DAY_OF_WEEK);
		int month = cal.get(cal.DAY_OF_MONTH);
		System.out.println(week);
		
		// Week 클래스에있는 상수
		switch(week) {
		case 1:today = Week.STURDAY; break;
		case 2:today = Week.MONDAY; break;
		case 3:today = Week.THURSDAY; break;
		case 4:today = Week.WEDENSDAY; break;
		case 5:today = Week.FRIDAY; break;
		case 7:today = Week.STURDAY; 
		
		}
		// case : 0 일떄 같은값
		if(today == Week.SUNDAY) {
			System.out.println("일요일엔 짜파게티");
		} else {
			System.out.println("열심히 자바 공부를한다");
		}
		
		
		
		
	}

}
