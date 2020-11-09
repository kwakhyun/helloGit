package gitTest;

import java.time.Duration;
import java.time.LocalTime;

// 날짜 & 시간
// 5.LocalTime : 시각정보만 표현하기위한 클래스
public class DateTime03_LocalTime {

	public static void main(String[] args) {
		// 5.LocalTime : 시각정보만 표현하기위한 클래스
		// ** 현재 시각
		LocalTime now = LocalTime.now();
		System.out.println("지금 시각: " + now);
		// => LocalTime 클래스의 toString() 메서드에 출력폼 정의

		// ** 2시간 10분 뒤 화상 미팅 예정
		// => LocalTime 인스턴스는 변경이 불가능한(immutable) 인스턴스이기 때문에
		// => 계산된 값을 담을 인스턴스가 필요함.
		LocalTime mt = now.plusHours(2);
		mt = mt.plusMinutes(10);

		// ** 화상 미팅 시각 출력
		System.out.println("화상 미팅 시각: " + mt);

		// Duration 클래스 이용하여 시간 표현하기
		// PC방 이용 시간 계산, 출력하기
		// 1) PC방의 PC 이용 시작 시각
		LocalTime start = LocalTime.of(14, 24, 35);
		System.out.println("PC 이용 시작 시각: " + start);

		// 2) PC방의 PC 이용 종료 시각
		LocalTime end = LocalTime.of(17, 31, 19);
		System.out.println("PC 이용 종료 시각: " + end);

		// 3) PC 이용 시간 계산 & 출력
		Duration between = Duration.between(start, end);
		System.out.println("총 PC 이용 시간: " + between);

	} // main
} // class
