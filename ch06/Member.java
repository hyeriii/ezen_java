package ch06;

public class Member {
	//210709
	//6�� Ȯ�ι��� 13��, 14��  
	
	String name;
	String id;
	String password;
	int age; 
	
	public Member(){
		
	}
	
	public Member(String name, String id){
		this.name = name;
		this.id = id;
	}
	
	//210712
	//method 
	public void method1(String arg) {
		if(arg.equals("����"))
		{
			return;//voidŸ�Կ��� retrun ����ϸ� �ش� method �����Ŵ	
		}
		
		System.out.println(arg +" method1 ����");
		
	}
	
	public int getAge() {
		
		return age ; 
	}
	
	
}
