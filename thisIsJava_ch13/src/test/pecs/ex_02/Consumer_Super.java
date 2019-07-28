package test.pecs.ex_02;

import java.util.ArrayList;
import java.util.List;

public class Consumer_Super {
	public static void main(String[] args) {
		// List of apples
		List<Apple> apples = new ArrayList<>();
		apples.add(new Apple());

		// We can assign a list of apples to a basket of apples
		List<? super Apple> basket = apples;

		basket.add(new Apple());
		basket.add(new AsianApple());
		// basket.add(new Fruit()); // Compile time error
	}
}
