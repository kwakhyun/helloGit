package gitTest;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

// 날짜 & 시간
// 6. LocalDateTime : 날짜와 시각정보를 모두 표현하기위한 클래스
public class DateTime04_LocalDateTime {

	public static void main(String[] args) {
		// 6.LocalDateTime : 날짜와 시각정보를 모두 표현하기위한 클래스
		// ** 현재 날짜와 시각
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);

		// ** 시간 연산
		// 영국 바이어와 22시간 35분 뒤 화상 미팅 예정
		LocalDateTime mt = dt.plusHours(22);
		mt = mt.plusMinutes(35);
		// 화상 미팅 날짜와 시각 출력
		System.out.println(mt);

		// ** 원하는 시간의 인스턴스 만들기
		// of 메서드 => 매개변수의 종류를 (년,월,일,시,분) (년,월,일,시,분,초) 등 다양하게 오버로딩되어 있음
		// 1) 현재시간
		LocalDateTime today = LocalDateTime.of(2020, 4, 25, 11, 20);
		// 2) 항공편1의 출발 시간
		LocalDateTime flight1 = LocalDateTime.of(2020, 5, 14, 11, 15);
		// 3) 항공편2의 출발 시간
		LocalDateTime flight2 = LocalDateTime.of(2020, 5, 13, 15, 30);

		// 4) 빠른 항공편 선택하기
		LocalDateTime myFlight;
		// 1 isBefore 2 가 참이면 true -> 즉, 1이 2 보다 이전이면 true
		if (flight1.isBefore(flight2))
			myFlight = flight1;
		else
			myFlight = flight2;

		// 빠른 항공편의 비행 탑승까지 남은 날짜 계산
		Period day = Period.between(today.toLocalDate(), myFlight.toLocalDate());
		// 빠른 항공편의 비행 탑승까지 남은 시간 계산
		Duration time = Duration.between(today.toLocalTime(), myFlight.toLocalTime());

		// 비행 탑승까지 남은 날짜와 시간 출력
		System.out.println(day);
		System.out.println(time);

	} // main
} // class
