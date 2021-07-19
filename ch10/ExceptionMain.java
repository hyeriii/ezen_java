package ch10;

import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
		//********************************************
		// NullPointerException - 참조 변수에 참조값이 없는데 사용하려고 할때 발생
		//********************************************
		try {
		String s1 =null;
		System.out.println(s1);
		//참조변수의 타입 클래스로ㅜ터 제공되는 멤버를 사용하려할때 변수에 nwll값이 들어있는 경우 발생 
		System.out.println(s1.length());
		System.out.println("예외가 발생하지 않으면 실행");
		}catch(NullPointerException e) {
			System.out.println("NullPointerException 발생했습니다"); 
		}finally {
			System.out.println("필수는 아니지만 마지막에 반드시 실행됨");
		}
		
		//********************************************
		//ArrayIndexOutOfBoundsException
		//-배열에서 넘치는 index에 접근하려고 할때 발생하는 예외 
		//********************************************
		try {
		int[] iArray = new int[3];
		for(int i = 0 ; i<=iArray.length ; i++) {
			System.out.println(iArray[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("인덱스를 초과하였습니다."); 
		}
		
		//********************************************
		//NumberFormatException - 문자열을 숫자로 변환할때 발생하는 예외
		//********************************************
		try {
		Scanner scanner = new Scanner(System.in);
		String no = scanner.nextLine();
		//입력받은 문자를 숫자로 변경
		int noByInt = Integer.parseInt(no);
		System.out.println(noByInt);
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변경할 수 없는 문자입니다."); 
		}
		
		//********************************************
		//ClassCastException - 잘못된 강제 형변환으로 발생하는 예외
		//********************************************
		try{
			child1 c1 = new child1();
			child2 c2 = new child2();
		
		Parent p = c1; // 자동형변환
		c2 =(child2) p ; //강제형변환 
		}catch(ClassCastException e) {
			System.out.println("잘못된 타입의 변환입니다."); 
		}
		
		//********************************************
		//ArithmeticException - 정수값을 0으로 나누려 했을 떄 발생하는 예외 ex) 계산기 만들때 사용자가 0으로 나울려고 했을때 예외처리 필요함
		//********************************************
		try{
			int result = 10/0;
		}catch(RuntimeException e) {
			
			System.out.println("숫자를 0으로 나눌수 없습니다.");
		}
		
		/*
		try {
			System.out.printll("");
		}catch(Exception e) {
			
		}
		*/
		
		
		
	}

}
