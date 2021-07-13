package ch06;

public class Person {

	//210713
	//final
	
	//final 키워드가 붙은 필드는 반드시 필드 선언 또는 생성자에서 값이 초기화 되어야 한다. 
	//final 키워드가 붙은 필드는 한번 값이 할당되면 변경할 수 없다. 
	final  String nation = "Korea";
	final String ssn;
	String name;
	
	//상수 선언 
	static final int MAX_AGE = 100;
	
	public Person(String ssn, String name) {
		//객체생성시에 외부에서 받은 값으로 final필드를 초기화 하면 값을 변경할 수 없다.
		this.ssn = ssn;
		this.name = name;
	}
	
	public String toString() {
		return "nation : " + nation +", ssn :" + ssn + " , name :" +name;
	}
	
}
