package ex_05;

/*
 * - ���� ó�� �ڵ��
 *   ���α׷����� ���ܰ� �߻����� ��� ���α׷��� ���۽����� ���Ḧ ����,
 *   ���� ������ ������ �� �ֵ��� ó���ϴ� �ڵ带 ��Ī
 * 
 * - ����
 *   ������ ���� Ȥ�� �޼��� ���ο��� �ۼ�
 *   try-catch-finally ��� ���
 *   
 * - ClassNotFoundException
 *   �Ϲ� �����̹Ƿ� �����Ϸ��� �����ڷ� �Ͽ��� ���� ó���ϵ��� �䱸
 *   
 * - Class.forName(�Ű���)
 *   �Ű������� �־��� Ŭ������ �����ϸ� Class ��ü�� ����������,
 *   �������� ������ ClassNotFoundException ���� �߻���Ŵ
 */
public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}
}
