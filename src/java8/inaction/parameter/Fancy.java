package java8.inaction.parameter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fancy {
	
	public static void main(String[] args) {
		List<Fan> fan = Arrays.asList(
			new Fan("1",Color.RED),
			new Fan("2",Color.BLUE),
			new Fan("3",Color.BLACK));
		
		List<Fan> red = filter(fan,new RedFanFiller());
		System.out.println(red);
	}
	
	enum Color{
		RED,BLUE,BLACK;
	}
	
	interface Fanfiller{
		boolean test(Fan f);
	}
	
	static class RedFanFiller implements Fanfiller{
		@Override
		public boolean test(Fan f) {
			if(f.getColor() == Color.RED) {
				return true;
			}
			return false;
		}
	}
	
	
	static List<Fan> filter(List<Fan> datas, Fanfiller fanfillter){
		List<Fan> fan = new ArrayList<>();
		for(Fan f : datas) {
			if(fanfillter.test(f)){
				fan.add(f);
			}
		}
		return fan;
	}
	
	
	public static class Fan{
		String name;
		Color color;
		public Fan(String name, Color color) {
			this.name = name;
			this.color = color;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Color getColor() {
			return color;
		}

		public void setColor(Color color) {
			this.color = color;
		}

		@Override
		public String toString() {
			return "Fan [name=" + name + ", color=" + color + "]";
		}
	}
}
