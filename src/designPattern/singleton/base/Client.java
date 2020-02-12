package designPattern.singleton.base;

public class Client {
	private static final int USER_NUM = 10;
	public static void main(String[] args) {
		User[] user = new User[USER_NUM];
		for(int i=0;i<USER_NUM;i++) {
			user[i] = new User(i+"");
			user[i].print();
		}
	}
}
