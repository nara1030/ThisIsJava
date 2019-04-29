package ex_01;

/*
 * - 에러(Error) vs. 예외(Exception)
 *   - 공통점: 발생되면 프로그램은 곧바로 종료
 *   - 차이점: 에러와 달리 예외는 예외 처리(Exception Handling)를 통해 프로그램 종료하지 않고 정상 실행 상태 유지 가능
 *   - 에러: 하드웨어의 오동작 또는 고장으로 인해 응용프로그램 실행 오류가 발생
 *   - 예외: 사용자의 잘못된 조작 또는 개발자의 잘못된 코딩으로 인해 발생하는 프로그램 오류
 * 
 * - 예외의 종류
 *   1. 일반 예외(Exception)
 *     - 컴파일러 체크 예외
 *     - Exception을 상속받지만 Runtime Exception을 상속받지 않는 클래스들
 *   2. 실행 예외(Runtime Exception)
 *     - java.lang.RuntimeException을 상속받은 클래스들
 *     - 컴파일러가 체크하지 않기 때문에 개발자의 경험에 의해 예외 처리 코드 삽입 필요
 *   
 * - 자바에서의 예외 처리
 *   - 자바에서는 예외를 클래스로 관리함
 *   - JVM은 프로그램을 실행하는 도중에 예외가 발생하면 해당 예외 클래스로 객체를 생성
 *   - 그 후 예외 처리 코드에서 예외 객체를 이용할 수 있도록 해줌  
 *   
 * - java.lang.NullPointerException
 *   객체 참조가 없는 상태, 즉 null 값을 갖는 참조 변수로 객체 접근 연산자인 도트 사용했을 시 발생 
 */
public class NullPointerException {
	public static void main(String[] args) {
		String data = null;
		System.out.println(data.toString());
	}
}
