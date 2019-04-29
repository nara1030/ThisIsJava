package ex_04;

/*
 * - 억지로 타입 변환을 시도할 경우 ClassCastException일 발생함
 * - ClassCastException을 발생시키지 않으려면 타입 변환 전에
 *   타입 변환이 가능한지 instanceof 연산자로 확인하는 것이 좋음
 */
public class ClassCastExceptionExample_01 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);

		Cat cat = new Cat();
		changeDog(cat);
	}

	public static void changeDog(Animal animal) {
		Dog dog = (Dog) animal;
	}
}

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}
