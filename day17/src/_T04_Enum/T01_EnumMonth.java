package _T04_Enum;

import java.util.Calendar;

public class T01_EnumMonth {

	public static void main(String[] args) {

		Month today = null;

		Calendar cal = Calendar.getInstance();
		// 달
		int month = cal.get(cal.DAY_OF_MONTH);
		System.out.println(month);
		
		// Week 클래스에있는 상수
		switch(month) {
		case 0:today = Month.JANUARY; break;
		case 1:today = Month.FEBRUARY; break;
		case 2:today = Month.MARCH; break;
		case 3:today = Month.APRIL; break;
		case 4:today = Month.MAY; break;
		case 5:today = Month.JUNE; 
		case 6:today = Month.JULY; break;
		case 7:today = Month.AUGUST; break;
		case 8:today = Month.SEPTEMBER; break;
		case 9:today = Month.OCTOBER; break;
		case 10:today = Month.NOVEMBER;break;
		case 11:today = Month.DECEMBER;
		
		}
		if(today == Month.MAY) {
			System.out.println("5월은 너무너무 재수좋은 달");
		} else {
			System.out.println("열심히 자바 공부를한다");
		}
	}

}
