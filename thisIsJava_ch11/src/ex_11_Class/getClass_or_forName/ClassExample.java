package ex_11_Class.getClass_or_forName;

import ex_11_Class.util.Car1;

/*
 * - ��Ÿ ������: Ŭ������ �̸�, ������ ����, �ʵ� ����, �޼ҵ� ������ ����
 * 
 * - ��Ÿ ������ ����
 *   - �ڹٴ� Ŭ������ �������̽��� ��Ÿ �����͸� java.lang ��Ű���� �Ҽӵ� Class Ŭ������ ������
 * - Class ��ü ���
 *   - Class�� �����ڸ� ���߰� �ֱ� ������ new �����ڷ� ��ü ���� �� ����
 *   1. �ش� Ŭ������ ��ü �������� ��: getClass() �޼ҵ� ���
 *     - Object Ŭ������ ���� �ִ� getClass() �޼ҵ� �̿�
 *     - Object Ŭ������ �ֻ��� Ŭ�����̹Ƿ� ��� Ŭ�������� ȣ�� ����
 *   2. ��ü �����ϱ� �� Class ��ü ��� ���: ���� �޼ҵ� forName() ���
 *     - forName() �޼ҵ�� Ŭ���� ��ü �̸�(��Ű���� ���Ե� �̸�)�� �Ű������� �ް� Class ��ü�� ����
 *     - �Ű������� �־��� Ŭ������ ã�� ���ϸ� ClassNotFoundException ���ܸ� �߻���Ű�Ƿ� ���� ó�� �ʿ�
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
