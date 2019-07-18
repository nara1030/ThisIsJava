package common.hierarcy_classes;

public class Person {
	String name = null;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
