package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ApplesFilter {
	public static void main(String[] args) {
		List<Apple> fruit = Arrays.asList(
				new Apple(80, "green"),
				new Apple(155, "green"),
				new Apple(120, "red")
				);
		
		
		
	}
	
	
	
	public static boolean isGreenApple(Apple apple) {
		return "green".equals(apple.getColor());
	}
	
	public static boolean isHeavyApple(Apple apple) {
		return apple.getWeight() > 150;
	}
	
	
	static class Apple{
		int weight;
		String color;
		public Apple(int weight ,String color) {
			this.weight = weight;
			this.color = color;
		}
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		@Override
		public String toString() {
			return "Apple [weight=" + weight + ", color=" + color + "]";
		}
		
	}
	
}
