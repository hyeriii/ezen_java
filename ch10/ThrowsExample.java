package ch10;

public class ThrowsExample {

	public static void main(String[] args) {
		//10�� 442p
		try {
			findClass();
		}catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� ����");
		}
		
		

	}
	
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("NewClass");
	}

}
