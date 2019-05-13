package ex_03;

/*
 * - ���� ���� �� �� hashCode()�� �������̵� �ʿ�
 *   - Object�� hashCode() �޼ҵ�� ��ü�� �޸� ������ �̿��ؼ� �ؽ��ڵ带 ����� �����ϱ� ����
 *   
 * - HashSet, HashMap, Hashtable�� ��ü ��(���� Ȯ��)
 *   - hashCode() ���� �� -> equals() ���� �� 
 * 
 * - ex_03
 *   - ������ ���� new Key(1)�� ���� ���� new Key(1)�� ��� ���� �ٸ� ��ü������ 
 *     HashMap�� hashCode()�� ���ϰ��� ����, equals() ���ϰ��� true�� ������ ������ ���� ��ü�� ����
 *   - ��, ��ü�� ���� �񱳸� ���ؼ��� Object�� equals() �޼ҵ常 ���������� ����
 *     hashCode() �޼ҵ嵵 �������ؼ� ���� ���� ��ü�� ��� ������ �ؽ��ڵ尡 ���ϵǵ��� �ؾ� ��
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
