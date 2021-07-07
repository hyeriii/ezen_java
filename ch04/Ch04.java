package ch04;

public class Ch04 {

	public static void main(String[] args) {
		//134p 확인문제 4번 : break사용, boolean 변수사용, *연산식사용
		
		/*
		boolean flag = true; 
		
		while(flag) {
			
			
			int a = (int)(Math.random()*6)+1;
			int b = (int)(Math.random()*6)+1;
		//	System.out.println(a+"+"+b+ "+" + (a+b)); 
			System.out.println("("+ a+"," + b+ ")");
			if(a+b == 5) {
				System.out.println("두 주사위의 합이 5이므로 프로그램 종료");
				System.out.println("("+ a+"," + b+ ")"); 
				//System.out.println(a+"+"+b+ "=" + (a+b)); 
				//System.out.println("두 주사위의 합은 5입니다. ");
				flag = false; 
			}
		}
		*/
		
		//연산식 사용 풀이
		int a =0;
		int b =0;
		while(a+b != 5) {
			a = (int)(Math.random()*6)+1;
			b = (int)(Math.random()*6)+1;
			System.out.println("("+ a+"," + b+ ")");
		
		}
		
		
		
		
		
	}

}
