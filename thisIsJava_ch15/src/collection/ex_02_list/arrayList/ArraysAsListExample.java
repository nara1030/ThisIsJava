package collection.ex_02_list.arrayList;

import java.util.Arrays;
import java.util.List;

/*
 * Case2. 고정된 객체들로 구성된 List를 생성하는 경우
 *   - 이 경우 Arrays.asList(T...a) 메소드 사용
 */
public class ArraysAsListExample {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동", "신용권", "김자바");
		for (String name : list1) {
			System.out.println(name);
		}

		List<Integer> list2 = Arrays.asList(1, 2, 3);
		for (int value : list2) {
			System.out.println(value);
		}
	}
}
