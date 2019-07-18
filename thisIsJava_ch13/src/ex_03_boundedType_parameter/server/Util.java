package ex_03_boundedType_parameter.server;

import common.generic.Box;
import common.hierarcy_classes.Student;

public class Util {
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
	}

	// 제한된 타입 파라미터 vs 와일드 카드
	public static <T extends Student> Box<T> compareStudent_boundedType(Box<T> t) {
		T b1 = t.get();
		if (b1.toString().equals("학생")) {
			return t;
		}
		return null;
	}

	public static Box<? extends Student> compareStudent_wildcard(Box<? extends Student> t) {
		if (t.get().toString().equals("학생")) {
			return t;
		}
		return null;
	}
}
