package ch06_1;

public class ClassTestMain {

	public static void main(String[] args) {

		PublicClass pc = new PublicClass();// public- �������� ���� ����
		PublicClass pc2 = new PublicClass(1);// default - ������Ű������ ���� ����
//		PublicClass pc3 = new PublicClass(""); // private - class�������� ��밡���� ����������
		

		PublicClass p3 = new PublicClass();
		System.out.println(p3.field1_s1);
		System.out.println(p3.field1_s2);
	//	System.out.println(p3.field1_s3);
		
		
		
	}

}
