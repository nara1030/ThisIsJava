package ex_03;

/*
 * - 생각해보기
 *   1. 객체를 매개변수로 넘겨줌
 *     - Call by reference
 *   2. 비교시 get으로 가져오는 게 아니라 데이터를 넘겨줌
 *     - 객체지향적 설계
 * 
 * - id 필드값이 같을 경우 같은 해시코드 리턴 하려면?
 *   - String의 hashCode()는 같은 문자열일 경우 동일한 해시코드 리턴
 */
public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
