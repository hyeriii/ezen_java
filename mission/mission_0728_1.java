package mission;

import java.util.Calendar;

public class mission_0728_1 {

	
	public static void main(String[] args) {

		//���� ���� ���
		 Calendar calendar = Calendar.getInstance();
		
		int temp = calendar.get(Calendar.DAY_OF_WEEK);
	
		 //System.out.println(Calendar.DAY_OF_WEEK);
		if(temp== 1) {
			System.out.println("�Ͽ����Դϴ�");
		}else if(temp== 2) {
			 System.out.println("�������Դϴ�");
		 }else if(temp == 3) {
			 System.out.println("ȭ�����Դϴ�");
		 }else if(temp == 4) {
			 System.out.println("�������Դϴ�");
		 }else if(temp == 5) {
			 System.out.println("������Դϴ�");
		 }else if(temp == 6) {
			 System.out.println("�ݿ����Դϴ�");
		 }else if(temp== 7) {
			 System.out.println("������Դϴ�");
		 }
		
		
		
		
		
		
		 
		
	}

}
