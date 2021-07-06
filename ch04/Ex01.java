package ch04;

public class Ex01 {

	public static void main(String[] args) {
		//210706
		//제어문 - 조건문
		//1. if
		//1-1. boolean type 
		boolean b = true;
		
		if(b) {
			System.out.println("b는 true를 가지고 있다.");
		}
		
		b = false;
		if(b) {
			System.out.println("b는 여전히 true를 가지고 있다.");
		}
		
		
		//1-2. 비교연산식을 사용한 경우 
		int x = 5;
		int y = 10;
		
		if(x>y) {
			System.out.println("x>y 결과는 T입니다");
		}
		
		//1-3. 논리연산식을 사용한 조건식 가능 
		
		//3. else if
		
		x = 5;
		y = 15;
		
		if(x>y) {
			System.out.println("x가 y보다 큼");
		}else if(x == y) {
			System.out.println("x와 y가 같다");
		}else {
			System.out.println("x가 y보다 작음");
		}
		
		//미션 
		int score = 77;
		
		if(score > 100) {
			System.out.println("허용할 수 없는 점수입니다");
		}else if(score>=95) {
			System.out.println("A+입니다.");
		}else if(score>=90) {
			System.out.println("A입니다.");
		}else if(score>=85) {
			System.out.println("B+입니다.");
		}else if(score>=80) {
			System.out.println("B입니다.");
		}else if(score>=75) {
			System.out.println("C+입니다.");
		}else if(score>=70) {
			System.out.println("C입니다.");
		}else {
			System.out.println("D입니다.");
		}



		
		
		
		
		
		
		
	}

}
