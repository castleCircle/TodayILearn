package java8.inaction.chap03;

import java.util.*;
import static java.util.Comparator.comparing;

public class Sorting {
	public static void main(String[] args) {
		
		List<Apple> inventory = new ArrayList<>();
		inventory.addAll(Arrays.asList(
			new Apple(80, Color.GREEN),	
			new Apple(155, Color.GREEN),	
			new Apple(120, Color.RED)	
		));
		
		inventory.sort(new AppleComparator());
		System.out.println(inventory);
		
		inventory.set(1, new Apple(30, Color.GREEN));
		System.out.println(inventory);
		
		inventory.sort(new Comparator<Apple>() {

			@Override
			public int compare(Apple o1, Apple o2) {
				return o1.getWeight() - o2.getWeight();
			}
		});
		System.out.println(inventory);
		
		inventory.set(1, new Apple(10, Color.RED));
		inventory.sort(comparing(Apple::getWeight));
		
	}
	
	
	
	static class AppleComparator implements Comparator<Apple>{

		@Override
		public int compare(Apple o1, Apple o2) {
			return o1.getWeight() - o2.getWeight();
		}
			
	}
	
}
