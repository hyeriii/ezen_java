package ch06;

public class Test {
	String field1;
	int field2;
	String field3;
	double field14;
	boolean field5;
	
	//������ ������ ������� �������� ���� ����
	//�⺻������
	Test(){
		System.out.println("�⺻������ ȣ��");
	}
	
	//field1 �ʱ�ȭ�ϴ� ������ 
	Test(String field1)
	{
		this.field1 = field1;
		System.out.println("field1��  ȣ��");
	}
	
	//field2 �ʱ�ȭ�ϴ� ������
	Test(int field2)
	{
		this.field2 = field2;
		System.out.println("field2��  ȣ��");
	}
	
	//field3 �ʱ�ȭ�ϴ� ������
	//������ �����ε��� �Ű������� Ÿ��, ����, ������ ����޴´�.
	//������ ���� ��� Ÿ���� ��ġ�� �ʾƾ� �����ε��� �����ϴ�.
	/*Test(String field3)
	{
		this.field1 = field1;
		System.out.println("field1��  ȣ��");
	}*/
	
	//field1,2�� �ʱ�ȭ �ϴ� ������
	Test(String field1, int field2)
	{
		this.field1 = field1;
		this.field2 = field2;
		System.out.println("field1,2�� �ʱ�ȭ �ϴ� ������ ȣ��");
	}
	
	//field1,2�� �ʱ�ȭ �ϴ� ������- Ÿ��, ������ �������� �Ű����� ���� �ٲ㼭 �����ε� ���� 
		Test(int field2, String field1)
		{
			this.field1 = field1;
			this.field2 = field2;
			System.out.println("field1,2�� �ʱ�ȭ �ϴ� ������ ȣ��");
		}
	
}
