package ch03;

public class Ex02 {

	public static void main(String[] args) {
		//210705
		//���� ������
		//1. ��������� - overflow ex
		byte byteV = 10;
		byte byteV2 = 127 ; //byteŸ������ ���� �� �ִ� ���� ū ���� ��
		
		//byte�� ���� ,-128 -127 -126 ...
		byte result = (byte)(byteV + byteV2);
		// OR  int result = byteV + byteV2; �̷��Ե� �ذᰡ���� 
		System.out.println(result);
		
		//���� 0���� �������� ���� �� ������ 
		
		//1.������ ��� - ���� �߻��ϹǷ� ���� ó���ϴ� �ҽ��ڵ� �߰��ϸ� �ذᰡ��(����ó��)
		//int resultInt = 10/0 ;
		//System.out.println(resultInt); 
		
		//2.�Ǽ��� ���
		double d1 = 30.0;
		double d2 = 0.0;
		
		double resultDouble = d1/d2;
		System.out.println(resultDouble); //infinity �߻� 
		
		//�����߻��Ѱ��� �ƴ϶� �� ���1��ó�� ����ó�� �Ұ����� �Ʒ��� ���� �ذᰡ�� 
		boolean resultBoolean = Double.isInfinite(resultDouble);
		System.out.println(resultBoolean);
		
		if(resultBoolean) {
			System.out.println("0.0���� �����������ϴ�.infinity �߻�");
		}
		
		//�������� ���ϴ� ���꿡�� ����, �Ǽ��� 0���� �������� ���� ����
		
		//1. ������ �������� ���ϴ� ���
		/*
		int a = 10;
		int b = 0;
		
		int result1 = a%b; // ���� �߻�, ����ó�� �ʿ�
		
		System.out.println(result1);
		*/
		
		//2. �Ǽ��� ������ ���ϴ� ���
		d1 = 10.1;
		d2 = 0.0;
		
		double result2 = d1%d2;
		
		System.out.println(result2); // NaN �߻���

		boolean flag = Double.isNaN(result2);
		
		if(flag) {
		System.out.println("���� 0.0���� ������ �����Ƿ� ������ ���� ���Ҽ� �����ϴ�. NaN�߻��� "); 
		}
		
		int a = 30; 
		int b = 10;
		
		result2 = (double)a%b;
		System.out.println(result2);
		
		//��Ȯ�� ����� ���ؼ��� �Ǽ��� ����ϸ� �ȵ�
		
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result3 = apple -number*pieceUnit;
		System.out.println(result3); // 0.299999999...
		
		//�Ǽ��� �ε� �Ҽ������� �ٻ�ġ�� ������ ������ ��Ȯ�� ����� �����
		
		apple = 10;
		int pieceUnit2 = 1 ;
		
		int resulttemp = apple -number*pieceUnit2;
		result3 = resulttemp*0.1;
		System.out.println(result3);
		
		//���ڿ� ����
		String str1 = "�л�" ;
		int e = 1;
		int v = 90;
		
		String str2 = str1 + e + ":"+ v;
		System.out.println(str2);
		
		
	} 

}
