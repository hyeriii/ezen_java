package ch05;

public class Ex02 {

	public static void main(String[] args) {
		//210708
		//null �� nullPointerException
		//null�� ����Ÿ�� ������ �������� ���� �� �����ϴ� ��
		
		String str1 = null;
		System.out.println(str1);
		String str2 = null;
		System.out.println(str1==str2);
		
		//nullPointerException
		//-���������� �ּҰ��� �Ҵ�������� ���� ���¿��� �ش� Ÿ���� ������ �Ӽ�, ���ۿ� ����( ex) .length() )�Ϸ��� �Ҷ� �߻��ϴ� ���� 
		str1 = "java";
		System.out.println("str1���� ->"+str1.length());
	//	System.out.println("str2���� ->"+str2.length()); //nullPointerException �߻�
		
		

		
		
	}

}
