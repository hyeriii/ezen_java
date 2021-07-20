package ch11;

public class StringMain {

	public static void main(String[] args) {
		String str1 = "ABC";
		String str2 = new String("ABC");
		
		System.out.println(str1 == str2);
		
		byte[] bytes = new byte[10];
		bytes[0] = 65;
		bytes[1] = 66;
		bytes[2] = 67;
		
		String str3 = new String(bytes);
		
		System.out.println(str3);
		
		bytes[0] = 72;
		bytes[1] = 101;
		bytes[2] = 108;
		bytes[3] = 108;
		bytes[4] = 111;
		bytes[5] = 13; // \r
		bytes[6] = 10; // \n
		

		String str4 = new String(bytes);
		
		System.out.println(str4);
		System.out.println("test \t test");
		
		String str5 = new String(bytes, 0, 5);
		System.out.println(str5);
		
		//*************************************
		//getBytes() - ���ڿ��� byte�迭�� ������ �޼ҵ�
		//*************************************
		
		String str6 = "�ȳ��ϼ���";
		byte[] bytes2 = new byte[10];
		
		try{
			bytes2 = str6.getBytes("EUC-KR");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		//���ڿ� �ѱ��ڿ� 1����Ʈ
		System.out.println(bytes2.length);
		
		for(int i = 0 ; i<bytes2.length;i++) {
			System.out.print(bytes2[i]+ ",");
		}
		
		System.out.println();
		
		String str7 = new String(bytes2);
		System.out.println(str7);
		
		
		
		//*************************************
		//indexOf() - �迭 �Ǵ� ���ڿ� �˻��� ����ϴ� �޼ҵ�
		//��ġ�ϴ� ���� ������ -1 ��ȯ 
		//*************************************
		
		String str8 = "�ڹ� ���α׷���";
		int index = str8.indexOf("��");
		System.out.println(index);
		
		
	
		//*************************************
		//replace()- ��ġ�ϴ� ���ڿ� ã�� �ٸ� ���ڿ��� ġȯ
		//*************************************
		
		String newStr = str8.replace("�ڹ�", "JAVA");
		System.out.println(newStr);
		System.out.println(str8);

		//*************************************
		//substring() - ���ڿ� �߶󳻴� �޼ҵ�
		//ȸ�����Խ� ����ó �޾ƿö� - ������ ����ϰԵ� 
		//*************************************
		String str9 = "111111-000000";
		String sub1 = str9.substring(0,6);
		System.out.println(sub1);
	
		String sub2 = str9.substring(7);
		System.out.println(sub2);
		
		
		//*************************************
		//trim() - ���ڿ��� �յ� ���� ���� 
		//*************************************
		String str10 = "                    java programing          ";
		System.out.println(str10.trim() );
		
		

		//*************************************
		//valueOf() - �⺻Ÿ�� �����͸� ���ڿ� �����ͷ� ��ȯ���ִ� �޼ҵ�
		//          - �����ε��� �Ǿ��ֱ� ������ Ÿ���� �ٸ��� ���� �޼ҵ带 ȣ�� �� �� �ִ�. 
		//*************************************
		String str11 = "10";
		int num =Integer.parseInt(str11);
		String numString  = String.valueOf(num);
		

		//*************************************
		//split() - ���ڿ��� �����ڸ� ���ؼ� �߶󳻼� �迭�� ��ȯ���ִ� �޼ҵ�
		//*************************************
		String str12 = "111-111-111";
		String[] arrayStr12 = str12.split("-");
		System.out.println(arrayStr12.length);
		
		//*************************************
		//StringBulider Ŭ���� - ���ڿ� ��� �ӽ� �����
		//������� ���ڿ� �����ڸ� ����Ͽ� ���ڿ��� �̾���̸� ���� ��ü�� ����ϴ� ���� �ƴ϶� ���ο� ��ü�� �����ϹǷ�
		//�ð� �� �޸� ��뿡 ȿ�������� �ʴ�.
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("java");
		System.out.println(sb);
		
		sb.append("   pro");
		System.out.println(sb);
		
		sb.delete(0, 2);
		System.out.println(sb);
		
		
	}

}
