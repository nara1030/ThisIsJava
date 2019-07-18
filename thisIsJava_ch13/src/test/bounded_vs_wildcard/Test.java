package test.bounded_vs_wildcard;

import common.generic.Box;
import common.hierarcy_classes.Worker;

public class Test {
	public static void main(String[] args) {
		// Box<Person> box = new Box<Worker>();

		Box<?> box = new Box<Worker>();
	}
}
