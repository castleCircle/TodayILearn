package java8.temp;
public class FunctionStudy {
	public static void main(String[] args) {
		Vehicle1 v = new Car();
		v.print();
	}
}


interface Vehicle1{
	default void print() {
		System.out.println("I am a vehicle!");
	}
	
	static void blowHorn() {
		System.out.println("Blowing horn!!!");
	}
}

interface FourWheeler{
	default void print() {
		System.out.println("I am a four wheeler!");
	}
}

class Car implements Vehicle1, FourWheeler{

	@Override
	public void print() {
		Vehicle1.super.print();
		FourWheeler.super.print();
		Vehicle1.blowHorn();
		System.out.println("I am a car");
	}
	
}