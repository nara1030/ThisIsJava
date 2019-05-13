package ex_06;

import java.util.Arrays;

/*
 * - 깊은 복제(ex_06)
 *   - 얕은 복제의 단점 보완
 *     - 얕은 복제의 경우 참조 타입 필드는 번지만 복제되기 때문에 원본 객체의 필드와 복제 객체의 필드는 같은 객체 참조
 *     - 만약 복제 객체에서 참조 객체를 변경하면 원본 객체도 변경된 객체를 갖게 됨(얕은 복제의 단점)
 *   - 깊은 복제란 참조하고 있는 객체도 복제하는 것(얕은 복제 단점 보완)
 *   
 * - 오버라이딩
 *   1. 접근 제어자는 부모 클래스의 메서드보다 좁은 범위로 변경할 수 없음
 *   2. 부모 클래스의 메서드보다 많은 수의 예외를 선언할 수 없음
 *   3. 인스턴스 메서드를 static 혹은 그 반대로 변경할 수 없음
 *   
 * - clone()의 접근 제어자가 왜 protected인지?
 *   -
 */
public class Member implements Cloneable {
	public String name;
	public int age;
	public int[] scores;
	public Car car;

	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 먼저 얕은 복사를 해서 name, age를 복제한다.
		Member cloned = (Member) super.clone();
		// scores를 깊은 복제한다.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		// car를 깊은 복제한다.
		cloned.car = new Car(this.car.model);
		// 깊은 복제된 Member 객체를 리턴
		return cloned;
	}

	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}

}
