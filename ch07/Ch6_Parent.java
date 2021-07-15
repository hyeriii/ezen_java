package ch07;

public class Ch6_Parent {
	public String nation;
	//7->12->13
	public Ch6_Parent() {
		this("¥Î«—πŒ±π");
		System.out.println("Ch6_Parent()");
	}
	
	public Ch6_Parent(String nation) {
		this.nation = nation;
		System.out.println("Ch6_Parent(String nation)");
	}
}
