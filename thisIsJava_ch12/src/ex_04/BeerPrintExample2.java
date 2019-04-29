package ex_04;

import java.awt.Toolkit;

/*
 * Runnable 인터페이스는 run() 메서드 하나만 정의되어 있기 때문에 함수적 인터페이스이다.
 * 따라서 다음과 같이 람다식을 매개값으로 사용할 수도 있다.
 */
public class BeerPrintExample2 {
	public static void main(String[] args) {
		// 람다식 이용(자바 8부터 지원)
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
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}
