package mission;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		//1차원 배열 이용 
		
		//[입력 화면]
		//숫자 10개 차례대로 입력, 공백으로 구분  
		//둘째줄에 k값 입력 
		
		//[출력 화면]
		//k번째 숫자가 무엇인지 출력한다.
		
		Scanner sc = new Scanner(System.in);
		String strNum;
		int inputK = 0;
		
		// 10개 입력받아서 strNum에 저장  
		//next() 공백 포함하지 않음 nextLine() 사용 
		strNum = sc.nextLine(); 
		
		System.out.println("input num : "+strNum);
		
		inputK = sc.nextInt(); // 출력하고자 하는 k번째 입력 
		String[] num = strNum.split(" ");// 공백 구분 

		int[] numArray = new int[num.length];
		
		for(int i =0 ; i<num.length;i++) {
			try {
				numArray[i] = Integer.parseInt(num[i]); // int 형 변환 				
			}catch(Exception e) {
				//int형으로 변환할 수 없는 경우를 위한 예외처리 
				System.out.println("unable to pare string to int");
				e.printStackTrace();
			}
		}
		
		for(int i= 0; i<numArray.length; i++) {
			if(i == inputK-1) {
				System.out.println((i+1)+"번째 숫자는 " + num[i]);
				break;
			}
		}
		
		
		

	}

}
