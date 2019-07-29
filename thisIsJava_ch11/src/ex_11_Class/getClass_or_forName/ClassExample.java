package ex_11_Class.getClass_or_forName;

import ex_11_Class.util.Car1;

/*
 * - 메타 데이터: 클래스의 이름, 생성자 정보, 필드 정보, 메소드 정보를 말함
 * 
 * - 메타 데이터 관리
 *   - 자바는 클래스와 인터페이스의 메타 데이터를 java.lang 패키지에 소속된 Class 클래스로 관리함
 * - Class 객체 얻기
 *   - Class는 생성자를 감추고 있기 때문에 new 연산자로 객체 만들 수 없음
 *   1. 해당 클래스로 객체 생성했을 때: getClass() 메소드 사용
 *     - Object 클래스가 갖고 있는 getClass() 메소드 이용
 *     - Object 클래스는 최상위 클래스이므로 모든 클래스에서 호출 가능
 *   2. 객체 생성하기 전 Class 객체 얻는 방법: 정적 메소드 forName() 사용
 *     - forName() 메소드는 클래스 전체 이름(패키지가 포함된 이름)을 매개값으로 받고 Class 객체를 리턴
 *     - 매개값으로 주어진 클래스를 찾지 못하면 ClassNotFoundException 예외를 발생시키므로 예외 처리 필요
 * 
 * - Class vs. Class<T>
 *   -
 */
public class ClassExample {
	public static void main(String[] args) {
		Car1 car = new Car1();
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();

		try {
			Class clazz2 = Class.forName("ex_11_Class.util.Car1");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
