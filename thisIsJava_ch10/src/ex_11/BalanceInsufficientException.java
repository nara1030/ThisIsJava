package ex_11;

/*
 * - 애플리케이션 예외(Application Exception)
 *   애플리케이션 서비스(ex. 잔고 부족 예외)와 관련된 예외
 *   
 * - 필요성
 *   프로그램을 개발하다 보면 자바 표준 API에서 제공하는 예외 클래스만으로는
 *   다양한 종류의 예외를 표현할 수 없음
 *   따라서 개발자가 예외를 직접 정의해서 만들 필요가 있음
 */
public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() {
	}

	public BalanceInsufficientException(String message) {
		super(message);
	}
}
