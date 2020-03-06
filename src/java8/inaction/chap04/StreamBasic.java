package java8.inaction.chap04;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamBasic {
	public static void main(String[] args) {
		getLowCaloricDishesNamesInJava7(Dish.menu).forEach(System.out::println);
		getLowCaloricDishesNamesInJava8(Dish.menu).forEach(System.out::println);
	}
	
	
	public static List<String> getLowCaloricDishesNamesInJava7(List<Dish> dishes){
		List<Dish> lowCaloriesDishes = new ArrayList<Dish>();
		for(Dish d : dishes) {
			if(d.getCalories() < 400) {
				lowCaloriesDishes.add(d);
			}
		}
		List<String> lowCaloriesDishesName = new ArrayList<String>();
		Collections.sort(lowCaloriesDishes,new Comparator<Dish>() {
			@Override
			public int compare(Dish o1, Dish o2) {
				return Integer.compare(o1.getCalories(), o2.getCalories());
			}
		});
		for(Dish d : lowCaloriesDishes) {
			lowCaloriesDishesName.add(d.getName());
		}
		return lowCaloriesDishesName;
	}
	
	public static List<String> getLowCaloricDishesNamesInJava8(List<Dish> dishes){
		return  dishes.stream()
		.filter(d->d.getCalories() < 400)
		.sorted(comparing(Dish::getCalories))
		.map(Dish::getName)
		.collect(toList());
	}
	
	
}
