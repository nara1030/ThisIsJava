package ex_04;

import java.util.Date;

/*
 * - Object Ŭ������ toString() �޼ҵ�� ��ü�� ���� ������ ����
 *   - ��ü�� ���� ������ ��ü�� ���ڿ��� ǥ���� ��
 *   - "Ŭ������@16�����ؽ��ڵ�"
 *   
 * - Object�� ���� Ŭ������ ������ ���� �����ϵ��� toString() �޼ҵ� ������
 *   - Object�� toString() �޼ҵ��� ���ϰ��� �ڹ� ���ø����̼ǿ����� �߿����� ���� ����
 *   - ex.
 *     - java.util ��Ű�� Date Ŭ����: ���� �ý����� ��¥�� �ð� ���� ����
 *     - String Ŭ����: �����ϰ� �ִ� ���ڿ� ����
 */
public class ToStringExample {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();

		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}
}
