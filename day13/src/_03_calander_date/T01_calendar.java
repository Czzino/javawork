package _03_calander_date;

import java.util.Calendar;

public class T01_calendar {

	public static void main(String[] args) {
		// 객체를 생성할수 없는 추상클래스
		// Calendar: : 추상클래스. 객체를 생성할 수 없음. 메소드를 이용함
		java.util.Calendar today = java.util.Calendar.getInstance();
		System.out.println("현재 년도 : " + today.get(Calendar.YEAR));

		// 월은 0부터 시작 1월 항상 1을 더해줘야 한다.
		System.out.println("현재 월 : " + (today.get(Calendar.MONTH) + 1)); // 0 ~ 11 문자로 시작
		System.out.println("이 달의 몇번째 주 : " + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("올 해의 몇번째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("---------------------------------");

		// 일
		// Calendar 객체안에 static 함수가 내장 되어있음
		System.out.println("몇일 : " + today.get(Calendar.DATE));
		System.out.println("몇일 : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("몇일 : " + today.get(Calendar.DAY_OF_YEAR));

		// 요일 반환형이 int
		int week = today.get(Calendar.DAY_OF_WEEK);
		System.out.println("요일(1:일요일)" + week);

		switch (week) {
		case 1:
			System.out.println("일요일");
			break;

		case 2:
			System.out.println("월요일");
			break;

		case 3:
			System.out.println("화요일");
			break;

		case 4:
			System.out.println("수요일");
			break;

		case 5:
			System.out.println("목요일");
			break;

		case 6:
			System.out.println("금요일");
			break;

		case 7:
			System.out.println("토요일");
			break;
		}
		System.out.println("---------------------------------");
		// 시간
		System.out.println("시간(0~23) : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("시간(0~11) : " + today.get(Calendar.HOUR));
		// 0 : am, 1: pm int형 반환
		// 0 ~ 12 오전
		int apm = today.get(Calendar.AM_PM);
		if (apm == 0) {
			System.out.print("시간 : AM "); 
			if(today.get(Calendar.HOUR) < 10) {
				System.out.println("0" + today.get(Calendar.HOUR));
			} else {
				System.out.println("0" + today.get(Calendar.HOUR));
			}
		} else {
			System.out.print("시간 : PM "); 
			if(today.get(Calendar.HOUR) < 10) {
				System.out.println("0" + today.get(Calendar.HOUR));
			} else {
				System.out.println("0" + today.get(Calendar.HOUR));
			}
		}
		// 현재 분, 초, 밀리세컨드
		System.out.println("분 : " + today.get(Calendar.MINUTE));
		System.out.println("분 : " + today.get(Calendar.SECOND));
		System.out.println("1/1000초 : " + today.get(Calendar.MILLISECOND));
	

	}

}
