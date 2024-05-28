package _03_calander_date;

import java.util.Calendar;

public class T03_calendar_연산 {

	public static void main(String[] args) {

		// 일단위
		Calendar date1 = Calendar.getInstance();
		date1.add(Calendar.DATE, 100);
		System.out.println("오늘부터 100일 후 : " + (date1.get(Calendar.MONTH) + 1) + "월" + date1.get(Calendar.DATE));

		Calendar date2 = Calendar.getInstance();
		date2.add(Calendar.DATE, -100);
		System.out.println("오늘부터 100일 전 : " + (date2.get(Calendar.MONTH) + 1) + "월" + date2.get(Calendar.DATE));

		// 달단위
		Calendar date3 = Calendar.getInstance();
		date3.add(Calendar.MONTH, 2);
		System.out.println("오늘부터 2달 후 : " + (date3.get(Calendar.MONTH) + 1) + "월" + date3.get(Calendar.DATE));
	}

}
