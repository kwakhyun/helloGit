package gitTest;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

// 날짜 & 시간
// 3. LocalDate : 시각정보 생략하고 날짜 정보만 표현하기위한 클래스
// 4. Period : 날짜의 차이를 표현 하기위한 클래스
public class DateTime02_LocalDate {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println("now => "+now);
		// => LocalDate 클래스의 toString() 메서드에 출력폼 정의
		
		// 올해의 크리스마스 출력
		LocalDate xmas = LocalDate.of(now.getYear(), 12, 25);
		System.out.println("xmas => "+xmas);
		// 올해의 크리스마스 이브 는 ???
		LocalDate eve = xmas.minusDays(1);
		System.out.println("eve => "+eve);
		// LocalDate 인스턴스는 변경이 불가능한(immutable) 인스턴스이기 때문에
		// => 계산된 값을 담을 인스턴스가 필요함.
		
		// 크리스마스까지 앞으로 며칠?
		Period left = Period.between(now, xmas) ;
		System.out.printf("xmas 까지는  => %d달  %d일 남았습니다.\n",
				left.getMonths(),left.getDays());
		
		// ** 마감일자 확인하기
		// between(now, endday)
		// => endday(마감일)-now 
		// => 년도의 차, 달의 차, 일의 차 를 알려줌 
		// => LocalDate의 parse 메서드 : String 을 LocalDate Type 으로 , 
		LocalDate endday = LocalDate.parse("2020-09-08");
		
		Period test = Period.between(now, endday);   
		System.out.println("Period test =>"+test);
		System.out.println("마감일 까지는 "+test.getYears()+"년"+test.getMonths()+"월"+test.getDays()+"일 남아있습니다.");
		if (test.isNegative()) { System.out.println("음수 입니다.. 마감됨 " ); } 
		else { System.out.println("음수가 아닙니다..마감 되지 않음" ); } 
		
		// 정확한 일 수의 차이 계산하기
		// => ChronoUnit 클래스의 between(Temporal start, Temporal end) 메소드
		// 	  리턴 타입은 long 	
		// => 즉, 실제 1개월 3일 차이 이면 33일이 나오도록 전체 일을 구하는 방법
		System.out.println("ChronoUnit.MONTHS=> "+ChronoUnit.MONTHS.between(now,endday));
		System.out.println("ChronoUnit.DAYS=> "+ChronoUnit.DAYS.between(now,endday));
	} // main
} // class
