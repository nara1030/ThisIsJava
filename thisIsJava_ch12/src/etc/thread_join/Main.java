package thread_join;

public class Main {
	static boolean flag = true;

	public static void main(String[] args) {

		Thread thread = new Thread(new Thread1());
		thread.start();
		while (flag) {
			// Join을 while로 대체
		}
		System.out.println(flag);
	}
}
