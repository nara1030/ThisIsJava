package ex_04;

/*
 * - ������ Ÿ�� ��ȯ�� �õ��� ��� ClassCastException�� �߻���
 * - ClassCastException�� �߻���Ű�� �������� Ÿ�� ��ȯ ����
 *   Ÿ�� ��ȯ�� �������� instanceof �����ڷ� Ȯ���ϴ� ���� ����
 */
public class ClassCastExceptionExample_02 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog2(dog);

		Cat cat = new Cat();
		changeDog2(cat);
	}

	public static void changeDog2(Animal animal) {
		if (animal instanceof Dog) { // true: ���� ��ü�� ���� ��ü�� ��ȯ ����
			Dog dog = (Dog) animal;
		}
	}
}
