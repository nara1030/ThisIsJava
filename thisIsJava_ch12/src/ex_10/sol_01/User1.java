package ex_10.sol_01;

public class User1 extends Thread {
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.setName("User1"); // ������ �̸� ����
		this.calculator = calculator; // ���� ��ü Calculator�� �ʵ忡 ����
	}

	@Override
	public void run() {
		calculator.setMemory(100); // ���� ��ü Calculator�� �޸𸮿� 100 ����
	}
}
