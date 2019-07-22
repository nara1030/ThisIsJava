package util;

/*
 * 키로 사용할 객체 - hashCode()와 equals() 재정의
 */
public class Student {
	public int sno;
	public String name;

	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return (sno == student.sno) && (name.equals(student.name));
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}
}
