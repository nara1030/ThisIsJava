package ex_01;

/*
 * - 도입 배경
 *   데이터 중에는 몇 가지로 한정된 값만을 갖는 경우가 있음
 * 
 * - 열거 타입(enumeration type)
 *   몇 개의 한정된 값만을 갖는 데이터 타입
 *   예1. 요일: 월, 화, 수, 목, 금, 토, 일
 *   예2. 계절: 봄, 여름, 가을, 겨울
 *   
 *   즉, 열거 타입은 몇 개의 열거 상수(enumeration constant) 중에서
 *   하나의 상수를 저장하는 데이터 타입임
 * 
 * - 작성법(선언)
 *   열거 타입: 소스 파일명과 대소문자가 모두 일치해야 함
 *   열거 상수: 관례적으로 모두 대문자 작성 & 단어 사이는 밑줄(_)로 연결
 */
public enum Week {
	MONDAY
	, TUESDAY
	, WEDNESDAY
	, THURSDAY
	, FRIDAY
	, SATURDAY
	, SUNDAY
}
