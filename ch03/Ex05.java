package ch03;

public class Ex05 {

	public static void main(String[] args) {
		//210706
		//��Ʈ �� ������ - ����Ÿ�Կ����� ��밡�� 
		//1.��Ʈ ����
		byte a = 5 ;
		byte b = 7 ;
		
		byte result = (byte)(a&b);
		
		//2.��Ʈ ���� 
		result =(byte)(a|b);
		
		//3.��Ʈ ��Ÿ�� ���� : ������ 0, �ٸ��� 1 
		result = (byte)(a^b); 
		System.out.println("(a^b)->"+result);
		
		//4.��ũ ������ ~ , ���׿����� 
		result = (byte)~a;
		System.out.println("~a ->"+result);
		
		//5.��Ʈ �̵� ������ << 
		//�ǿ�����1�� ��Ʈ�� �ǿ�����2�� ĭ��ŭ�̵�
		
		 result = (byte)(a << 2);
		 
		//6. ��Ʈ �̵� ������ >>, >>>
		//6-1. >> : �̵��ϰ� ����� ĭ�� ���ؼ��� �ǿ�������1�� �ֻ��� ��Ʈ�� ������ ��Ʈ�� ä����, �������� ��������� ���� ��ȣ ����
		 
		 result =(byte)(a>>2);
		 System.out.println("(a>>2) ->"+result);

		 //������ ���
		 a = -5;//|1|1|1|1|1|0|1|1|
		 result =(byte)(a>>2);//|1|1|1|1|1|1|1|0|, ��ȣ ������
		 System.out.println("(a>>2) ->"+result);
		 
		 //6-2. >>> : ���� ���� ��Ʈ�� ���Ͽ� ������ 0���� ä����  
		 int result1 = (a >>> 2);
		 System.out.println("(a>>>2) ->"+result1);
	}

}
