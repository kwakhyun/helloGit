package gitTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GitTestMain {

	public static void main(String[] args) {
		// ** LocalDateTime
		//	=> 날짜와 시각정보를 모두 표현하기위한 클래스
		// 	=> now() : 현재 날짜와 시각
		LocalDateTime today = LocalDateTime.now();
		System.out.println("** LocalDateTime today   => " + today);
		// => LocalDateTime 클래스의 toString() 메서드에 출력폼 정의
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm:ss");
		System.out.println("** LocalDateTime pattern => " + today.format(df));
		
	} // main
} // class
