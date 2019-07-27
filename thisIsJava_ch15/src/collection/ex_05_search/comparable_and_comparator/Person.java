package collection.ex_05_search.comparable_and_comparator;

/*
 * Comparable 구현 클래스
 */
class Person implements Comparable<Person> {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		if (age < o.age) {
			return -1;
		} else if (age == o.age) {
			return 0;
		} else {
			return 1;
		}
	}
}
