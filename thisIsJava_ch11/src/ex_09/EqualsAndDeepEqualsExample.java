package ex_09;

import java.util.Arrays;
import java.util.Objects;

/*
 * - ��ü ���� ��
 *   1. Objects.equals(Object a, Object b)
 *     - a�� b�� ��� null�� ���: true ����
 *     - �� ���� ���: a.equals(b)�� ��� ����
 *   2. Objects.deepEquals(Object a, Object b)
 *     - a�� b�� �ٸ� �迭������ �׸� ���� ��� ���� ���: true ����
 *     - Arrays.deepEquals(Object[] a, Object[] b)�� ��� ����
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
