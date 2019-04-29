package ex_01;

import java.util.Calendar;

/*
 * - 사용법
 *   열거 타입을 선언했다면 이제 열거 타입을 사용할 수 있음
 *   열거 타입도 하나의 데이터 타입이므로 변수를 선언하고 사용해야 함
 *   
 *   열거 상수는 단독으로 사용할 수는 없고 반드시 열거타입.열거상수로 사용
 *   
 * - 참고
 *   열거 타입 변수는 null 값을 저장할 수 있음
 *   열거 타입도 참조 타입이기 때문
 *   
 *   참조 타입 변수는 객체를 참조하는 변수라고 알고 있는데,
 *   그렇다면 열거 상수는 객체일까?
 *   그렇다.
 *   열거 타입 Week의 경우 총 7개의 Week 객체로 생성됨
 *   
 */
public class EnumWeekExample {
	public static void main(String[] args) {
		Week today = null; // 열거 타입 변수 선언

		Calendar calendar = Calendar.getInstance();
		int week = calendar.get(Calendar.DAY_OF_WEEK); // 일(1)~토(7)까지의 숫자를 리턴

		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}

		System.out.println("오늘 요일: " + today);

		if (today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}
	}
}
