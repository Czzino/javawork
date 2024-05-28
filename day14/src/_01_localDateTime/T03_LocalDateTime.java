package _01_localDateTime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class T03_LocalDateTime {

	public static void main(String[] args) {
	
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		
		LocalDateTime startDay = LocalDateTime.of(2024,5,7,10,0,0);
		LocalDateTime endDay = LocalDateTime.of(2024,11,25,18,30,0);
		LocalDateTime todayEnd = LocalDateTime.of(2024,5,28,18,30,0);
		
		System.out.println(startDay);
		System.out.println(endDay);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd a hh:mm:ss");
		System.out.println("시작일 : " + startDay.format(dtf));
		System.out.println("종료일 : " + endDay.format(dtf));

		// is 는 boolean true false
		if(today.isBefore(endDay)) {
			System.out.println("수업 진행중 입니다");
		} else if (today.isAfter(endDay)) {
			System.out.println("종료한 수업 입니다");
		} else if (today.isEqual(endDay)) {
			System.out.println("오늘 종료하는날 입니다");
		}
		System.out.println("---------------------");
		
		// 시간이 짧을떄 사용
		Duration duration = Duration.between(today, endDay);
		System.out.println(duration.getSeconds());
		System.out.println("---------------------");
		System.out.println("종료까지 : " + today.until(endDay, ChronoUnit.HOURS) + "시간 남음");
		System.out.println("종료까지 : " + today.until(endDay, ChronoUnit.MONTHS) + "개월 남음");
		System.out.println("종료까지 : " + today.until(endDay, ChronoUnit.DAYS) + "일 남음");
		System.out.println("---------------------");
		System.out.println("수업 종료까지 : " + today.until(todayEnd, ChronoUnit.HOURS) + "시간 남음");
		System.out.println("---------------------");
		
		// 오늘날짜에서 1개월전 1개월후
		System.out.println(today.plusYears(3).format(dtf));
		System.out.println(today.plusMonths(5).format(dtf));
		System.out.println(today.plusDays(15).format(dtf));
		System.out.println("---------------------");
		
		// 오늘날부터 이전날
		System.out.println(today.minusYears(3).format(dtf));
		System.out.println(today.minusMonths(5).format(dtf));
		System.out.println(today.minusDays(15).format(dtf));
		System.out.println("---------------------");		
		
		// 변경할 연도
		System.out.println(startDay.withDayOfYear(5));
		System.out.println(startDay.withMinute(25));
		System.out.println(startDay.withMinute(25));
	}

}
