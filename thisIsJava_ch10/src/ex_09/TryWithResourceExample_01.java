package ex_09;

/*
 * - 자바 7에서 새로 추가된 try-with-resources
 *   를 사용하면 예외 발생 여부와 상관없이 사용했던 리소스 객체의
 *   close() 메소드를 호출해서 안전하게 리소스를 닫아줌
 *   
 *   즉 명시적으로 close()를 호출할 필요 없음
 * 
 * - 리소스 객체
 *   각종 입출력 스트림, 서버 소켓, 소켓, 각종 채널
 *   
 *   책에서는 리소스에 대해 데이터를 읽고 쓰는 객체라고 설명함
 *   좀 더 구체적으로 말하면 이때 리소스는 메모리에 할당된 인스턴스가 아닌 운영체제의 자원(시스템 자원)임
 *   
 * - try-with-resources를 사용하기 위한 조건
 *   리소스 객체는 java.lang.AutoCloseable 인터페이스를 구현하고 있어야 함
 *   
 *   AutoCloseable에는 close() 메소드가 정의되어 있는데 
 *   try-with-resources는  이 close() 메소드를 자동 호출함
 *   예외 발생 여부와 관계 없이 실행되는데, 예외 발생시 catch 이동 전 close() 메소드 호출
 */
public class TryWithResourceExample_01 {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception(); // 강제적으로 예외 발생시킴
		} catch (Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}
	}
}