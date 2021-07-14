package ch07;

public class Child1 extends Parent {

	public String childField1 = "childField1";
	
	public void method3() {
		System.out.println("Child1 method3");
		System.out.println(parentField1);
	}
}
