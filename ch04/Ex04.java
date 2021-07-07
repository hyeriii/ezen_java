package ch04;

public class Ex04 {

	public static void main(String[] args) {
		//210707
		//for문
	/*
		int a =(int)(Math.random()*52);
		char c =(a <26)? 'A' :'a';
		System.out.println(c);//1~5까지 출력됨
	*/
		
//		Ex04 rnd = new Ex04();
//		char c = (char) ('a' + rnd.nextInt(26));
		
		
		//for문 이용한 별 찍는 예제
		
		String star = "";
		for(int i = 0 ;i<=5;i++) {
			star += "*";
			System.out.println(star);
		}
		
		System.out.println("for문 종료"+star);
		
		/*
		//for문이용 1~10까지의 합
		int sum =0;
		int i =0;
		for(i =1;i<=10;++i) {
			sum += i;
			
		}
		System.out.println("1~10까지의 함은 "+sum+"입니다.");
		System.out.println("전위"+i);
		
		int sum2 =0;
		int i2 =0;
		for(i2 =1;i2<=10;i2++) {
			sum2 += i2;
			
		}
		System.out.println("1~10까지의 함은 "+sum2+"입니다.");
		System.out.println("후위"+i2);
		*/
		
		//구구단
		for(int i3 =0;i3<4;i3++){
			System.out.println(i3+"단");
			for(int x =1 ;x<=9;x++) {
				if(x%2 == 0) {
				System.out.println(i3+"*"+x +"="+ i3*x);
			}
				else System.out.println("홀수입니다.");
			}
		}
		
	}

}
