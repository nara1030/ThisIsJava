package ex_05;

/*
 * - implements Cloneable: ������ �� �ִٴ� ǥ��
 *   - Object�� clone() �޼ҵ�� ��ü�� �����Ϸ��� ���� ��ü�� �ݵ�� java.lang.Cloneable �������̽��� �����ؾ� ��
 * 
 * - ex_05
 *   - Member Ŭ������ Cloneable �������̽��� �����߱� ������ getMember() �޼ҵ忡�� clone() �޼ҵ�� �ڽ��� ������ ��,
 *     ������ ��ü�� �ܺη� ������ �� ����
 * 
 * - ��ü ����(clone())
 *   - ���� ��ü�� �ʵ尪�� ������ ���� ������ ���ο� ��ü ����
 *   - ������ ������ ���� ��ü�� �����ϰ� ��ȣ�ϱ� ���ؼ�
 *   1. ���� ����(ex_05)
 *     - �ܼ��� �ʵ尪�� �����ؼ� ��ü�� �����ϴ� ��
 *       A. �ʵ尡 �⺻ Ÿ���� ���: �� ����
 *       B. �ʵ尡 ���� Ÿ���� ���: ��ü�� ���� ����
 *   2. ���� ����(ex_06)
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
