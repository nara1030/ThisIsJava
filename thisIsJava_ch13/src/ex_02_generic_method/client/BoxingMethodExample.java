package ex_02_generic_method.client;

import common.generic.Box;
import ex_02_generic_method.server.Util;

/*
 * - 제네릭 메소드를 호출하는 두 가지 방법
 */
public class BoxingMethodExample {
	public static void main(String[] args) {
		// 방법1. 타입 파라미터를 명시적으로 Integer로 지정
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();

		// 방법2. 타입 파라미터를 String으로 추정
		Box<String> box2 = Util.boxing("홍길동");
		String strValue = box2.get();
	}
}
