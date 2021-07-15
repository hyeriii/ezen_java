package ch07;

public class Ch06_Child extends Ch6_Parent {

	private String name;
	
	public Ch06_Child(){
		this("ȫ�浿");
		System.out.println("Ch06_Child()");
	}
	public Ch06_Child(String name){
		this.name = name;
		System.out.println("Ch06_Child(String  name)");
	}
}
