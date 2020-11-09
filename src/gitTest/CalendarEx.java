package gitTest;

import java.util.Calendar;
import java.util.Formatter;

// Calendar : 추상 클래스 이므로 new 인스턴스 생성 불가
// => 날짜, 시간 계산법이 지역과 문화에 따라 다르기 때문에 꼭 필요한 메서드만 정의,
//   특정한 역법을 따르는경우엔 하위 클래스에서 구현 하도록	
// Formatter 활용
// => Calendar Type 의 출력 Format 지원 
public class CalendarEx {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		// getInstance() 메서드로 Calendar 객체 얻기
	 	// getInstance() 
	 	// => Calendar 클래스의 정적(static) 메서드로써 OS에 설정된 시간정보 제공
		
		int yy_w = now.get(Calendar.WEEK_OF_YEAR);
		// Calendar 객체 얻은 후 get() 메서드로 날짜 ,시간 등등 얻음
	 	// 이때 사용되는 인자값은 Calendar 클래스에 선언된 상수	
		int yy = now.get(Calendar.YEAR);
		int mm = now.get(Calendar.MONTH);
		int dd = now.get(Calendar.DATE);
		
		System.out.printf("오늘은 %d년 %d월 %d일 이고, 올해의 %d 번째 주 입니다.",yy,mm,dd,yy_w);
		
		int hh=now.get(Calendar.HOUR);
		int min=now.get(Calendar.MINUTE);
		int sec=now.get(Calendar.SECOND);
		int hour=now.get(Calendar.HOUR_OF_DAY);
		
		int ap=now.get(Calendar.AM_PM);
		String ampm="";
		if (ap==0) ampm="AM";
		else ampm="PM";
		System.out.printf("지금은  %s %d시 %d분 %d초 이고, 지금은 %d시 입니다.\n",ampm,hh,min,sec,hour);
		
		// Formatter 활용
		Formatter f= new Formatter();
		// % : 출력형식을 의미하는 문자열은 반드시 %로 시작,
		// http://docs.oracle.com/javase/8/docs/api/Formatter 에서 찾아보기
		// %t : 날짜 시간을 , T 시간 출력 형식 
		// %n : 줄바꿈
		f.format("%tR%n", now); // 시간을 R 타입으로
		f.format("%tT%n", now); 
		f.format("%tr%n", now); 
		f.format("%tD%n", now); 
		f.format("%tF%n", now); 
		
		// ISO 8601 은 국제 표준화 기구(ISO)에서 제정한 날짜와 시간의 표기에 관한 국제표준규격
		f.format("tc=> %tc%n" , now) ; 
	    //  KST : Korea Standard Time의 약자로 한국 표준시간 
		
		System.out.println("toString=> \n"+f.toString());  
		// f 라는 Formatter 참조변수가 가지고 있는 포맷형식을 문자열로 생성 출력

		System.out.printf("printf tF => %tF%n" , now);
	} // main
} // class
