package ex_07;

/*
 * ���� ���� A, B�� �־���.
 * main �޼��� ���� �帧�� main �������� �� ����.
 */
public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸�: " + mainThread.getName());

		ThreadA threadA = new ThreadA();
		System.out.println("�۾� ������ �̸�: " + threadA.getName());
		threadA.start();
		// System.out.println("A: " + Thread.currentThread().getName());

		ThreadB threadB = new ThreadB();
		System.out.println("�۾� ������ �̸�: " + threadB.getName());
		threadB.start();
		// System.out.println("B: " + Thread.currentThread().getName());
	}
}
