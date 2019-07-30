package ex_02_stream_classify.stream_FromFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

// C:\\Users\\nara1\\eclipse-workspace\\thisIsJava_ch16\\src\\ex_02_stream_classify\\stream_FromFile\\linedata.txt
public class FromFileContentExample {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get(
				"C:\\Users\\nara1\\eclipse-workspace\\thisIsJava_ch16\\src\\ex_02_stream_classify\\stream_FromFile\\linedata.txt");
		Stream<String> stream;

		// Files.lines() 메소드 이용
		stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach(System.out::println);
		System.out.println();

		// BufferedReader의 lines() 메소드 이용
		File file = path.toFile();
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		stream = br.lines();
		stream.forEach(System.out::println);
	}
}
