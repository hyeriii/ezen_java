package ch06;

public class SingletonMain {

	public static void main(String[] args) {
		//210713
		//�̱���
		//Singleton a = new Singleton();
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton);

	}

}
