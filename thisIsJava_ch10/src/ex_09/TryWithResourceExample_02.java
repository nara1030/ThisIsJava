package ex_09;

import java.io.IOException;

/*
 * - 자바 6
 *   try-with-resources와 순서가 다르다.
 *   이 경우 catch문 다음에 리소스를 닫아준다.
 * 
 * - 의문
 *   1. 왜 IOException으로 예외 처리하면 에러 나지?
 *     - 내가 만들어준 FileInputStream 클래스가 아니라
 *       java.io.FileInputStream 클래스를 갖다 쓰면 에러나지 않음
 *   2. 메소드 말고 class 선언부에서 throws 붙일 수 있나?
 */
public class TryWithResourceExample_02 {
	public static void main(String[] args) {
		java.io.FileInputStream fis = null;
		try {
			fis = new java.io.FileInputStream("file.txt");
			fis.read();
			throw new IOException();
		} catch (IOException e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
				}
			}
		}
	}
}
