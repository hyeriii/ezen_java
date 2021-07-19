package ch10;

import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
		//********************************************
		// NullPointerException - ���� ������ �������� ���µ� ����Ϸ��� �Ҷ� �߻�
		//********************************************
		try {
		String s1 =null;
		System.out.println(s1);
		//���������� Ÿ�� Ŭ�����Τ��� �����Ǵ� ����� ����Ϸ��Ҷ� ������ nwll���� ����ִ� ��� �߻� 
		System.out.println(s1.length());
		System.out.println("���ܰ� �߻����� ������ ����");
		}catch(NullPointerException e) {
			System.out.println("NullPointerException �߻��߽��ϴ�"); 
		}finally {
			System.out.println("�ʼ��� �ƴ����� �������� �ݵ�� �����");
		}
		
		//********************************************
		//ArrayIndexOutOfBoundsException
		//-�迭���� ��ġ�� index�� �����Ϸ��� �Ҷ� �߻��ϴ� ���� 
		//********************************************
		try {
		int[] iArray = new int[3];
		for(int i = 0 ; i<=iArray.length ; i++) {
			System.out.println(iArray[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�ε����� �ʰ��Ͽ����ϴ�."); 
		}
		
		//********************************************
		//NumberFormatException - ���ڿ��� ���ڷ� ��ȯ�Ҷ� �߻��ϴ� ����
		//********************************************
		try {
		Scanner scanner = new Scanner(System.in);
		String no = scanner.nextLine();
		//�Է¹��� ���ڸ� ���ڷ� ����
		int noByInt = Integer.parseInt(no);
		System.out.println(noByInt);
		}catch(NumberFormatException e) {
			System.out.println("���ڷ� ������ �� ���� �����Դϴ�."); 
		}
		
		//********************************************
		//ClassCastException - �߸��� ���� ����ȯ���� �߻��ϴ� ����
		//********************************************
		try{
			child1 c1 = new child1();
			child2 c2 = new child2();
		
		Parent p = c1; // �ڵ�����ȯ
		c2 =(child2) p ; //��������ȯ 
		}catch(ClassCastException e) {
			System.out.println("�߸��� Ÿ���� ��ȯ�Դϴ�."); 
		}
		
		//********************************************
		//ArithmeticException - �������� 0���� ������ ���� �� �߻��ϴ� ���� ex) ���� ���鶧 ����ڰ� 0���� ������� ������ ����ó�� �ʿ���
		//********************************************
		try{
			int result = 10/0;
		}catch(RuntimeException e) {
			
			System.out.println("���ڸ� 0���� ������ �����ϴ�.");
		}
		
		/*
		try {
			System.out.printll("");
		}catch(Exception e) {
			
		}
		*/
		
		
		
	}

}
