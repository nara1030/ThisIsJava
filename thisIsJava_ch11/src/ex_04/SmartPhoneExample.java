package ex_04;

/*
 * - System.out.println() 메소드
 *   - 우리가 지금까지 콘솔에 출력하기 위해 사용
 *   - 출력 내용(매개값)
 *     1. 기본 타입(byte, short, int, ...): 해당 값 그대로 출력
 *     2. 객체: 객체의 toString() 메소드 호출해서 리턴 값 출력
 */
public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");

		String strObj = myPhone.toString();
		System.out.println(strObj);

		System.out.println(myPhone);
	}
}
