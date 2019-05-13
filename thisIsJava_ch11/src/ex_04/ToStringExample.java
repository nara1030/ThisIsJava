package ex_04;

import java.util.Date;

/*
 * - Object 클래스의 toString() 메소드는 객체의 문자 정보를 리턴
 *   - 객체의 문자 정보란 객체를 문자열로 표현한 값
 *   - "클래스명@16진수해시코드"
 *   
 * - Object의 하위 클래스는 유익한 정보 리턴하도록 toString() 메소드 재정의
 *   - Object의 toString() 메소드의 리턴값은 자바 애플리케이션에서는 중요하지 않은 정보
 *   - ex.
 *     - java.util 패키지 Date 클래스: 현재 시스템의 날짜와 시간 정보 리턴
 *     - String 클래스: 저장하고 있는 문자열 리턴
 */
public class ToStringExample {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();

		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}
}
