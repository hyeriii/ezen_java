package ch15;

public class Member1 {

	//Áú¹®
	public String name;
	public int age ;
	
	public Member1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/*
	@Override
	public int  hashCode() {
		return name.hashCode();
	}
	
	@Override 
	public boolean equals(Object o) {
		if(o instanceof Member1) {
			Member1 m = (Member1)o;
			return m.name.equals(name) && m.age ==age ;
		}else {
			return false; 
		}

	}*/
}
