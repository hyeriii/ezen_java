package ch04;

public class Ex06 {

	public static void main(String[] args) {
		//210707
		//���� ��� break
		//:labal ��� -> �� �ٱ��ʿ� �ݺ��� ���� ���� 
		here:for(int i=1;i<=5;i++) {
			System.out.println(i+"��° �ٱ� for��");
			for(int j=1;j<=10;j++) {
				if(j>5) {
					break here;
				}
				System.out.println(j+"����");	
			}
		}
		
		//���� ��� continue
		for(int i =1;i<=10;i++) {
			if(i%2 != 0) {
				continue; // ���������ΰ�
			}
			System.out.println(i);
		}
		
		
		
		
		
		
	}

}
