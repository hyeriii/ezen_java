package ch06;

public class Person {

	//210713
	//final
	
	//final Ű���尡 ���� �ʵ�� �ݵ�� �ʵ� ���� �Ǵ� �����ڿ��� ���� �ʱ�ȭ �Ǿ�� �Ѵ�. 
	//final Ű���尡 ���� �ʵ�� �ѹ� ���� �Ҵ�Ǹ� ������ �� ����. 
	final  String nation = "Korea";
	final String ssn;
	String name;
	
	//��� ���� 
	static final int MAX_AGE = 100;
	
	public Person(String ssn, String name) {
		//��ü�����ÿ� �ܺο��� ���� ������ final�ʵ带 �ʱ�ȭ �ϸ� ���� ������ �� ����.
		this.ssn = ssn;
		this.name = name;
	}
	
	public String toString() {
		return "nation : " + nation +", ssn :" + ssn + " , name :" +name;
	}
	
}
