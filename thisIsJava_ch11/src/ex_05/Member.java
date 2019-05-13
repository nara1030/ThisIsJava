package ex_05;

/*
 * - implements Cloneable: 복제할 수 있다는 표시
 *   - Object의 clone() 메소드로 객체를 복제하려면 원본 객체는 반드시 java.lang.Cloneable 인터페이스를 구현해야 함
 * 
 * - ex_05
 *   - Member 클래스가 Cloneable 인터페이스를 구현했기 때문에 getMember() 메소드에서 clone() 메소드로 자신을 복제한 후,
 *     복제한 객체를 외부로 리턴할 수 있음
 * 
 * - 객체 복제(clone())
 *   - 원복 객체의 필드값과 동일한 값을 가지는 새로운 객체 생성
 *   - 복제의 이유는 원본 객체를 안전하게 보호하기 위해서
 *   1. 얕은 복제(ex_05)
 *     - 단순히 필드값을 복사해서 객체를 복제하는 것
 *       A. 필드가 기본 타입일 경우: 값 복사
 *       B. 필드가 참조 타입일 경우: 객체의 번지 복사
 *   2. 깊은 복제(ex_06)
 */
public class Member implements Cloneable {
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;

	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}

	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {
		}
		return cloned;
	}

}
