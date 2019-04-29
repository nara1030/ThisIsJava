package ex_11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/*
 * - Thread.State: Nested class(static class)
 *   https://docs.oracle.com/javase/7/docs/api/java/lang/Thread.html
 */
public class StatePrintThread extends Thread {
	private Thread targetThread;

	// RUNNABLE 확인 위해 추가한 부분
	public void printLog(String log) {
		File file = new File("C:\\Users\\nara1\\eclipse-workspace\\temp.txt");
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		try {
			fileWriter = new FileWriter(file, true);
			bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(log + "\r\n");
		} catch (Exception e1) {
			e1.printStackTrace();
		} finally {
			try {
				bufferedWriter.close();
				fileWriter.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public StatePrintThread(Thread targetThread) { // 상태를 조사할 스레드
		this.targetThread = targetThread;
	}

	@Override
	public void run() {
		while (true) {
			Thread.State state = targetThread.getState(); // 스레드 상태 얻기
			System.out.println("타겟 스레드 상태: " + state);

			// 로그
			printLog(state.toString());

			// 객체 생성 상태일 경우 실행 대기 상태로 만듦
			if (state == Thread.State.NEW) {
				targetThread.start();
			}

			// 종료 상태일 경우 while문을 종료함
			if (state == Thread.State.TERMINATED) {
				break;
			}

			/*
			 * try { Thread.sleep(500); } catch (Exception e) { }
			 */

		}
	}
}
