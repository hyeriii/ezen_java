package ch04;

public class Ex06 {

	public static void main(String[] args) {
		//210707
		//보조 제어문 break
		//:labal 사용 -> 더 바깥쪽에 반복문 종료 가능 
		here:for(int i=1;i<=5;i++) {
			System.out.println(i+"번째 바깥 for문");
			for(int j=1;j<=10;j++) {
				if(j>5) {
					break here;
				}
				System.out.println(j+"안쪽");	
			}
		}
		
		//보조 제어문 continue
		for(int i =1;i<=10;i++) {
			if(i%2 != 0) {
				continue; // 증감식으로감
			}
			System.out.println(i);
		}
		
		
		
		
		
		
	}

}
