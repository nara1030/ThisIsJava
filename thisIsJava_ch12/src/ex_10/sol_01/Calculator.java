package ex_10.sol_01;

/*
 * - 문제 상황
 *   스레드가 사용 중인 객체를 다른 스레드가 변경할 수 없도록 하려면 스레드 작업이 끝날 때까지 객체에 잠금을 걸어서
 *   다른 스레드가 사용할 수 없도록 해야 한다.
 *
 * - 해결책
 *   멀티 스레드 프로그램에서 단 하나의 스레드만 실행할 수 있는 코드 영역을 임계 영역(critical section)이라고 한다.
 *   synchronized 키워드는 인스턴스와 정적 메서드 어디든 붙일 수 있다.
 *   
 *   스레드가 객체 내부의 동기화 메서드 또는 블록에 들어가면 즉시 객체에 잠금을 걸어 다른 스레드가 임계 영역 코드를 실행하지 못하도록 한다.
 *   
 * - 방법
 *   1. 동기화 메서드
 *   2. 동기화 블록
 *   	- 메서드 전체 내용이 아니라, 일부 내용만 임계 영역으로 만들고 싶을 때 사용
 */
public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	// 동기화 메서드
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}
