package ex_10.sol_01;

/*
 * - ���� ��Ȳ
 *   �����尡 ��� ���� ��ü�� �ٸ� �����尡 ������ �� ������ �Ϸ��� ������ �۾��� ���� ������ ��ü�� ����� �ɾ
 *   �ٸ� �����尡 ����� �� ������ �ؾ� �Ѵ�.
 *
 * - �ذ�å
 *   ��Ƽ ������ ���α׷����� �� �ϳ��� �����常 ������ �� �ִ� �ڵ� ������ �Ӱ� ����(critical section)�̶�� �Ѵ�.
 *   synchronized Ű����� �ν��Ͻ��� ���� �޼��� ���� ���� �� �ִ�.
 *   
 *   �����尡 ��ü ������ ����ȭ �޼��� �Ǵ� ��Ͽ� ���� ��� ��ü�� ����� �ɾ� �ٸ� �����尡 �Ӱ� ���� �ڵ带 �������� ���ϵ��� �Ѵ�.
 *   
 * - ���
 *   1. ����ȭ �޼���
 *   2. ����ȭ ���
 *   	- �޼��� ��ü ������ �ƴ϶�, �Ϻ� ���븸 �Ӱ� �������� ����� ���� �� ���
 */
public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	// ����ȭ �޼���
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}
