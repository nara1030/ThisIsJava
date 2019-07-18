package ex_03_boundedType_parameter.client;

import common.generic.Box;
import common.hierarcy_classes.HighStudent;
import common.hierarcy_classes.Student;
import common.hierarcy_classes.Worker;
import ex_03_boundedType_parameter.server.Util;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		// String str = Util.compare("a", "b");
		int result1 = Util.compare(10, 20);
		System.out.println(result1);

		int result2 = Util.compare(4.5, 3);
		System.out.println(result2);

		// 확인 - 제한된 타입 파라미터 vs 와일드 카드
		Box<Student> box1 = new Box<Student>();
		box1.set(new Student("학생"));
		Box<HighStudent> box2 = new Box<HighStudent>();
		box2.set(new HighStudent("고등학생"));
		Box<Worker> box3 = new Box<Worker>();
		box3.set(new Worker("직장인"));

		System.out.println(Util.compareStudent_boundedType(box1));
		System.out.println(Util.compareStudent_boundedType(box2));
		// Setter 주입이 아니라 생성자 주입 시에도 아래는 런타임 에러(NullPointerException) 나기도 전에 컴파일 에러에
		// 걸린다.
		// System.out.println(Util.compareStudent_boundedType(box3));

		System.out.println(Util.compareStudent_wildcard(box1));
		System.out.println(Util.compareStudent_wildcard(box2));
		// System.out.println(Util.compareStudent_wildcard(box3));

		// 차이점(필요성)
		Box<Student> vox1 = Util.compareStudent_boundedType(box1);
		// Box<Student> vox2 = Util.compareStudent_boundedType(box2);

		Box<?> vox2 = Util.compareStudent_boundedType(box1);
		Box<?> vox3 = Util.compareStudent_boundedType(box2);
	}
}
