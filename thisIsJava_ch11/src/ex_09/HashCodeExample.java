package ex_09;

import java.util.Objects;

/*
 * - 해시코드 생성
 *   -
 */
public class HashCodeExample {
	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));
	}

	static class Student {
		int sno;
		String name;

		public Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}

		@Override
		public int hashCode() {
			return Objects.hash(sno, name);
		}
	}
}
