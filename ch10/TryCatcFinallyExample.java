package ch10;

public class TryCatcFinallyExample {

	public static void main(String[] args) {
		// 10�� Ȯ�ι��� 6�� 
		
		String[] str= {"10", "2a"};
		int value =0;
		for(int i =0 ; i<=2 ; i++) {
			try {
				value = Integer.parseInt(str[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("�ε��� �ʰ�");
			}catch(NumberFormatException e ) {
				System.out.println("���� ��ȯ�� �� ����");
			}finally {
				System.out.println(i + ": "+value);
			}
		}
		

	}

}
