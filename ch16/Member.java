package ch16;

public class Member {

	public static int MALE = 0;
	public static int FEMALE = 1;
	
	private String name;
	private int gender;
	private int age;
	
	public Member(String name, int gneder, int age) {
		this.age = age;
		this.gender = gender;
		this.name = name;
		
	}

	public int getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

}
