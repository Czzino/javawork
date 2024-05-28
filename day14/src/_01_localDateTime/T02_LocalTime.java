package _01_localDateTime;

import java.time.LocalTime;

public class T02_LocalTime {

	public static void main(String[] args) {
	
		// 현재시간 시 분 초 밀리 세컨드
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(time.getHour() + "시");
		System.out.println(time.getMinute() + "분");
		System.out.println(time.getSecond() + "초");
		
		LocalTime time2 = LocalTime.of(17, 20, 1);
		System.out.println(time2);
	}

}
