package ch15;

public class Member {

	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override 
	public int hashCode() {
		
		//이름이 같으면 같은 hashcode값을 리턴하도록 
		//String 타입은 이미 객체 안에 데이터가 같으면 같은 hashcode값이 리턴되므로 
		//String name 을 이용하여 이름이 같으면 같은 hashcode를 리턴하도록 재정의 
		
		System.out.println("hashcode호출");
		
		return name.hashCode();
	}
	
	@Override 
	public boolean equals(Object obj) {
		boolean result = false;
		System.out.println("equals호출");
		
		if(obj instanceof Member) {
			
			Member temp = (Member)obj;
			
			if(temp.getName().equals(name)&& temp.getAge() == age) {
				result = true;
			}
		}
		
		return result;
		
	}
	
}
