package ch15;

public class Person implements Comparable<Person>{

	public String name;
	public int age ;
	
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	
	@Override
	public int compareTo(Person o) {
		//이진트리 구조의 컬렉션에 객체가 추가되기 위해서는 반드시 정렬에 대한 정보를 
		//가지는 comparable 인터페이스 또는 comparator 구현해야함 
		//comparable 인터페이스는 comparaTo 메소드를 이용하여 정렬정보를 제공
		//양수이면 큰값, 0이면 같은값, 음수이면 작은값
		
		//person 객체의 나이순으로 정렬되도록 구현 
		
		if(o.age < age) {
			//o 객체의 나이가 현재 객체보다 작은 경우
			return 1;
		}else if(o.age > age) {
			//o 객체의 나이가 현재 객체보다 큰 경우
			return -1;
		}else {
			//o 객체의 나이가 현재 객체보다 같은 경우
			return 0;
		}
		

	}

	
}
