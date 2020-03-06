package java8.inaction.chap04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamVsCollection {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Java8", "Lambdas", "In", "Action");
		names.stream().forEach(System.out::println);
		names.stream().forEach(System.out::println);
		//=> µÎ¹ø ³ª¿È
		
		Stream<String> stream  = names.stream();
		stream.forEach(System.out::println);
		stream.forEach(System.out::println);
		
		
		
		
	}
}
