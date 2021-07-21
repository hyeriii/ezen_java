package ch11;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		//Date 객체 예제
		//Date 객체는  생성되는 시간정보(매번 달라지는) 가지기 때문에 싱클톤이 아니라 객체로 관리가 된다.
		Date today = new Date();
		System.out.println(today.toString());
		
		//원하는 형식으로 변경 
		SimpleDateFormat sdf 
				= new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		String todayStr = sdf.format(today);
		System.out.println(todayStr);
		
		//형식 - 2021-07-21
		SimpleDateFormat sdf2 
				= new SimpleDateFormat("yyyy-MM-dd");

		String todayStr2 = sdf2.format(today);
		System.out.println(todayStr2);

		//형식 - 03:08:22
		SimpleDateFormat sdf3 
				= new SimpleDateFormat("hh:mm:ss");

		String todayStr3 = sdf3.format(today);	
		System.out.println(todayStr3);
		
		
		//********************************************************
		//Calendar 클래스 - 달력정보를 얻어오는 클래스이며 싱클톤이다 ex 나이 구하기
		//********************************************************
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = cal.get(Calendar.MONTH)+1; //0~11까지임 정확히 하고싶으면 +1하기 
		System.out.println(month);
	
		int day = cal.get(Calendar.DAY_OF_MONTH);  
		System.out.println(day);
		
		int week = cal.get(Calendar.DAY_OF_WEEK);  
		System.out.println(week);//0~6 존재, 0 -> 토요일
		
		
		//Format 클래스
		DecimalFormat dcf = new DecimalFormat("#,###");
		
		int number = 100000;
		String numberStr = dcf.format(number);
		System.out.println(numberStr);
		
		
		
		
	}

}
