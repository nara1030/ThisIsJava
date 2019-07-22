package collection.ex_02_list.arrayList;

import java.util.ArrayList;
import java.util.List;

/*
 * Case1. ArrayList를 생성하고 런타임 시 필요에 의해 객체들을 추가
 */
public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");

		int size = list.size();
		System.out.println("�� ��ü�� " + size); // 5
		System.out.println();

		String skill = list.get(2);
		System.out.println("2: " + skill); // 2: Database
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();

		list.remove(2); // Database
		list.remove(2); // Servlet/JSP
		list.remove("iBATIS"); // iBATIS

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}
}
