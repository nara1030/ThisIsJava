package ex_01;

/*
 * - ��¥ �� ����, �ð��� ��� ���
 *   �ڹٴ� ��ǻ���� ��¥ �� ����, �ð��� ���α׷����� ����� �� �ֵ��� �ϱ� ����
 *   Date, Calendar, LocalDateTime ���� Ŭ������ ����
 *   
 *   �� ��, LocalDateTime�� �ڹ� 8���� �����ϴ� API��
 * 
 * - Calendar Ŭ����
 *   ���� �������� ȣȯ���� ���� ���� Calendar�� �̿��ؼ� ��¥�� �ð��� ����
 *   
 * - Calendar ����
 *   1. �켱 Calendar ������ �����ϰ� Calendar.getInstance() �޼ҵ尡 �����ϴ�
 *      Calendar ��ü�� ����
 *   2. Calendar ��ü�� ����ٸ� get() �޼ҵ带 �̿��ؼ�
 *      ��, ��, ��, ����, �ð�, ��, �ʸ� ���� �� ����
 * 
 *  - �ǹ���
 *    1. Calendar Ŭ������ �̱����ΰ�?
 *    2. 
 *    
 * 
 */
public class Calendar {
	public static void main(String[] args) {
		java.util.Calendar now = java.util.Calendar.getInstance();

		int year = now.get(java.util.Calendar.YEAR); // ��
		int month = now.get(java.util.Calendar.MONTH); // ��(1~12)
		int day = now.get(java.util.Calendar.DAY_OF_MONTH); // ��
		int week = now.get(java.util.Calendar.DAY_OF_WEEK); // ����(1~7)
		int hour = now.get(java.util.Calendar.HOUR); // �ð�
		int minute = now.get(java.util.Calendar.MINUTE); // ��
		int second = now.get(java.util.Calendar.SECOND); // ��

		System.out.print("��: " + year + "\t" + "��: " + month + "\t" + "��: " + day + "\t" + "����: " + week + "\n" + "�ð�: "
				+ hour + "\t" + "��: " + minute + "\t" + "��: " + second);
	}
}
