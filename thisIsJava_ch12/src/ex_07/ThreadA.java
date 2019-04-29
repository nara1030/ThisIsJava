package ex_07;

/*
 * - 생각
 *   run은 오버라이드 가능하고 setName은 가능하지 않다.
 *   
 * - Q: static에다 final인가?
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
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}
