package ch15;

import java.util.Comparator;

public class ComparatorT implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		//o2 �񱳳��, o1 �����Ϸ��� ��� 
		if(o1.price< o2.price) {
			return -1;
		}else if(o1.price> o2.price) {
			return 1;
		}else {
			return 0;
		}
		
		
		
	}
	
	
	
}
