package thread_join;

class Thread1 implements Runnable {
	@Override
	public void run() {
		System.out.println("3�ʰ� ���");
		while (Main.flag) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Main.flag = false;
	}
}
