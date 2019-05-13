package ex_09;

import java.util.Arrays;
import java.util.Objects;

/*
 * - 객체 동등 비교
 *   1. Objects.equals(Object a, Object b)
 *     - a와 b가 모두 null일 경우: true 리턴
 *     - 그 외의 경우: a.equals(b)의 결과 리턴
 *   2. Objects.deepEquals(Object a, Object b)
 *     - a와 b가 다른 배열이지만 항목 값이 모두 같을 경우: true 리턴
 *     - Arrays.deepEquals(Object[] a, Object[] b)의 결과 리턴
 */
public class EqualsAndDeepEqualsExample {
	public static void main(String[] args) {
		Integer o1 = 1000;
		Integer o2 = 1000;
		System.out.println(Objects.equals(o1, o2));
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.equals(null, null));
		System.out.println(Objects.deepEquals(o1, o2) + "\n");

		Integer[] arr1 = { 1, 2 };
		Integer[] arr2 = { 1, 2 };
		System.out.println(Objects.equals(arr1, arr2));
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Arrays.deepEquals(arr1, arr2));
		System.out.println(Objects.deepEquals(null, arr2));
		System.out.println(Objects.deepEquals(arr1, null));
		System.out.println(Objects.deepEquals(null, null));
	}
}
