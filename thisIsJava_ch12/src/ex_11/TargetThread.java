package ex_11;

/*
 * - NEW -> RUNNABLE -> TIMED_WAITING -> RUNNABLE -> TERMINATED
 * 
 *   TargetThread�� ��ü�� �����Ǹ� NEW ���¸� ������,
 *   run() �޼ҵ尡 ����Ǹ� TERMINATED ���°� �ǹǷ� ���� ���� ���·� ���Ѵ�.
 */
public class TargetThread extends Thread {
	@Override
	public void run() {
		// RUNNABLE
		for (int i = 0; i < 1000000000; i++) {
		}

		// TIMED_WAITING
		try {
			Thread.sleep(1500);
		} catch (Exception e) {
		}

		// RUNNABLE
		for (int i = 0; i < 1000000000; i++) {
		}
	}
}
