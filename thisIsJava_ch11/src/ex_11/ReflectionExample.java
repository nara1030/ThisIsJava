package ex_11;

import java.lang.reflect.Constructor;

/*
 * - 리플랙션(Reflection)
 *   - Class 객체를 이용해 클래스의 생성자, 필드, 메소드 정보를 알아내는 것
 * 
 * - Class 객체가 리플랙션을 위해 제공하는 메소드
 *   1. getDeclaredContructors()
 *   2. getDeclaredFields()
 *   3. getDeclaredMethods()
 */
public class ReflectionExample {
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("ex_11.Car");

		System.out.println("[클래스 이름]");
		System.out.println(clazz.getName());
		System.out.println();

		System.out.println("[생성자 정보]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes();
			
		}
	}
}
