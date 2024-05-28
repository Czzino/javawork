package _01_localDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.TimeZone;

public class T04_Zoned {

	public static void main(String[] args) {
		
		// 그지역의 로컬 타임 확인
		ZonedDateTime seoulDT = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println(seoulDT);
	
		ZonedDateTime londonDT = ZonedDateTime.now(ZoneId.of("Europe/London"));
		System.out.println(londonDT);
		
		ZonedDateTime berinonDT = ZonedDateTime.now(ZoneId.of("Europe/Berlin"));
		System.out.println(berinonDT);
		
		ZonedDateTime newYoukDT = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(newYoukDT);
		
		// 전세계적으로 기준이 되는 시간 확인
		ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(utc);
		
		// Calendar 사용
		TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar now = Calendar.getInstance(tz);
		System.out.println(now.get(Calendar.HOUR));
	}

}
