package ex_11_Class.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

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
		Class clazz = Class.forName("ex_11_Class.util.Car2");

		System.out.println("[클래스 이름]");
		System.out.println(clazz.getName());
		System.out.println();

		System.out.println("[생성자 정보]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		System.out.println();

		System.out.println("[필드 정보]");
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}
		System.out.println();

		System.out.println("[메소드 정보]");
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.print(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
	}

	private static void printParameters(Class[] parameters) {
		for (int i = 0; i < parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if (i < (parameters.length - 1)) {
				System.out.print(",");
			}
		}
	}
}
