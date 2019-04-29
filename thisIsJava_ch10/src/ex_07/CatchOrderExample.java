package ex_07;

/*
 * - catch 순서
 *   다중 catch문을 작성할 때 주의할 점은
 *   상위 예외 클래스가 하위 예외 클래스보다 아래쪽에 위치해야 함
 *   
 *   try 블록에서 예외가 발생했을 때,
 *   예외를 처리해줄 catch 블록은 위에서부터 차례대로 검색되기 때문
 */
public class CatchOrderExample {
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
		} catch (Exception e) {
			System.out.println("실행에 문제가 있습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}
