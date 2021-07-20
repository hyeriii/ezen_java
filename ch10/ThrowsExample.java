package ch10;

public class ThrowsExample {

	public static void main(String[] args) {
		//10장 442p
		try {
			findClass();
		}catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않음");
		}
		
		

	}
	
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("NewClass");
	}

}
