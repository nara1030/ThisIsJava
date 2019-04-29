package ex_07;

/*
 * 참고를 위해 A, B를 넣었다.
 * main 메서드 안의 흐름은 main 스레드인 것 같다.
 */
public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());

		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름: " + threadA.getName());
		threadA.start();
		// System.out.println("A: " + Thread.currentThread().getName());

		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름: " + threadB.getName());
		threadB.start();
		// System.out.println("B: " + Thread.currentThread().getName());
	}
}
