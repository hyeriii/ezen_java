package ch04;

public class Ex02 {

	public static void main(String[] args) {
		//210707
		//��ø if�� 
		String gender ="����";
		int age = (int)(Math.random()*50)+1;
		
		System.out.println("���̴�:"+ age);
		
		if(gender.equals("����")) {
			
			if(age>=20) {
				System.out.println("���� �����Դϴ�.");
			}else {
				System.out.println("���� �̼������Դϴ�.");
			}
			
		}else {
			
			if(age>=20) {
				System.out.println("���� �����Դϴ�.");
			}else {
				System.out.println("���� �̼������Դϴ�.");
			}
		}
		
		//switch�� 
		//1.������ �̿��� switch��
		char grade = 'C';
		
		switch(grade) {
		case 'A':
			System.out.println("A����Դϴ�");
			break;
		case 'B':
			System.out.println("B����Դϴ�");
			break;
		case 'C':
			System.out.println("C����Դϴ�");
			break;
		default:
			System.out.println("D����Դϴ�");
			
		}
		
		//2.������� �̿��� switch��
		int a = 10;
		
		switch(a/2) {//switch���� �ȿ� ���� �� �ִ� ���� ���� or ���� 
		case 1:
			System.out.println("a/2����� 1�Դϴ�.");
			break;
		case 2:
			System.out.println("a/2����� 2�Դϴ�.");
			break;
		case 5:
			System.out.println("a/2����� 5�Դϴ�.");
			break;
		default:
			System.out.println("�� �� ���Դϴ�.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
