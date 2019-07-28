package collection.ex_06_lifo_and_fifo.queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Queue 인터페이스에 정의되어 있는 메소드
 *   1. boolean offer(E e): 주어진 객체를 넣는다.
 *   2. E peek(): 객체 하나를 가져온다. 객체를 큐에서 제거하지 않는다.
 *   3. E poll(): 객체 하나를 가져온다. 객체를 큐에서 제거한다.
 */
public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<>();

		messageQueue.offer(new Message("sendMail", "홍길동")); // 메시지 저장
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "홍두께"));

		while (!messageQueue.isEmpty()) { // 메시지 큐가 비었는지 확인
			Message message = messageQueue.poll(); // 메시지 큐에서 한 개의 메시지 꺼냄
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS를 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
				break;
			}
		}
	}
}
