package ch15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {

		Set<Member> set = new HashSet<>();
		
		//1. set 컬렉션 안에 원소 추가
		Member m1 = new Member("홍길동", 19);
		Member m2 = new Member("홍길동1", 19);
		Member m3 = new Member("홍길동2", 19);
		boolean result1 = set.add(m1);
		boolean result2 = set.add(m2);
		boolean result3 = set.add(m3);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		//size() ->컬렉션 안에 원소 객수 반환 
		System.out.println("size()->"+set.size());
		
		//contains() -> 인자로 넘어가는 원소가 존재하는지 여부 반환
		//Object 클래스가 가지고 있는 hashcode()와 equals()의 결과가 전부 ture인 경우 동등객체 true 반환 
		//1. hashcode 의 반환값이 set 안에 존재하는지 - 존재하면 true
		//2. true인 경우 equals비교
		// 2번까지 true여야 true
		boolean containYN = set.contains(m1);
		System.out.println("contains()->"+containYN);
		
		
		//clear() -> set 컬렉션 비워주는 메소드
		set.clear();
		System.out.println("size(0 ->"+ set.size());
		
		set.add(m1);
		set.add(m2);
		set.add(m3);
		
		//remove() - 일치하는 원소를 제어 
		//일치하는 원소인지 알기 위하여 hashcode와 equals를 사용함 
		set.remove(m2);
		System.out.println("size() -> "+ set.size());
		
		
		//iterator() -> 순서가 존재하지 않는 원소들을 반복적으로 접근하는 방법 
		Iterator<Member> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			Member tempM = iterator.next();
			String name = tempM.getName();
			int age = tempM.getAge();
			System.out.println("name ->"+name+",age->"+age);
		}
		
		//set은 동등객체를 대입 할 수 없다.
		//m1은 이미 set안에 존재하고 member에 대하여 hashcode()와 equals를 재정의한 적 없으므로 주소가 같으면 대입 할 수 없다
		result1 = set.add(m1);
		System.out.println(result1);
		
		//이름이 같고 나이가 다르면 다른 객체 
		//이름이 같고 나이가 같으면 동등 객체
		//hashcode와 equals 재정의
		//1. 이름이 같을때 hashcode의 결과를 true를 내줘야 나이까지 비교하는 equals 호출 가능함 
		//2. hashcode 의 결과가 ture인 경우 equals 에서 나이와 이름이 같은지 비교 
		
		
		
		String s1 = new String("test");
		String s2 = new String("test");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		Member m4 = new Member("홍길동", 19);
		Member m5 = new Member("홍길동", 19);
		
		Set<Member> newSet = new HashSet<>();
		result1 = newSet.add(m4);
		System.out.println("result1->"+result1);
		
		result1 = newSet.add(m5);
		System.out.println("result1->"+result1);
		//hashcode은 hashcode() 리턴값이 이미 set안에 존재하면 
		//1차 동등객체 일 수 있으므로 equals호출 
		
		System.out.println(m4.hashCode());
		System.out.println(m5.hashCode());
		
		//equals 호출했을때 결과값이 true 이면 최종적으로 동등객체로 판별 
		//hashcode값이 같아도 equals의 결과각 false 이면 다른 객체로 판별 
		
		System.out.println(m5.equals(m4));
		
		
		Member m6 = new Member("홍길동", 20);
		result1 = newSet.add(m6);
		System.out.println("m6 add 결과->"+ result1);
		
		System.out.println(m4.hashCode());
		System.out.println(m6.hashCode());

		System.out.println(m6.equals(m4));
		
		System.out.println(newSet.size());
		
		
		System.out.println("---------------------");
		
		
		Member m7 = new Member("홍길순", 19);
		result1 = newSet.add(m7);
		
		
		
		
		
	}

}
