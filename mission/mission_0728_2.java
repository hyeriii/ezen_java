package mission;

import java.util.Scanner;

public class mission_0728_2 {

	public static void main(String[] args) {
		// ������� �̿��Ͽ� �Է¹��� �μ��� ���ϱ� 
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;
		double  result = 0; 
		
		System.out.print("ù��° �� �Է� >");
		a= scanner.nextInt();

		System.out.print("�ι�° �� �Է� >");
		b= scanner.nextInt();
		
		result = a/b;
		System.out.println("�� ���� �� : "+ result);
		
	}

}
