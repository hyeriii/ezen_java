package ch04;

public class Ch04 {

	public static void main(String[] args) {
		//134p Ȯ�ι��� 4�� : break���, boolean �������, *����Ļ��
		
		/*
		boolean flag = true; 
		
		while(flag) {
			
			
			int a = (int)(Math.random()*6)+1;
			int b = (int)(Math.random()*6)+1;
		//	System.out.println(a+"+"+b+ "+" + (a+b)); 
			System.out.println("("+ a+"," + b+ ")");
			if(a+b == 5) {
				System.out.println("�� �ֻ����� ���� 5�̹Ƿ� ���α׷� ����");
				System.out.println("("+ a+"," + b+ ")"); 
				//System.out.println(a+"+"+b+ "=" + (a+b)); 
				//System.out.println("�� �ֻ����� ���� 5�Դϴ�. ");
				flag = false; 
			}
		}
		*/
		
		//����� ��� Ǯ��
		int a =0;
		int b =0;
		while(a+b != 5) {
			a = (int)(Math.random()*6)+1;
			b = (int)(Math.random()*6)+1;
			System.out.println("("+ a+"," + b+ ")");
		
		}
		
		
		
		
		
	}

}
