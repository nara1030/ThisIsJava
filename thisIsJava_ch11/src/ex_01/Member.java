package ex_01;

/*
 * - 생각해보기
 *   1. 객체를 매개변수로 넘겨줌
 *     - Call by reference
 *   2. 비교시 get으로 가져오는 게 아니라 데이터를 넘겨줌
 *     - 객체지향적 설계
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
}
