package ch04;

public class Ex03 {

	public static void main(String[] args) {
		//210707
	    //117p switch�� ����
		//Math.random(), ���� �߻�, 0~1������ ������ �� �߻� 
		System.out.println(Math.random()*6);//0~6������ ���� �� 
		System.out.println((int)(Math.random()*6));//���� ����ȯ
		System.out.println((int)(Math.random()*6)+1);//1~5���� ��µ�
		
		
		
		//117p ���� Ǯ��
		int num = (int)(Math.random()*6)+1;
		
		switch(num) {
		case 1:
			System.out.println("1 ���");
			break;
		case 2:
			System.out.println("2 ���");
			break;
		case 3:
			System.out.println("3 ���");
			break;
		case 4:
			System.out.println("4 ���");
			break;
		case 5:
			System.out.println("5 ���");
			break;
		case 6:
			System.out.println("6 ���");
			break;
		default:
			System.out.println("���X");
		}
	}

}
