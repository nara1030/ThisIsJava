package ex_05;

import java.awt.Toolkit;

/*
 * BeepThread Ŭ������ ���� ����(~ex_04)�� �����ؼ� Runnable�� �������� �ʰ�
 * Thread�� ���� Ŭ������ �۾� �����带 ������ ���̴�.
 */
public class BeepThread extends Thread {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}
