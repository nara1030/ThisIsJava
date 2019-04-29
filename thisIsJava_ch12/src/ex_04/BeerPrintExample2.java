package ex_04;

import java.awt.Toolkit;

/*
 * Runnable �������̽��� run() �޼��� �ϳ��� ���ǵǾ� �ֱ� ������ �Լ��� �������̽��̴�.
 * ���� ������ ���� ���ٽ��� �Ű������� ����� ���� �ִ�.
 */
public class BeerPrintExample2 {
	public static void main(String[] args) {
		// ���ٽ� �̿�(�ڹ� 8���� ����)
		Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
			}
		});
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}
