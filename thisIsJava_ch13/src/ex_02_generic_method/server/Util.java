package ex_02_generic_method.server;

import common.generic.Box;
import common.generic.Pair;

/*
 * - 원래는 common.util(순서?)이겠지만 여기선 단원에 맞게 구분해서 코딩
 */

public class Util {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}

	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
}
