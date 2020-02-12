package designPattern.singleton.base;

public class User {
	private String name;
	public User(String name) {
		this.name= name;
	}
	public void print() {
		Printer printer = Printer.getInstance();
		printer.print("name = " + name);
		printer.print("printType = " + printer.hashCode());
	}
}
