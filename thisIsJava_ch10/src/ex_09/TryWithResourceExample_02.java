package ex_09;

import java.io.IOException;

/*
 * - �ڹ� 6
 *   try-with-resources�� ������ �ٸ���.
 *   �� ��� catch�� ������ ���ҽ��� �ݾ��ش�.
 * 
 * - �ǹ�
 *   1. �� IOException���� ���� ó���ϸ� ���� ����?
 *     - ���� ������� FileInputStream Ŭ������ �ƴ϶�
 *       java.io.FileInputStream Ŭ������ ���� ���� �������� ����
 *   2. �޼ҵ� ���� class ����ο��� throws ���� �� �ֳ�?
 */
public class TryWithResourceExample_02 {
	public static void main(String[] args) {
		java.io.FileInputStream fis = null;
		try {
			fis = new java.io.FileInputStream("file.txt");
			fis.read();
			throw new IOException();
		} catch (IOException e) {
			System.out.println("���� ó�� �ڵ尡 ����Ǿ����ϴ�.");
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
				}
			}
		}
	}
}
