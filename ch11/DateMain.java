package ch11;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		//Date ��ü ����
		//Date ��ü��  �����Ǵ� �ð�����(�Ź� �޶�����) ������ ������ ��Ŭ���� �ƴ϶� ��ü�� ������ �ȴ�.
		Date today = new Date();
		System.out.println(today.toString());
		
		//���ϴ� �������� ���� 
		SimpleDateFormat sdf 
				= new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		
		String todayStr = sdf.format(today);
		System.out.println(todayStr);
		
		//���� - 2021-07-21
		SimpleDateFormat sdf2 
				= new SimpleDateFormat("yyyy-MM-dd");

		String todayStr2 = sdf2.format(today);
		System.out.println(todayStr2);

		//���� - 03:08:22
		SimpleDateFormat sdf3 
				= new SimpleDateFormat("hh:mm:ss");

		String todayStr3 = sdf3.format(today);	
		System.out.println(todayStr3);
		
		
		//********************************************************
		//Calendar Ŭ���� - �޷������� ������ Ŭ�����̸� ��Ŭ���̴� ex ���� ���ϱ�
		//********************************************************
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = cal.get(Calendar.MONTH)+1; //0~11������ ��Ȯ�� �ϰ������ +1�ϱ� 
		System.out.println(month);
	
		int day = cal.get(Calendar.DAY_OF_MONTH);  
		System.out.println(day);
		
		int week = cal.get(Calendar.DAY_OF_WEEK);  
		System.out.println(week);//0~6 ����, 0 -> �����
		
		
		//Format Ŭ����
		DecimalFormat dcf = new DecimalFormat("#,###");
		
		int number = 100000;
		String numberStr = dcf.format(number);
		System.out.println(numberStr);
		
		
		
		
	}

}
