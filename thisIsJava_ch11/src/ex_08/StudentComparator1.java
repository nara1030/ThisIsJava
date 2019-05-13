package ex_08;

import java.util.Comparator;
import ex_08.ComparatorExample.Student;

/*
 * - Objects 클래스(java.util.Objects)
 *   - 아래와 같은 연산을 수행하는 정적(?) 메서드들로 구성된 Object의 유틸리티 클래스
 *   1. 객체 비교
 *   2. 해시코드 생성
 *   3. null 여부
 *   4. 객체 문자열 리턴
 * 
 * -  객체 비교: Object.compare(T a, T b, Comparator<T> c)
 *   - java.util.Comparator<T>: 제네릭 인터페이스 타입으로 두 객체를 비교하는 메소드가 정의
 *   - public interface Comparator<T> {
 *         int compare(T a, T b)
 *     }
 * 
 * - compare() 메소드 내부 if문 대체
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
