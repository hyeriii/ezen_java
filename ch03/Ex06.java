package ch03;

public class Ex06 {

	public static void main(String[] args) {
		//210706
		//대입연산자
		//1.단순대입 연산자 - 다른 연산 없이 대입만 하는 연산자 =
		int a;
		a= 10+10;
		
		
		//2.복합대입 연산자 - 대입과 연산 동시에
		int sum = 0;
		int num1 = 10;
		int num2 = 20;
		
		sum = num1; 
		sum += num2;
		
		//A반 10명 학생의 자바 점수 합
		int [] student = {10,20,30,40,50,60,70,80,90,100};
		sum = 0;
		
		for(int i = 0; i<10 ; i++)
		{
			sum += student[i];
		}
		
		System.out.println("A반 학생의 자바 점수 합은"+ sum +"입니다.");
		
		//+=경우 정수 타입 변수와 정수 데이터 사이의 연산자로 오면 변수 값을 누적하여 덧셈함
		
		String str = "";
		str += "test"; 
		System.out.println(str);
		str += ", sample";
		System.out.println(str);

		//삼항 연산자
		int x = 5;
		int y = 7;
		int num = (x>y)? x:y;
		System.out.println(num);
		
	}

}
