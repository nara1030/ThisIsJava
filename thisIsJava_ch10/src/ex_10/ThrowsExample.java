package ex_10;

/*
 * - throws Ű����
 *   �޼��� ���ο��� ���ܰ� �߻��� �� �ִ� �ڵ带 �ۼ��� ��
 *   try-catch ������� ���ܸ� ó���ϴ� ���� �⺻������,
 *   ��쿡 ���󼭴� �޼ҵ带 ȣ���� ������ ���ܸ� ���ѱ� ���� ����
 *   
 *   ��, �޼ҵ忡�� ó������ ���� ���ܸ� ȣ���� ������ ���ѱ�� ������ ��
 *   ���� throws Ű���尡 �پ��ִ� �޼ҵ�� �ݵ�� try ��� ������ ȣ��Ǿ�� ��
 * 
 * - ����
 *   �޼ҵ� ����� ���� �ۼ�
 *   throws Ű���� �ڿ� ���ѱ� ���� Ŭ������ ��ǥ�� �����ؼ� ����
 */
public class ThrowsExample {
	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}

	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}
}
