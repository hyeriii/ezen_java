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
		
		//�̸��� ������ ���� hashcode���� �����ϵ��� 
		//String Ÿ���� �̹� ��ü �ȿ� �����Ͱ� ������ ���� hashcode���� ���ϵǹǷ� 
		//String name �� �̿��Ͽ� �̸��� ������ ���� hashcode�� �����ϵ��� ������ 
		
		System.out.println("hashcodeȣ��");
		
		return name.hashCode();
	}
	
	@Override 
	public boolean equals(Object obj) {
		boolean result = false;
		System.out.println("equalsȣ��");
		
		if(obj instanceof Member) {
			
			Member temp = (Member)obj;
			
			if(temp.getName().equals(name)&& temp.getAge() == age) {
				result = true;
			}
		}
		
		return result;
		
	}
	
}
