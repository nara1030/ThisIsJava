package ex_09;

/*
 * - �ڹ� 7���� ���� �߰��� try-with-resources
 *   �� ����ϸ� ���� �߻� ���ο� ������� ����ߴ� ���ҽ� ��ü��
 *   close() �޼ҵ带 ȣ���ؼ� �����ϰ� ���ҽ��� �ݾ���
 *   
 *   �� ��������� close()�� ȣ���� �ʿ� ����
 * 
 * - ���ҽ� ��ü
 *   ���� ����� ��Ʈ��, ���� ����, ����, ���� ä��
 *   
 *   å������ ���ҽ��� ���� �����͸� �а� ���� ��ü��� ������
 *   �� �� ��ü������ ���ϸ� �̶� ���ҽ��� �޸𸮿� �Ҵ�� �ν��Ͻ��� �ƴ� �ü���� �ڿ�(�ý��� �ڿ�)��
 *   
 * - try-with-resources�� ����ϱ� ���� ����
 *   ���ҽ� ��ü�� java.lang.AutoCloseable �������̽��� �����ϰ� �־�� ��
 *   
 *   AutoCloseable���� close() �޼ҵ尡 ���ǵǾ� �ִµ� 
 *   try-with-resources��  �� close() �޼ҵ带 �ڵ� ȣ����
 *   ���� �߻� ���ο� ���� ���� ����Ǵµ�, ���� �߻��� catch �̵� �� close() �޼ҵ� ȣ��
 */
public class TryWithResourceExample_01 {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception(); // ���������� ���� �߻���Ŵ
		} catch (Exception e) {
			System.out.println("���� ó�� �ڵ尡 ����Ǿ����ϴ�.");
		}
	}
}