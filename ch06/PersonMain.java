package ch06;

import ch05.Week; //���� �۾���ġ�� �ٸ� ��Ű���� �ִ� �ҽ��� import ����� ��밡�� 

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person("00000-00000", "ȫ�浿");
		System.out.println("p1["+p1.toString()+"]");
		
		//final Ű���尡 ���� �ʵ�� �ѹ� ���� �Ҵ�Ǹ� ������ �� ����. 
		//p1.nation = "jepan";
		//p1.ssn = "010111-011001";
		System.out.println("p1["+p1.toString()+"]");
		
		System.out.println(Person.MAX_AGE);
		//Person.MAX_AGE = 200;
		
		//������� ����ϰ� �ִ� Ŭ������ ��
		System.out.println(Integer.MAX_VALUE);
		
		//�ٸ� ��Ű���� �ִ� Ŭ���� ��� 
		Week today = Week.MONDAY;
		
		
	}
}
