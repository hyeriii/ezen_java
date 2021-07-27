package ch15;

import java.util.Iterator;
import java.util.TreeSet;

public class PersonMain {

	public static void main(String[] args) {
		TreeSet<Person> pTree = new TreeSet<>();
		
		pTree.add(new Person("ȫ�浿",19));
		pTree.add(new Person("ȫ���",15));
		pTree.add(new Person("ȫ����",30));
		pTree.add(new Person("ȫ���",40));

		Iterator<Person> i = pTree.iterator();
		while(i.hasNext()) {
			Person p = i.next();
			System.out.println(p.name);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
