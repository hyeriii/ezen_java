package ch15;

import java.util.HashSet;
import java.util.Set;

public class Member1Main {

	public static void main(String[] args) {
		Set<Member1> s = new HashSet<Member1>();
	
		Member1 m1 = new Member1("��", 10);
		Member1 m2 = new Member1("��", 20);
		Member1 m3 = new Member1("��", 10);
		
		boolean result1  = s.add(m1);
		boolean result2  = s.add(m2);
		boolean result3 =  s.add(m3);
		
		System.out.println(result1); 
		System.out.println(result2);
		System.out.println(result3);
		System.out.println("�� ����"+ s.size());
		// �� : ���� 3��
		// �� : ���� 2��
		boolean result4 = s.add(m2);
		System.out.println(result4);
		// ��, �� : false
		
		//210727 ������
		//set�� ���ü�� ���� �� �� ����.
		//m2�� �̹� set�ȿ� �����ϰ� member�� ���Ͽ� 
		//hashcode()�� equals�� �������� �� �����Ƿ� �ּҰ� ������ ���� �� �� ����
	}

}
