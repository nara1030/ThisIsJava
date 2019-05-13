package ex_03;

/*
 * - 논리적 동등 비교 시 hashCode()를 오버라이딩 필요
 *   - Object의 hashCode() 메소드는 객체의 메모리 번지를 이용해서 해시코드를 만들어 리턴하기 때문
 *   
 * - HashSet, HashMap, Hashtable의 객체 비교(동등 확인)
 *   - hashCode() 리턴 값 -> equals() 리턴 값 
 * 
 * - ex_03
 *   - 저장할 때의 new Key(1)과 읽을 때의 new Key(1)은 사실 서로 다른 객체이지만 
 *     HashMap은 hashCode()의 리턴값이 같고, equals() 리턴값이 true로 나오기 때문에 동등 객체로 평가함
 *   - 즉, 객체의 동등 비교를 위해서는 Object의 equals() 메소드만 재정의하지 말고
 *     hashCode() 메소드도 재정의해서 논리적 동등 객체일 경우 동일한 해시코드가 리턴되도록 해야 함
 */
public class Key {
	public int number;

	public Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			if (this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return number;
	}
}
