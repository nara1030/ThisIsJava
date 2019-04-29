package ex_04;

/*
 * - ������ Ÿ�� ��ȯ�� �õ��� ��� ClassCastException�� �߻���
 * - ClassCastException�� �߻���Ű�� �������� Ÿ�� ��ȯ ����
 *   Ÿ�� ��ȯ�� �������� instanceof �����ڷ� Ȯ���ϴ� ���� ����
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
