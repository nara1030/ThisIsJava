package ex_05;

/*
 * - 예외 처리 코드란
 *   프로그램에서 예외가 발생했을 경우 프로그램의 갑작스러운 종료를 막고,
 *   정상 실행을 유지할 수 있도록 처리하는 코드를 지칭
 * 
 * - 사용법
 *   생성자 내부 혹은 메서드 내부에서 작성
 *   try-catch-finally 블록 사용
 *   
 * - ClassNotFoundException
 *   일반 예외이므로 컴파일러는 개발자로 하여금 예외 처리하도록 요구
 *   
 * - Class.forName(매개값)
 *   매개값으로 주어진 클래스가 존재하면 Class 객체를 리턴하지만,
 *   존재하지 않으면 ClassNotFoundException 예외 발생시킴
 */
public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
}
