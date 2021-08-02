package mission;

import java.util.Calendar;

public class mission_0728_1 {

	
	public static void main(String[] args) {

		//오늘 요일 출력
		 Calendar calendar = Calendar.getInstance();
		
		int temp = calendar.get(Calendar.DAY_OF_WEEK);
	
		 //System.out.println(Calendar.DAY_OF_WEEK);
		if(temp== 1) {
			System.out.println("일요일입니다");
		}else if(temp== 2) {
			 System.out.println("월요일입니다");
		 }else if(temp == 3) {
			 System.out.println("화요일입니다");
		 }else if(temp == 4) {
			 System.out.println("수요일입니다");
		 }else if(temp == 5) {
			 System.out.println("목요일입니다");
		 }else if(temp == 6) {
			 System.out.println("금요일입니다");
		 }else if(temp== 7) {
			 System.out.println("토요일입니다");
		 }
		
		
		
		
		
		
		 
		
	}

}
