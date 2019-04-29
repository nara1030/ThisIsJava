package ex_01;

import java.util.Calendar;

/*
 * - ����
 *   ���� Ÿ���� �����ߴٸ� ���� ���� Ÿ���� ����� �� ����
 *   ���� Ÿ�Ե� �ϳ��� ������ Ÿ���̹Ƿ� ������ �����ϰ� ����ؾ� ��
 *   
 *   ���� ����� �ܵ����� ����� ���� ���� �ݵ�� ����Ÿ��.���Ż���� ���
 *   
 * - ����
 *   ���� Ÿ�� ������ null ���� ������ �� ����
 *   ���� Ÿ�Ե� ���� Ÿ���̱� ����
 *   
 *   ���� Ÿ�� ������ ��ü�� �����ϴ� ������� �˰� �ִµ�,
 *   �׷��ٸ� ���� ����� ��ü�ϱ�?
 *   �׷���.
 *   ���� Ÿ�� Week�� ��� �� 7���� Week ��ü�� ������
 *   
 */
public class EnumWeekExample {
	public static void main(String[] args) {
		Week today = null; // ���� Ÿ�� ���� ����

		Calendar calendar = Calendar.getInstance();
		int week = calendar.get(Calendar.DAY_OF_WEEK); // ��(1)~��(7)������ ���ڸ� ����

		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}

		System.out.println("���� ����: " + today);

		if (today == Week.SUNDAY) {
			System.out.println("�Ͽ��Ͽ��� �౸�� �մϴ�.");
		} else {
			System.out.println("������ �ڹ� �����մϴ�.");
		}
	}
}
