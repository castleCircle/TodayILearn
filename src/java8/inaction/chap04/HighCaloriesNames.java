package java8.inaction.chap04;

import java.util.List;
import static java.util.stream.Collectors.toList;
import static java8.inaction.chap04.Dish.menu;;

public class HighCaloriesNames {
	public static void main(String[] args) {
		List<String> dish = menu.stream()
				.filter((t)->{
					System.out.println("filter : " + t.getName());
					return t.getCalories()  > 300 ;
				})
				.map(t->{
					System.out.println("mapping : " + t.getName());
					return t.getName();
				})
				.limit(3)
				.collect(toList());
		
		System.out.println(dish);
	}
}
