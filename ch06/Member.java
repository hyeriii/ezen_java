package ch06;

public class Member {
	//210709
	//6장 확인문제 13번, 14번  
	
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
		if(arg.equals("종료"))
		{
			return;//void타입에서 retrun 사용하면 해당 method 종료시킴	
		}
		
		System.out.println(arg +" method1 실행");
		
	}
	
	public int getAge() {
		
		return age ; 
	}
	
	
}
