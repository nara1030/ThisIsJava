package ex_07;

/*
 * - ����
 *   run�� �������̵� �����ϰ� setName�� �������� �ʴ�.
 *   
 * - Q: static���� final�ΰ�?
 * - A: public final void setName(String name)
 * -    public final String getName
 */
public class ThreadA extends Thread {
	public ThreadA() {
		setName("ThreadA");
	}

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "�� ����� ����");
		}
	}
}
