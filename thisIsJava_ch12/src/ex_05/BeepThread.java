package ex_05;

import java.awt.Toolkit;

/*
 * BeepThread 클래스는 이전 예제(~ex_04)를 수정해서 Runnable을 생성하지 않고
 * Thread의 하위 클래스로 작업 스레드를 정의한 것이다.
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
