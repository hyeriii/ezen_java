package ch04;

public class Ch05 {

	public static void main(String[] args) {
		// 135p Ȯ�ι��� 5�� 
		//x,y�� 10������ �ڿ���
		
		int x = 0;
		int y = 0;
		
		for(x=1;x<=10;++x){
		
			for(y=1;y<=10;y++){
			
				if((4*x+5*y)==60) {
					System.out.println("�������� �ش� " +x+","+y +"�Դϴ�.");
				}
			}
			
			
		}
		
		
	}

}
