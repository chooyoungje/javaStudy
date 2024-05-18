package lesson_0507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamEx06_Filter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("c:/");
		System.out.println();
		Path path = Paths.get("c:/");
		Stream<Path> st = Files.list(path);
		
		st
		.filter(s -> s.getFileName().toString().contains("Program"))
		.forEach(p -> System.out.println(p.getFileName()));
		System.out.println();
		
		Stream<String> strArrStrm = Stream.of(
	            "abc", "def", "jkl","ABC", "GHI", "JKL"
	         );
		strArrStrm
		.filter(s -> s.compareTo("a") > 0)
		.forEach(s -> System.out.println(s));
	}

}
