package ch15;

import java.util.Iterator;
import java.util.TreeSet;

public class PersonMain {

	public static void main(String[] args) {
		TreeSet<Person> pTree = new TreeSet<>();
		
		pTree.add(new Person("�垮瘚�",19));
		pTree.add(new Person("�垮瞍�",15));
		pTree.add(new Person("�垮磍�",30));
		pTree.add(new Person("�垮皝�",40));

		Iterator<Person> i = pTree.iterator();
		while(i.hasNext()) {
			Person p = i.next();
			System.out.println(p.name);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
