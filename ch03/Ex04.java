package ch03;

public class Ex04 {

	public static void main(String[] args) {
		//210706
		//��������
		//1. ���� 
		//boolean ���� �̿��� ����
		boolean b1 = true;
		boolean b2 = false;
		
		boolean result;
		result = b1 && b2 ;
		System.out.println(result);
		
		//�񱳿����� ����� ���� 
		int a = 10;
		int b = 20;
		int c = 10;
		
		result = (a<20) && (b<c);
		System.out.println(result);
		
		
		//�������� ����� ����
		b1 = true;
		b2 = false;
		result = (b1 && b2) && (b1&&b2);
		System.out.println(result);
		
		//�������� ������ &&�� &�� ���� 
		//1. &������
		//�ǿ�����1�� ���� ���Ծ��� �ǿ����� 2���� ����ѵ� ����� 
		b1 = false; 
		b2 = true;
		
		result = b1 & b2;
		System.out.println(result);
		
		//2. &&������
		//�ǿ�����1�� ���� ���� �ǿ�����2�� ���� Ȯ���ؾ��ϴ��� ���� �� ó��
		//��� 2��쿡�� �ǿ�����2�� ������ �����Ƿ� �ð� ���࿡ ���� 
		
		//2. ����OR
		b1 = false; 
		b2 = true;
		
		result = b1 || b2; 
		System.out.println("b1 || b2 ->"+result);
		
		
		a=10; b=20; c=10;
		result = (a>b)||(b>c);
		System.out.println("(a>b)||(b>c) ->"+result);
		
		//�������ڸ� �̿��� ���� 
		b1=false; b2= true;
		result = (b1&&b2)||(b1||b2);
		System.out.println("(b1&&b2)||(b1>b2) ->"+result);
		
		//3.��Ÿ�� ���� ^
		b1 = false; 
		b2 = true;
		
		result = b1 ^ b2; 
		System.out.println("b1 ^ b2 ->"+result);
		
		//4.������ !
		//������ ������ �ǿ�����1�� ���� ���� ��Ŵ f -> t, t-> f
		b1 =true;
		result = !b1;
		System.out.println(result);
	
	
	
	
	}

}
