package ex_11;

/*
 * - ���ø����̼� ����(Application Exception)
 *   ���ø����̼� ����(ex. �ܰ� ���� ����)�� ���õ� ����
 *   
 * - �ʿ伺
 *   ���α׷��� �����ϴ� ���� �ڹ� ǥ�� API���� �����ϴ� ���� Ŭ���������δ�
 *   �پ��� ������ ���ܸ� ǥ���� �� ����
 *   ���� �����ڰ� ���ܸ� ���� �����ؼ� ���� �ʿ䰡 ����
 */
public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() {
	}

	public BalanceInsufficientException(String message) {
		super(message);
	}
}
