package gitTest;

import java.time.Duration;
import java.time.Instant;

// 날짜 & 시간
// 1. Instant : 흐르는 시간 속에서 특정 시점 포착
// 2. Duration : 두시각의 차이 , 즉 시간을 표현
public class DateTime01_InstDura {

	public static void main(String[] args) {
		// 1.Instant : 흐르는 시간 속에서 특정 시점 포착
		// => 나노 초 까지 지원
		// now() : 현재시각정보
		// epoch : (중요한 사건·변화들이 일어난) 시대, 세대
		// 표준 자바 epoch : 1700-01-01 00:00:00 날짜.시간을 계산하는 기준값
		// => 이 값을 기준으로 지나온 시간을 초단위로 계산하여 숫자값으로 가지고 있음.
		Instant start = Instant.now();
		System.out.println("start :"+start.getEpochSecond());
		System.out.println("Time flies like an arrow.");
		Instant end = Instant.now();
		System.out.println("start :"+end.getEpochSecond());
		// 2.Duration : 두시각의 차이 , 즉 시간을 표현
		// => 스톱워치기능 구현
		Duration between = Duration.between(start, end) ;
		System.out.println("between :"+between.toMillis());
		// 밀리초 : 천분의 1 초
	} // main
} // class
