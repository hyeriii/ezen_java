package ch15;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeMain {

	public static void main(String[] args) {
		//����Ʈ�� ����
		//����Ʈ�� - �ϳ��� ��忡 �ִ� �ΰ��� ������ ���� �� �ִ� Ʈ������
		//�̹� Ʈ���� �߰��Ǿ��ִ� ��尪�� ���Ͽ� �����ϰ����ϴ� ���� ��庸��
		//������ ���� ���, ũ�� ������ ��� 

		TreeSet<Integer> treeSet = new TreeSet<>();
		
		Integer score = null;
		
		treeSet.add(80);
		treeSet.add(98);
		treeSet.add(72);
		treeSet.add(67);
		treeSet.add(55);
		treeSet.add(49);
		treeSet.add(65);
		
		//���峷�� ���� - Ʈ���� ���� ���� ù��° ����� �Ͽ� first ȣ��
		score = treeSet.first();
		System.out.println("���� ���� ���� : "+score);
		
		//���� ���� ���� - Ʈ���� ���� ������ ������ ����� �Ͽ� last ȣ��
		score = treeSet.last();
		System.out.println("���� ���� ���� : "+score);
		
		//67 ���� �ٷ� ���� ���� ����
		score = treeSet.higher(67);  
		System.out.println("67�ʰ��� ���� : "+score);
				
		//67 ���� ���� �ٷ� �Ʒ� ����
		score = treeSet.lower(67); 
		System.out.println("67�̸��� ���� : "+score);
				
		
		//67 �̻��� ����
		score = treeSet.ceiling(64);
		System.out.println("67 �̻��� ���� : "+ score);
		
		//67 ������ ����
		score = treeSet.floor(67);
		System.out.println("67 ������ ���� : "+ score);
				
		//���� �������� �ݺ��� ������ 
		//����Ʈ���� ���ĵǾ��ִ� �������� �ݺ��ڸ� ������ ���
		Iterator<Integer> nSet = treeSet.descendingIterator();
		
		while(nSet.hasNext()) {
			int temp = nSet.next();
			System.out.print(temp+",");
		}
		System.out.println();
		
		//descendingSet() - ����Ʈ�� ������ treeSet�� ������ �޼ҵ� 
		//treeSet�� �������� ���ô�� NavigableSet���� �����ϱ⶧���� treeSet���� ���� �� ����
		NavigableSet<Integer> nSet2 = treeSet.descendingSet();
		
		NavigableSet<Integer> nSet3 = nSet2.headSet(67,false);
		
		Iterator<Integer> i = nSet3.iterator();
		while(i.hasNext()) {
			int temp = i.next();
			System.out.println(temp);
		}
		
		//���� Ʈ���� ������ �����Ͽ� set ������ 
		NavigableSet<Integer> nSet4 = nSet2.subSet(72, true, 55, false);
		
		i =nSet4.iterator();
		while(i.hasNext()) {
			int temp = i.next();
			System.out.println("------");//sysout
			System.out.println(temp);
		}
		
	}

}
