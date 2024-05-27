package _03_calander_date;

import java.util.Calendar;

public class T02_calendar_set {

	public static void main(String[] args) {
		// 데이터를 넣을떄는 set
		Calendar date1 = Calendar.getInstance();

		// 월은 단점
		date1.set(2024, 12 - 1, 7);
		int month = date1.get(Calendar.MONTH);
		System.out.println("월 : " + (month + 1));

		// 년 월 일 시 분
		date1.set(2024, 5 - 1, 27, 16, 53);
		System.out.println(date1.get(Calendar.HOUR) + "시");

		date1.set(Calendar.MONTH, Calendar.MAY);
		;
		System.out.println(date1.get(Calendar.MONTH) + 1 + "월");

	}

}
