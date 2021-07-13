package ch06;

import ch05.Week; //현재 작업위치와 다른 패키지에 있는 소스는 import 해줘야 사용가능 

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person("00000-00000", "홍길동");
		System.out.println("p1["+p1.toString()+"]");
		
		//final 키워드가 붙은 필드는 한번 값이 할당되면 변경할 수 없다. 
		//p1.nation = "jepan";
		//p1.ssn = "010111-011001";
		System.out.println("p1["+p1.toString()+"]");
		
		System.out.println(Person.MAX_AGE);
		//Person.MAX_AGE = 200;
		
		//상수값을 사용하고 있는 클래스의 예
		System.out.println(Integer.MAX_VALUE);
		
		//다른 패키지에 있는 클래스 사용 
		Week today = Week.MONDAY;
		
		
	}
}
