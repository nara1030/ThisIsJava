package ex_08;
/*
 * 예상했던 결과는 Thread10이 가장 상위에 찍히는 것이다.
 * 하지만 그렇지 않은 이유는 본 예제는 싱글 코어를 가정한 예제이기 때문이다.
 * 
 * - 병렬성(Parallelism) vs. 동시성(Concurrency)
 *   공통점: 둘 다 멀티작업이 목적임
 *   동시성: 하나의 코어(CPU)에서 멀티 스레드가 번갈아가며 실행
 *   병렬성: 멀티 코어에서 개별 스레드를 동시에 실행 
 * 
 * - 코어 개수 확인
 *   Ctrl + Shift + Esc -> 성능 탭  
 *   
 * 스레드의 개수가 코어의 수보다 많은 경우,
 * 스레드를 어떤 순서에 의해 동시성으로 실행할 것인가를 결정해야 하는데
 * 이를 스레드 스케줄링이라고 한다.
 * 
 * - 자바의 스레드 스케줄링
 *   1. 우선순위(Priority) 방식: 개발자가 코드로 제어
 *   	- 모든 스레드들은 기본적으로 5의 우선순위를 할당받음
 *   2. 순환 할당(Round-Robin) 방식: JVM이 제어
 * 
 */
public class PriorityExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			Thread thread = new CalcThread("thread" + i);
			if (i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			} else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}
	}
}
