package ch11;

public class WrapperMain {

	public static void main(String[] args) {
		
		//�⺻Ÿ�Ե��� ���� Ŭ����
		//WrapperŬ�������� �����ڿ� ���ڿ� ���� �ѱ�� ���ڿ��� �ش� Ŭ������ �⺻Ÿ������ ���� �����ϸ�
		//�⺻Ÿ�� ������ �ڵ� ����ȯ�� �ȴ�
		Byte bObj = new Byte("10");
		byte b = bObj;
		System.out.println(b);
		
		Integer iObj = new Integer(10);
		int i = iObj;
		System.out.println(i);
		
		b= Byte.parseByte("10");
		
	
		i = Integer.valueOf("10");
		System.out.println(i);
		
		//�ڽ� 
		Integer iBox = Integer.valueOf(i);
		
		//��ڽ�
		i = iBox.intValue();
		
		//�ڽ� - �⺻Ÿ���� ��ü�� ��ȯ, parseInt or valueOf ��� 
		//��ڽ� - ��ü�� �⺻Ÿ������ ��ȯ, ����.Value()
		//�� �۾��� Wrapper Ŭ������ �̿��Ͽ� �����Ѵ� 
		
		
		
		
		
		
	}

}
