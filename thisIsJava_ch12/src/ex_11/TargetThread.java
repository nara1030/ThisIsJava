package ex_11;

/*
 * - NEW -> RUNNABLE -> TIMED_WAITING -> RUNNABLE -> TERMINATED
 * 
 *   TargetThread가 객체로 생성되면 NEW 상태를 가지고,
 *   run() 메소드가 종료되면 TERMINATED 상태가 되므로 위와 같은 상태로 변한다.
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
