package ex_03;

/*
 * - ��� Ŭ�������� ��� ����(��ø Ŭ������ ���� ���� 2)
 *   ��� Ŭ������ �ν��Ͻ� �Ǵ� �������� ����ʿ� ����
 *   ��� Ŭ���� ���ο��� �ٱ� Ŭ������ ��� �ʵ�� ��� �޼ҵ带 ������ ������ ������ ������.
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
