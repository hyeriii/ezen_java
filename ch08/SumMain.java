package ch08;

import java.util.Scanner;

public class SumMain {

	public static void main(String[] args) {
		//두 정수 입력받아 두 사이 수 합 구하기

		int sum = 0;
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 값 입력 >");
		a = sc.nextInt();
		
		System.out.print("종료 값 입력 >");
		b = sc.nextInt();
		
		int i = 0;
		for(i=a ;i<=b;i++) {
			sum +=i;
		}
		
		
		System.out.print(a + "부터 "+b+"까지의 합은 "+sum +"입니다.");
		
		
		
		
		
		
		
	}

}
