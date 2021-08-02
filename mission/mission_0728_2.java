package mission;

import java.util.Scanner;

public class mission_0728_2 {

	public static void main(String[] args) {
		// 연산식을 이용하여 입력받은 두수의 몫구하기 
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;
		double  result = 0; 
		
		System.out.print("첫번째 수 입력 >");
		a= scanner.nextInt();

		System.out.print("두번째 수 입력 >");
		b= scanner.nextInt();
		
		result = a/b;
		System.out.println("두 수의 몫 : "+ result);
		
	}

}
