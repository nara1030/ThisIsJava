package ex_01;

/*
 * - 중첩 클래스(중첩 인터페이스) 필요성
 *   클래스가 여러 클래스와 관계를 맺는 경우에는 독립적으로 선언하는 것이 좋으나,
 *   특정 클래스와 관계를 맺을 경우에는 관계 클래스를 클래스 내부에 선언하는 것이 좋음
 *   
 *   중첩 인터페이스는 주로 UI 프로그래밍에서 이벤트를 처리할 목적으로 많이 활용됨
 * 
 * - 중첩 클래스 장점
 *   1. 두 클래스의 멤버들 서로 쉽게 접근 가능
 *   2. 외부에는 불필요한 관계 클래스 감춤으로써 코드의 복잡성 감소
 * 
 * - 중첩 클래스 분류
 *   1. 멤버 클래스
 *     1-1. 인스턴스 멤버 클래스
 *     1-2. 정적 멤버 클래스
 *   2. 로컬 클래스
 *     - 로컬 클래스는 접근 제한자(public, private) 및 static을 붙일 수 없음
 *       - 메소드 내부에서만 사용되므로 접근을 제한할 필요가 없기 때문
 *     - 메소드가 실행될 때 메소드 내에서 객체를 생성하고 사용해야 함
 *       - 주로 비동기 처리를 위해 스레드 객체를 만들 때 사용
 *   
 * - 바이트 코드
 *   멤버 클래스(B)도 하나의 클래스이기 때문에 컴파일하면 바이트 코드 파일(.class)이 별도로 생성됨
 *   1. 멤버 클래스: A $ B .class
 *   2. 로컬 클래스: A $1 B .class
 */
public class Main {
	public static void main(String[] args) {
		// 인스턴스 멤버 클래스 객체 생성
		A a = new A();
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();

		// 정적 멤버 클래스 객체 생성
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();

		// 로컬 클래스 객체 생성을 위한 메서드 호출
		a.method();
	}
}
