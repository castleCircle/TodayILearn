package java8;
import java.util.ArrayList;
import java.util.List;

public class MethodStudy {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("study1");
		names.add("study2");
		names.add("study3");
		
		names.stream().forEach(System.out::println);
		
		
	}
}
