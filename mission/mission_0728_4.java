package mission;

public class mission_0728_4 {

	public static void main(String[] args) {


		int temp1 ;
		int temp2 ;
		int sum =0 ;
		int count=0; 
		boolean run = true;
		
		while(run) {
			
			temp1 = (int)(Math.random()*6+1);
			temp2 = (int)(Math.random()*6+1);
			count++;
			
			sum = temp1 + temp2;
			System.out.println(count+"��°�õ�->�ֻ���1:"+temp1+",�ֻ���2:"+temp2+",�� :"+sum);
			if(sum == 10) {
				run = false;
			}
			
		}
		System.out.println("���α׷��� ����˴ϴ�");
	}

}
