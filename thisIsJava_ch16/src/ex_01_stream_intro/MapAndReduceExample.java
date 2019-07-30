package ex_01_stream_intro;

import java.util.Arrays;
import java.util.List;

import common.vo.Student;

/*
 * 중간 처리와 최종 처리
 */
public class MapAndReduceExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(new Student("홍길동", 10), new Student("신용권", 20),
				new Student("유미선", 30));
		
		double avg = studentList.stream()
				.mapToInt(Student::getScore) // 중간처리(학생 객체를 점수로 매핑)
				.average() // 최종 처리(평균 점수)
				.getAsDouble();

		System.out.println("평균 점수: " + avg);
	}
}
