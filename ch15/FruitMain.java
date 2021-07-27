package ch15;

import java.util.Iterator;
import java.util.TreeSet;

public class FruitMain {

	public static void main(String[] args) {
		
		TreeSet<Fruit> fTree = new TreeSet<>(new ComparatorT());
		fTree.add(new Fruit("사과", 1500));
		fTree.add(new Fruit("수박", 20000));
		fTree.add(new Fruit("포도", 15000));
		fTree.add(new Fruit("멜론", 5000));
		
		Iterator<Fruit> i = fTree.iterator();
		while(i.hasNext()) {
			Fruit f = i.next();
			System.out.println(f.name);
		}
		
		
	}

}
