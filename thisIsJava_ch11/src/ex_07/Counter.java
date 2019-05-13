package ex_07;

/*
 * - 쓰레기 수집기는 객체를 소멸하기 직전에 마지막으로 객체의 소멸자(finalize())를 실행시킴
 * - Object의 finalize() 메소드는 기본적으로 실행 내용이 없음
 *   - 만약 객체가 소멸되기 전에 마지막으로 사용했던 자원을 닫거나, 저장하고 싶다면 Object의 finalized()를 재정의
 *   
 * - ex_07
 *   - 의도
 *     1. 객체가 소멸될 때 finalize()가 실행되는 것을 확인시켜주는 예제
 *       - 한두 개의 객체를 쓰레기로 만들었다고 해서 쓰레기 수집기가 실행되는 것은 아님(반복문 사용)
 *     2. Object의 finalize()를 재정의해서 어떤 객체가 소멸되는지 확인할 수 있도록 함
 *   - 결과
 *     - 순서대로 소멸시키지 않고, 무작위로 소멸시킴
 *     - 전부 소멸시키는 것이 아니라 메모리의 상태를 보고 일부만 소멸시킴
 *   - 중요
 *     - 즉시 자원을 해제하거나 데이터를 최종 저장해야 한다면,
 *       일반 메소드에서 작성하고 프로그램이 종료될 때 명시적으로 메소드를 호출하는 것이 좋음
 */
public class Counter {
	private int no;

	public Counter(int no) {
		this.no = no;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "번 객체의 fianlize()가 실행됨");
	}
}
