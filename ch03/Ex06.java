package ch03;

public class Ex06 {

	public static void main(String[] args) {
		//210706
		//���Կ�����
		//1.�ܼ����� ������ - �ٸ� ���� ���� ���Ը� �ϴ� ������ =
		int a;
		a= 10+10;
		
		
		//2.���մ��� ������ - ���԰� ���� ���ÿ�
		int sum = 0;
		int num1 = 10;
		int num2 = 20;
		
		sum = num1; 
		sum += num2;
		
		//A�� 10�� �л��� �ڹ� ���� ��
		int [] student = {10,20,30,40,50,60,70,80,90,100};
		sum = 0;
		
		for(int i = 0; i<10 ; i++)
		{
			sum += student[i];
		}
		
		System.out.println("A�� �л��� �ڹ� ���� ����"+ sum +"�Դϴ�.");
		
		//+=��� ���� Ÿ�� ������ ���� ������ ������ �����ڷ� ���� ���� ���� �����Ͽ� ������
		
		String str = "";
		str += "test"; 
		System.out.println(str);
		str += ", sample";
		System.out.println(str);

		//���� ������
		int x = 5;
		int y = 7;
		int num = (x>y)? x:y;
		System.out.println(num);
		
	}

}
