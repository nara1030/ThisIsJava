package ex_11;

import java.lang.reflect.Constructor;

/*
 * - ���÷���(Reflection)
 *   - Class ��ü�� �̿��� Ŭ������ ������, �ʵ�, �޼ҵ� ������ �˾Ƴ��� ��
 * 
 * - Class ��ü�� ���÷����� ���� �����ϴ� �޼ҵ�
 *   1. getDeclaredContructors()
 *   2. getDeclaredFields()
 *   3. getDeclaredMethods()
 */
public class ReflectionExample {
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("ex_11.Car");

		System.out.println("[Ŭ���� �̸�]");
		System.out.println(clazz.getName());
		System.out.println();

		System.out.println("[������ ����]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes();
			
		}
	}
}
