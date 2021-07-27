package ch15;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeMain {

	public static void main(String[] args) {
		//이진트리 구조
		//이진트리 - 하나의 노드에 최대 두개의 가지를 가질 수 있는 트리구조
		//이미 트리에 추가되어있는 노드값을 비교하여 대입하고자하는 값이 노드보다
		//작으면 왼쪽 노드, 크면 오른쪽 노드 

		TreeSet<Integer> treeSet = new TreeSet<>();
		
		Integer score = null;
		
		treeSet.add(80);
		treeSet.add(98);
		treeSet.add(72);
		treeSet.add(67);
		treeSet.add(55);
		treeSet.add(49);
		treeSet.add(65);
		
		//가장낮은 점수 - 트리의 가장 왼쪽 첫번째 노드라고 하여 first 호출
		score = treeSet.first();
		System.out.println("가장 낮은 점수 : "+score);
		
		//가장 높은 점수 - 트리의 가장 오른쪽 마지막 노드라고 하여 last 호출
		score = treeSet.last();
		System.out.println("가장 높은 점수 : "+score);
		
		//67 보다 바로 위로 높은 원소
		score = treeSet.higher(67);  
		System.out.println("67초과인 원소 : "+score);
				
		//67 보다 낮은 바로 아래 원소
		score = treeSet.lower(67); 
		System.out.println("67미만인 원소 : "+score);
				
		
		//67 이상인 원소
		score = treeSet.ceiling(64);
		System.out.println("67 이상인 원소 : "+ score);
		
		//67 이하인 원소
		score = treeSet.floor(67);
		System.out.println("67 이하인 원소 : "+ score);
				
		//정렬 역순으로 반복자 얻어오기 
		//이진트리에 정렬되어있는 역순으로 반복자를 얻어오는 방법
		Iterator<Integer> nSet = treeSet.descendingIterator();
		
		while(nSet.hasNext()) {
			int temp = nSet.next();
			System.out.print(temp+",");
		}
		System.out.println();
		
		//descendingSet() - 이진트리 역순의 treeSet을 얻어오는 메소드 
		//treeSet의 역순으로 얻어올대는 NavigableSet으로 리턴하기때문에 treeSet으로 얻어올 수 없다
		NavigableSet<Integer> nSet2 = treeSet.descendingSet();
		
		NavigableSet<Integer> nSet3 = nSet2.headSet(67,false);
		
		Iterator<Integer> i = nSet3.iterator();
		while(i.hasNext()) {
			int temp = i.next();
			System.out.println(temp);
		}
		
		//역순 트리의 범위를 지정하여 set 얻어오기 
		NavigableSet<Integer> nSet4 = nSet2.subSet(72, true, 55, false);
		
		i =nSet4.iterator();
		while(i.hasNext()) {
			int temp = i.next();
			System.out.println("------");//sysout
			System.out.println(temp);
		}
		
	}

}
