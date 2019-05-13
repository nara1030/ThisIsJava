package ex_08;

import java.util.Comparator;
import ex_08.ComparatorExample.Student;

/*
 * - Objects Ŭ����(java.util.Objects)
 *   - �Ʒ��� ���� ������ �����ϴ� ����(?) �޼����� ������ Object�� ��ƿ��Ƽ Ŭ����
 *   1. ��ü ��
 *   2. �ؽ��ڵ� ����
 *   3. null ����
 *   4. ��ü ���ڿ� ����
 * 
 * -  ��ü ��: Object.compare(T a, T b, Comparator<T> c)
 *   - java.util.Comparator<T>: ���׸� �������̽� Ÿ������ �� ��ü�� ���ϴ� �޼ҵ尡 ����
 *   - public interface Comparator<T> {
 *         int compare(T a, T b)
 *     }
 * 
 * - compare() �޼ҵ� ���� if�� ��ü
 *   - return Integer.compare(a.sno, b.sno);
 */
public class StudentComparator1 implements Comparator<Student> {
	@Override
	public int compare(Student a, Student b) {
		if (a.sno < b.sno) {
			return -1;
		} else if (a.sno == b.sno) {
			return 0;
		} else {
			return 1;
		}
	}
}
