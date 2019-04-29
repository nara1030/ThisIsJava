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

	// RUNNABLE Ȯ�� ���� �߰��� �κ�
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

	public StatePrintThread(Thread targetThread) { // ���¸� ������ ������
		this.targetThread = targetThread;
	}

	@Override
	public void run() {
		while (true) {
			Thread.State state = targetThread.getState(); // ������ ���� ���
			System.out.println("Ÿ�� ������ ����: " + state);

			// �α�
			printLog(state.toString());

			// ��ü ���� ������ ��� ���� ��� ���·� ����
			if (state == Thread.State.NEW) {
				targetThread.start();
			}

			// ���� ������ ��� while���� ������
			if (state == Thread.State.TERMINATED) {
				break;
			}

			/*
			 * try { Thread.sleep(500); } catch (Exception e) { }
			 */

		}
	}
}
