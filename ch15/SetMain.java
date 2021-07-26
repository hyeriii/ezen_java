package ch15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {

		Set<Member> set = new HashSet<>();
		
		//1. set �÷��� �ȿ� ���� �߰�
		Member m1 = new Member("ȫ�浿", 19);
		Member m2 = new Member("ȫ�浿1", 19);
		Member m3 = new Member("ȫ�浿2", 19);
		boolean result1 = set.add(m1);
		boolean result2 = set.add(m2);
		boolean result3 = set.add(m3);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		//size() ->�÷��� �ȿ� ���� ���� ��ȯ 
		System.out.println("size()->"+set.size());
		
		//contains() -> ���ڷ� �Ѿ�� ���Ұ� �����ϴ��� ���� ��ȯ
		//Object Ŭ������ ������ �ִ� hashcode()�� equals()�� ����� ���� ture�� ��� ���ü true ��ȯ 
		//1. hashcode �� ��ȯ���� set �ȿ� �����ϴ��� - �����ϸ� true
		//2. true�� ��� equals��
		// 2������ true���� true
		boolean containYN = set.contains(m1);
		System.out.println("contains()->"+containYN);
		
		
		//clear() -> set �÷��� ����ִ� �޼ҵ�
		set.clear();
		System.out.println("size(0 ->"+ set.size());
		
		set.add(m1);
		set.add(m2);
		set.add(m3);
		
		//remove() - ��ġ�ϴ� ���Ҹ� ���� 
		//��ġ�ϴ� �������� �˱� ���Ͽ� hashcode�� equals�� ����� 
		set.remove(m2);
		System.out.println("size() -> "+ set.size());
		
		
		//iterator() -> ������ �������� �ʴ� ���ҵ��� �ݺ������� �����ϴ� ��� 
		Iterator<Member> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			Member tempM = iterator.next();
			String name = tempM.getName();
			int age = tempM.getAge();
			System.out.println("name ->"+name+",age->"+age);
		}
		
		//set�� ���ü�� ���� �� �� ����.
		//m1�� �̹� set�ȿ� �����ϰ� member�� ���Ͽ� hashcode()�� equals�� �������� �� �����Ƿ� �ּҰ� ������ ���� �� �� ����
		result1 = set.add(m1);
		System.out.println(result1);
		
		//�̸��� ���� ���̰� �ٸ��� �ٸ� ��ü 
		//�̸��� ���� ���̰� ������ ���� ��ü
		//hashcode�� equals ������
		//1. �̸��� ������ hashcode�� ����� true�� ����� ���̱��� ���ϴ� equals ȣ�� ������ 
		//2. hashcode �� ����� ture�� ��� equals ���� ���̿� �̸��� ������ �� 
		
		
		
		String s1 = new String("test");
		String s2 = new String("test");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		Member m4 = new Member("ȫ�浿", 19);
		Member m5 = new Member("ȫ�浿", 19);
		
		Set<Member> newSet = new HashSet<>();
		result1 = newSet.add(m4);
		System.out.println("result1->"+result1);
		
		result1 = newSet.add(m5);
		System.out.println("result1->"+result1);
		//hashcode�� hashcode() ���ϰ��� �̹� set�ȿ� �����ϸ� 
		//1�� ���ü �� �� �����Ƿ� equalsȣ�� 
		
		System.out.println(m4.hashCode());
		System.out.println(m5.hashCode());
		
		//equals ȣ�������� ������� true �̸� ���������� ���ü�� �Ǻ� 
		//hashcode���� ���Ƶ� equals�� ����� false �̸� �ٸ� ��ü�� �Ǻ� 
		
		System.out.println(m5.equals(m4));
		
		
		Member m6 = new Member("ȫ�浿", 20);
		result1 = newSet.add(m6);
		System.out.println("m6 add ���->"+ result1);
		
		System.out.println(m4.hashCode());
		System.out.println(m6.hashCode());

		System.out.println(m6.equals(m4));
		
		System.out.println(newSet.size());
		
		
		System.out.println("---------------------");
		
		
		Member m7 = new Member("ȫ���", 19);
		result1 = newSet.add(m7);
		
		
		
		
		
	}

}
