package ex_04;

/*
 * - System.out.println() �޼ҵ�
 *   - �츮�� ���ݱ��� �ֿܼ� ����ϱ� ���� ���
 *   - ��� ����(�Ű���)
 *     1. �⺻ Ÿ��(byte, short, int, ...): �ش� �� �״�� ���
 *     2. ��ü: ��ü�� toString() �޼ҵ� ȣ���ؼ� ���� �� ���
 */
public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("����", "�ȵ���̵�");

		String strObj = myPhone.toString();
		System.out.println(strObj);

		System.out.println(myPhone);
	}
}
