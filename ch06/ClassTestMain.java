package ch06;

import ch06_1.PublicClass;

//import ch06_1.DefualtClass; : defualt ���������ڴ� �ڽ��� ���� ��Ű���� ����� ��� �� �� ����

public class ClassTestMain {

	public static void main(String[] args) {
		//210713
		System.out.println(PublicClass.field1);

		PublicClass pc = new PublicClass(); //public
		//PublicClass pc2 = new PublicClass(2);//default - ���� ��Ű���������� ���� 
		//PublicClass pc3 = new PublicClass("");
		
		//DefualtCalss dc = new DefualtCalss(); 
		
	}

}
