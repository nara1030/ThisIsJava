package collection.ex_06_lifo_and_fifo.stack;

import java.util.Stack;

/*
 * 택시에서 많이 볼 수 있는 동전케이스 생각
 * 
 * 메소드
 *   1. E push(E item): 주어진 객체를 스택에 넣는다.
 *   2. E peek(): 스택의 맨 위 객체를 가져온다. 객체를 스택에서 제거하지 않는다.
 *   3. E pop(): 스택의 맨 위 객체를 가져온다. 객체를 스택에서 제거한다.
 */
public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<>();

		coinBox.push(new Coin(100)); // 동전을 끼움
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));

		while (!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전: " + coin.getValue() + "원");
		}
	}
}
