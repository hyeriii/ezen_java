package ch04;

public class Ex01 {

	public static void main(String[] args) {
		//210706
		//��� - ���ǹ�
		//1. if
		//1-1. boolean type 
		boolean b = true;
		
		if(b) {
			System.out.println("b�� true�� ������ �ִ�.");
		}
		
		b = false;
		if(b) {
			System.out.println("b�� ������ true�� ������ �ִ�.");
		}
		
		
		//1-2. �񱳿������ ����� ��� 
		int x = 5;
		int y = 10;
		
		if(x>y) {
			System.out.println("x>y ����� T�Դϴ�");
		}
		
		//1-3. ��������� ����� ���ǽ� ���� 
		
		//3. else if
		
		x = 5;
		y = 15;
		
		if(x>y) {
			System.out.println("x�� y���� ŭ");
		}else if(x == y) {
			System.out.println("x�� y�� ����");
		}else {
			System.out.println("x�� y���� ����");
		}
		
		//�̼� 
		int score = 77;
		
		if(score > 100) {
			System.out.println("����� �� ���� �����Դϴ�");
		}else if(score>=95) {
			System.out.println("A+�Դϴ�.");
		}else if(score>=90) {
			System.out.println("A�Դϴ�.");
		}else if(score>=85) {
			System.out.println("B+�Դϴ�.");
		}else if(score>=80) {
			System.out.println("B�Դϴ�.");
		}else if(score>=75) {
			System.out.println("C+�Դϴ�.");
		}else if(score>=70) {
			System.out.println("C�Դϴ�.");
		}else {
			System.out.println("D�Դϴ�.");
		}



		
		
		
		
		
		
		
	}

}
