package ch13;

public class ContainerMain {

	public static void main(String[] args) {
		
		Container<String,String> container1 = new Container<String,String>();
		container1.set("È«±æµ¿", "µµÀû");
		String name = container1.getKey(); 
		String job = container1.getValue();
		
		System.out.println(name +","+job);
		
		Container<String ,Integer> container2 = new Container<String ,Integer>();
		container2.set("È«±æµ¿", 10);
		String name2 = container2.getKey();
		int age = container2.getValue(); 
		
		System.out.println(name2 +","+age);
	}

}
