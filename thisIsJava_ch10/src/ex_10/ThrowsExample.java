package ex_10;

/*
 * - throws 키워드
 *   메서드 내부에서 예외가 발생할 수 있는 코드를 작성할 때
 *   try-catch 블록으로 예외를 처리하는 것이 기본이지만,
 *   경우에 따라서는 메소드를 호출한 곳으로 예외를 떠넘길 수도 있음
 *   
 *   즉, 메소드에서 처리하지 않은 예외를 호출한 곳으로 떠넘기는 역할을 함
 *   따라서 throws 키워드가 붙어있는 메소드는 반드시 try 블록 내에서 호출되어야 함
 * 
 * - 사용법
 *   메소드 선언부 끝에 작성
 *   throws 키워드 뒤에 떠넘길 예외 클래스를 쉼표로 구분해서 나열
 */
public class ThrowsExample {
	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}

	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}
}
