package ex_08;
/*
 * �����ߴ� ����� Thread10�� ���� ������ ������ ���̴�.
 * ������ �׷��� ���� ������ �� ������ �̱� �ھ ������ �����̱� �����̴�.
 * 
 * - ���ļ�(Parallelism) vs. ���ü�(Concurrency)
 *   ������: �� �� ��Ƽ�۾��� ������
 *   ���ü�: �ϳ��� �ھ�(CPU)���� ��Ƽ �����尡 �����ư��� ����
 *   ���ļ�: ��Ƽ �ھ�� ���� �����带 ���ÿ� ���� 
 * 
 * - �ھ� ���� Ȯ��
 *   Ctrl + Shift + Esc -> ���� ��  
 *   
 * �������� ������ �ھ��� ������ ���� ���,
 * �����带 � ������ ���� ���ü����� ������ ���ΰ��� �����ؾ� �ϴµ�
 * �̸� ������ �����ٸ��̶�� �Ѵ�.
 * 
 * - �ڹ��� ������ �����ٸ�
 *   1. �켱����(Priority) ���: �����ڰ� �ڵ�� ����
 *   	- ��� ��������� �⺻������ 5�� �켱������ �Ҵ����
 *   2. ��ȯ �Ҵ�(Round-Robin) ���: JVM�� ����
 * 
 */
public class PriorityExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			Thread thread = new CalcThread("thread" + i);
			if (i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			} else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}
	}
}
