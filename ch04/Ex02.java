package ch04;

public class Ex02 {

	public static void main(String[] args) {
		//210707
		//중첩 if문 
		String gender ="남자";
		int age = (int)(Math.random()*50)+1;
		
		System.out.println("나이는:"+ age);
		
		if(gender.equals("남자")) {
			
			if(age>=20) {
				System.out.println("남자 성인입니다.");
			}else {
				System.out.println("남자 미성년자입니다.");
			}
			
		}else {
			
			if(age>=20) {
				System.out.println("여자 성인입니다.");
			}else {
				System.out.println("여자 미성년자입니다.");
			}
		}
		
		//switch문 
		//1.변수를 이용한 switch문
		char grade = 'C';
		
		switch(grade) {
		case 'A':
			System.out.println("A등급입니다");
			break;
		case 'B':
			System.out.println("B등급입니다");
			break;
		case 'C':
			System.out.println("C등급입니다");
			break;
		default:
			System.out.println("D등급입니다");
			
		}
		
		//2.연산식을 이용한 switch문
		int a = 10;
		
		switch(a/2) {//switch문의 안에 들어올 수 있는 값은 정수 or 문자 
		case 1:
			System.out.println("a/2결과는 1입니다.");
			break;
		case 2:
			System.out.println("a/2결과는 2입니다.");
			break;
		case 5:
			System.out.println("a/2결과는 5입니다.");
			break;
		default:
			System.out.println("그 외 값입니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
