package ch04;

public class Ex03 {

	public static void main(String[] args) {
		//210707
	    //117p switch문 예제
		//Math.random(), 난수 발생, 0~1사이의 랜덤한 수 발생 
		System.out.println(Math.random()*6);//0~6사이의 랜덤 수 
		System.out.println((int)(Math.random()*6));//강제 형변환
		System.out.println((int)(Math.random()*6)+1);//1~5까지 출력됨
		
		
		
		//117p 예제 풀이
		int num = (int)(Math.random()*6)+1;
		
		switch(num) {
		case 1:
			System.out.println("1 출력");
			break;
		case 2:
			System.out.println("2 출력");
			break;
		case 3:
			System.out.println("3 출력");
			break;
		case 4:
			System.out.println("4 출력");
			break;
		case 5:
			System.out.println("5 출력");
			break;
		case 6:
			System.out.println("6 출력");
			break;
		default:
			System.out.println("출력X");
		}
	}

}
