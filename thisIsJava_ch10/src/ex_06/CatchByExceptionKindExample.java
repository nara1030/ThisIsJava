package ex_06;

/*
 * - 다중 catch
 *   try 블록 내부는 다양한 종류의 예외가 발생할 수 있음
 *   이 경우 발생되는 예외별로 예외 처리 코드 다르게 작성 필요
 *   
 *   catch 블록의 예외 클래스 타입은 try 블록에서 발생된 예외의 종류를 말하는데,
 *   try 블록에서 해당 타입의 예외가 발생하면 catch 블록을 실행하도록 되어 있음
 *   
 *   catch 블록이 여러 개라 할지라도 단 하나의 catch 블록만 실행됨
 */
public class CatchByExceptionKindExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java CatchByExceptionKindExample num1 num2");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}
