package collection.ex_02_list.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * ArrayList와 LinkedList에 10000개의 객체를 삽입하는데 걸린 시간을 측정
 *   - 사용: List 인터페이스의 add(int index, E element) 메소드 이용
 *   - 결과: 끝에서부터 추가/삭제는 ArrayList가 빠르지만, 중간에 추가/삭제는 LinkedList가 빠름
 */
public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();

		long startTime;
		long endTime;

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime - startTime) + " ns");

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: " + (endTime - startTime) + " ns");
	}
}
