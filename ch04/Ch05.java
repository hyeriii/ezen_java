package ch04;

public class Ch05 {

	public static void main(String[] args) {
		// 135p 확인문제 5번 
		//x,y는 10이하의 자연수
		
		int x = 0;
		int y = 0;
		
		for(x=1;x<=10;++x){
		
			for(y=1;y<=10;y++){
			
				if((4*x+5*y)==60) {
					System.out.println("방정식의 해는 " +x+","+y +"입니다.");
				}
			}
			
			
		}
		
		
	}

}
