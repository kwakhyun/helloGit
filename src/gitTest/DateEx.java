package gitTest;

import java.text.SimpleDateFormat;
import java.util.Date;

// ** Date 
// => 날짜 처리 클래스  
// => 컴퓨터의 현재 날짜.시간를 읽어 Date 객체를 생성
// => 비권장( 더이상 지원하지 않음 )  
//    Deprecated :중요도가 떨어져 더 이상 사용되지 않고 앞으로는 사라지게 될 (컴퓨터 시스템 기능 등)

// ** SimpleDateFormat
// => Date Type 의 날짜 시간의 포맷을 잡아주는 클래스

public class DateEx {

	public static void main(String[] args) {
		Date now = new Date() ;
		System.out.println("now 1 => "+now);
		System.out.println("getYear => "+(1900+now.getYear()));
		System.out.println("getMonth => "+(now.getMonth()+1));
		System.out.println("getDate => "+now.getDate());
		System.out.println("getDay => "+now.getDay() );

		now.setHours(17);
		now.setMinutes(50);
		now.setSeconds(55);
		System.out.println("now 2 => "+now);
		
		// SimpleDateFormat 적용하기
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sf.format(now));
		
		sf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sf.format(now));
		
		sf = new SimpleDateFormat("yyyy:MM:dd a HH:mm:ss");
		System.out.println(sf.format(now));
		
		sf = new SimpleDateFormat("오늘은 E요일");
		System.out.println(sf.format(now));
		
		sf = new SimpleDateFormat("오늘은 올해의 D번째 날");
		System.out.println(sf.format(now));
		
		sf = new SimpleDateFormat("오늘은 이달의 d번째 날");
		System.out.println(sf.format(now));

	} // main
} // class
