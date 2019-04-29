package ex_01;

/*
 * - 날짜 및 요일, 시간을 얻는 방법
 *   자바는 컴퓨터의 날짜 및 요일, 시간을 프로그램에서 사용할 수 있도록 하기 위해
 *   Date, Calendar, LocalDateTime 등의 클래스를 제공
 *   
 *   이 중, LocalDateTime은 자바 8부터 지원하는 API임
 * 
 * - Calendar 클래스
 *   이전 버전과의 호환성을 위해 보통 Calendar를 이용해서 날짜와 시간을 얻음
 *   
 * - Calendar 사용법
 *   1. 우선 Calendar 변수를 선언하고 Calendar.getInstance() 메소드가 리턴하는
 *      Calendar 객체를 얻음
 *   2. Calendar 객체를 얻었다면 get() 메소드를 이용해서
 *      년, 월, 일, 요일, 시간, 분, 초를 얻을 수 있음
 * 
 *  - 의문점
 *    1. Calendar 클래스는 싱글톤인가?
 *    2. 
 *    
 * 
 */
public class Calendar {
	public static void main(String[] args) {
		java.util.Calendar now = java.util.Calendar.getInstance();

		int year = now.get(java.util.Calendar.YEAR); // 년
		int month = now.get(java.util.Calendar.MONTH); // 월(1~12)
		int day = now.get(java.util.Calendar.DAY_OF_MONTH); // 일
		int week = now.get(java.util.Calendar.DAY_OF_WEEK); // 요일(1~7)
		int hour = now.get(java.util.Calendar.HOUR); // 시간
		int minute = now.get(java.util.Calendar.MINUTE); // 분
		int second = now.get(java.util.Calendar.SECOND); // 초

		System.out.print("년: " + year + "\t" + "월: " + month + "\t" + "일: " + day + "\t" + "요일: " + week + "\n" + "시간: "
				+ hour + "\t" + "분: " + minute + "\t" + "초: " + second);
	}
}
