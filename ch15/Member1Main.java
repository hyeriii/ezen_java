package ch15;

import java.util.HashSet;
import java.util.Set;

public class Member1Main {

	public static void main(String[] args) {
		Set<Member1> s = new HashSet<Member1>();
	
		Member1 m1 = new Member1("전", 10);
		Member1 m2 = new Member1("리", 20);
		Member1 m3 = new Member1("전", 10);
		
		boolean result1  = s.add(m1);
		boolean result2  = s.add(m2);
		boolean result3 =  s.add(m3);
		
		System.out.println(result1); 
		System.out.println(result2);
		System.out.println(result3);
		System.out.println("총 개수"+ s.size());
		// 전 : 개수 3개
		// 후 : 개수 2개
		boolean result4 = s.add(m2);
		System.out.println(result4);
		// 전, 후 : false
		
		//210727 수업중
		//set은 동등객체를 대입 할 수 없다.
		//m2은 이미 set안에 존재하고 member에 대하여 
		//hashcode()와 equals를 재정의한 적 없으므로 주소가 같으면 대입 할 수 없다
	}

}
