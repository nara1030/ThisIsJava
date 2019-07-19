package test.pecs;

import java.util.List;

/*
 * https://medium.com/@joongwon/java-java%EC%9D%98-generics-604b562530b3
 */
public class PECS {
	public void doProducerSomething(List<? extends MyClass> list) {
		for (MyClass e : list) {
			System.out.println(e);
		}
	}

	public void doConsumerSomething(List<? super MyClass> list) {
		list.add(new MyClass());
	}
}
