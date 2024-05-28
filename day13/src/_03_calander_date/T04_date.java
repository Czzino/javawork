package _03_calander_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class T04_date {

	public static void main(String[] args) {
		Date now = new Date();
		// toString 오버라이딩 상태
		System.out.println(now);
		
		// 데이터를 추가할떄
		// now.setYear(2025);
		// MM : 월, mm : 분
		// hh : 소문자면 12시간 제(0~11)
		// MM 은 05 하나면 5 년 월 일 시 분 초 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(now));
		
		// 맨뒤에 a : 오전/오후
		// a는 아시아나 미국 기준으로 오전 오후 출력
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a") ;
		System.out.println(sdf2.format(now));
		
		// HH : 대문자이면 24시간 제(0~23)
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf3.format(now));
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf4.format(now));
		
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy/M/d");
		System.out.println(sdf5.format(now));
		
		SimpleDateFormat sdf6 = new SimpleDateFormat("MM-dd-yyyy");
		System.out.println(sdf6.format(now));
		
		// E가 요일
		SimpleDateFormat sdf7 = new SimpleDateFormat("yy년 MM월 dd일 E요일");
		System.out.println(sdf7.format(now));
		
		String str = "20240507";
		SimpleDateFormat sdf8 = new SimpleDateFormat("yyyyMMdd"); // 원본 포맷
		SimpleDateFormat sdf9 = new SimpleDateFormat("yyyy-MM-dd"); // 내가바꿀 포맷
		Date strNow;
		// 문자열을 Date형태로 바꿀떄 오류날수 있으므로 try catch
		try {
			strNow = sdf8.parse(str);
			System.out.println(sdf9.format(strNow));
		} catch (ParseException e) {
		
			e.printStackTrace();
		}

		
	}

}
