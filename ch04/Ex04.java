package ch04;

public class Ex04 {

	public static void main(String[] args) {
		//210707
		//for��
	/*
		int a =(int)(Math.random()*52);
		char c =(a <26)? 'A' :'a';
		System.out.println(c);//1~5���� ��µ�
	*/
		
//		Ex04 rnd = new Ex04();
//		char c = (char) ('a' + rnd.nextInt(26));
		
		
		//for�� �̿��� �� ��� ����
		
		String star = "";
		for(int i = 0 ;i<=5;i++) {
			star += "*";
			System.out.println(star);
		}
		
		System.out.println("for�� ����"+star);
		
		/*
		//for���̿� 1~10������ ��
		int sum =0;
		int i =0;
		for(i =1;i<=10;++i) {
			sum += i;
			
		}
		System.out.println("1~10������ ���� "+sum+"�Դϴ�.");
		System.out.println("����"+i);
		
		int sum2 =0;
		int i2 =0;
		for(i2 =1;i2<=10;i2++) {
			sum2 += i2;
			
		}
		System.out.println("1~10������ ���� "+sum2+"�Դϴ�.");
		System.out.println("����"+i2);
		*/
		
		//������
		for(int i3 =0;i3<4;i3++){
			System.out.println(i3+"��");
			for(int x =1 ;x<=9;x++) {
				if(x%2 == 0) {
				System.out.println(i3+"*"+x +"="+ i3*x);
			}
				else System.out.println("Ȧ���Դϴ�.");
			}
		}
		
	}

}
