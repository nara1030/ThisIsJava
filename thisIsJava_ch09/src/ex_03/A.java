package ex_03;

/*
 * - 멤버 클래스에서 사용 제한(중첩 클래스의 접근 제한 2)
 *   멤버 클래스가 인스턴스 또는 정적으로 선언됨에 따라
 *   멤버 클래스 내부에서 바깥 클래스의 모든 필드와 모든 메소드를 접근할 때에도 제한이 따른다.
 */
public class A {
	int field1;

	void method1() {
	}

	static int field2;

	static void method2() {
	}

	class B {
		void method() {
			field1 = 10;
			method1();

			field2 = 10;
			method2();
		}
	}

	static class C {
		void method() {
			// field1 = 10;
			// method1();

			field2 = 10;
			method2();
		}
	}
}
