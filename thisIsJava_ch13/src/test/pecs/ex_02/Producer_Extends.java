package test.pecs.ex_02;

import java.util.ArrayList;
import java.util.List;

/*
 * Understading <? extends T>
 */
public class Producer_Extends {
	public static void main(String[] args) {
		// List of apples
		List<Apple> apples = new ArrayList<>();
		apples.add(new Apple());

		// We can assign a list of apples to a basket of fruits;
		// because apples is subtype of fruit
		List<? extends Fruit> basket = apples;

		// Here we know that in basket there is nothing but fruit only
		for (Fruit fruit : basket) {
			System.out.println(fruit);
		}
		
		// basket.add(new Apple());	// Compile time error
		// basket.add(new Fruit());	// Compile time error
	}
}
