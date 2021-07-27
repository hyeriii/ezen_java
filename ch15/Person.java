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
		//����Ʈ�� ������ �÷��ǿ� ��ü�� �߰��Ǳ� ���ؼ��� �ݵ�� ���Ŀ� ���� ������ 
		//������ comparable �������̽� �Ǵ� comparator �����ؾ��� 
		//comparable �������̽��� comparaTo �޼ҵ带 �̿��Ͽ� ���������� ����
		//����̸� ū��, 0�̸� ������, �����̸� ������
		
		//person ��ü�� ���̼����� ���ĵǵ��� ���� 
		
		if(o.age < age) {
			//o ��ü�� ���̰� ���� ��ü���� ���� ���
			return 1;
		}else if(o.age > age) {
			//o ��ü�� ���̰� ���� ��ü���� ū ���
			return -1;
		}else {
			//o ��ü�� ���̰� ���� ��ü���� ���� ���
			return 0;
		}
		

	}

	
}
