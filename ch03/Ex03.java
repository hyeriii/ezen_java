
package ch03;

public class Ex03 {

	public static void main(String[] args) {
		//210705
		//���׿�����2
		//1. �񱳿�����
		int a = 10;
		int b = 20;
		int c = 10;
		boolean result = false;
		
		//1-1. ��� ��
		result = a > b; 
		System.out.println("a > b -> "+result);
		
		result = a < b; 
		System.out.println("a < b -> "+result);
		
		result = a >= c; 
		System.out.println("a >= c -> "+result);
		
		
		//1-2. ���� ��, boolean�������� ��밡���� 
		result = a == b;
		System.out.println("a == b :"+result);
		
		result = a != b;
		System.out.println("a!=b : " + result);
		
		boolean b1 = true;
		boolean b2 = false;
		result = b1 == b2;
		System.out.println("b1 == b2 :"+result);
		
		
		// ���ڿ��� ��� �׻� ���� ���� ���� �� �ִٴ°��� ���, ==
		String str1 = "test";
		String str2 = "test";
		result = str1 == str2;
		System.out.println("str1 == str2 : " + result);
		
		String str3 = new String("test"); // ��ü����
		System.out.println( str3 );
		
		//���ڿ� �񱳽� equals�̿��ϴ°��� ���� ��Ȯ�� 
		System.out.println("str1==str3  : " + str1.equals(str2) );
	}

}
