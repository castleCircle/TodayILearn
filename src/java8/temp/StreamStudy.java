package java8.temp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamStudy {
	public static void main(String[] args) {
		System.out.println("Using Java 7:");
		
		List<String> strings = Arrays.asList("abc","","ef","ghi" , "abcd");
		System.out.println("List : " + strings);
		long count = getCountEmptyStringUsingJava7(strings);
		System.out.println("Empty List Size: " + count);
		
		count = getCountLength3UsingJava7(strings);
		System.out.println("String of length 3: " + count);
		
		List<String> filtered = deleteEmptyStringUsingJava7(strings);
		System.out.println("Filtered List: " + filtered);
		
		String mergedString = getMergedStringUsingJava7(strings, ",");
		System.out.println("Merged String:" + mergedString);
		
		List<Integer> numbers = Arrays.asList(3,2,2,3,7,3,5);
		List<Integer> squaresList = getSquares(numbers);
		System.out.println("Squares List: " + squaresList);
		
		List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);
		System.out.println("List: " + integers);
		
		System.out.println("==========================================================");
		
		Random random = new Random();
		
		for(int i=0;i<10;i++) {
			System.out.println(random.nextInt());
		}
		
		System.out.println("Using Java 8: ");
		System.out.println("List: " + strings);
		
		count = strings.stream().filter(string->string.isEmpty()).count();
		System.out.println("Empty Strings : " + count);
		
		count = strings.stream().filter(string->string.length()==3).count();
		System.out.println("Strings of Length 3: " + count);
		
		filtered = strings.stream().filter(string->!string.isEmpty()).collect(Collectors.toList());
		System.out.println("Filtered List: " + filtered);
		
		mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(","));
		System.out.println("Merged String: " + mergedString);
		
		squaresList = numbers.stream().map(i->i*i).distinct().collect(Collectors.toList());
		System.out.println("Squares List: " + squaresList);
		System.out.println("List: "+integers);
		
		IntSummaryStatistics stats = integers.stream().mapToInt(x->x).summaryStatistics();
		System.out.println("Highest number in List : " + stats.getMax());
		
		random.ints().limit(5).sorted().forEach(System.out::println);
		
		count = strings.parallelStream().filter(string->string.isEmpty()).count();
		System.out.println("Empty Strings: " + count);
	}
	
	private static int getCountEmptyStringUsingJava7(List<String> strings) {
		int count = 0 ;
		for(String string : strings) {
			if(string.isEmpty()) {
				count++;
			}
		}
		return count;
	}
	
	private static int getCountLength3UsingJava7(List<String> strings) {
		int count  = 0;
		for(String string : strings) {
			if(string.length() ==  3) {
				count++;
			}
		}
		return count;
	}
	
	private static List<String> deleteEmptyStringUsingJava7(List<String> strings){
		List<String> filteredList = new ArrayList<String>();
		for(String string:strings) {
			if(!string.isEmpty()) {
				filteredList.add(string);
			}
		}
		return filteredList;
	}
	
	private static String getMergedStringUsingJava7(List<String> strings,String separator) {
		StringBuilder sb = new StringBuilder();
		for(String string : strings) {
			if(!string.isEmpty()) {
				sb.append(string);
				sb.append(separator);
			}
		}
		String mergedString = sb.toString();
		return mergedString.substring(0,mergedString.length()-1);
	}
	
	private static List<Integer> getSquares(List<Integer> numbers){
		List<Integer> squaresList = new ArrayList<Integer>();
		for(Integer number : numbers) {
			Integer square = new Integer(number.intValue() * number.intValue());
			if(!squaresList.contains(square)) {
				squaresList.add(square);
			}
		}
		return squaresList;
	}
	
	 private static int getMax(List<Integer> numbers) {
	      int max = numbers.get(0);
			
	      for(int i = 1;i < numbers.size();i++) {
			
	         Integer number = numbers.get(i);
				
	         if(number.intValue() > max) {
	            max = number.intValue();
	         }
	      }
	      return max;
	   }
		
	   private static int getMin(List<Integer> numbers) {
	      int min = numbers.get(0);
			
	      for(int i= 1;i < numbers.size();i++) {
	         Integer number = numbers.get(i);
			
	         if(number.intValue() < min) {
	            min = number.intValue();
	         }
	      }
	      return min;
	   }
		
	   private static int getSum(List numbers) {
	      int sum = (int)(numbers.get(0));
			
	      for(int i = 1;i < numbers.size();i++) {
	         sum += (int)numbers.get(i);
	      }
	      return sum;
	   }
		
	   private static int getAverage(List<Integer> numbers) {
	      return getSum(numbers) / numbers.size();
	   }
	
	
}
