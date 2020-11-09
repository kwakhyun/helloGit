package gitTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

// 날짜 & 시간
// 7. DateTimeFormatter
// => LocalDateTime 의 출력 포맷 지원
class DateTime05_Formatter {
	public static void main(String[] args) {
		
		LocalDateTime today = LocalDateTime.now();
		System.out.println("toString() => " + today);
		System.out.println("toString() Year=> " + today.getYear());
		System.out.println("toString() Month=> " + today.getMonthValue());
		
		System.out.println("toString() DayOfYear()=> " + today.getDayOfYear());
		System.out.println("toString() DayOfMonth=> " + today.getDayOfMonth());
		System.out.println("toString() DayOfWeek()=> " + today.getDayOfWeek());
		
		// 년도 format 지정시 주의사항
		// => YYYY 는 API 문서 참고하면 "week-based-year" 로 되어있음.
		// 즉 그 주의 끝에 해당하는 년도가 표시되기 때문에 주의
		// 2015년 12월26일 (토) 는 2015 로 표기 되지만,
		// 2015년 12월27일 (일) 은 2016 으로 표기 됨.
		// => yyyy 가 정확
		DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("yy-M-d");
		DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("yyyy-MM-d, H:m:s");
		DateTimeFormatter fm3 = DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm:ss");

		System.out.println(today.format(fm1));
		System.out.println(today.format(fm2));
		System.out.println(today.format(fm3));
	}
}