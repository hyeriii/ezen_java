package ch06_1;

public class PublicClass {

	public static String field1 = "publicClassField1";
	public static PublicClass ps = new PublicClass("test");
	
	public String field1_s1 = "test";
	String field1_s2 = "test2";
	private String field1_s3 = "test3";
	
	
	
	public PublicClass() {
		field1_s3 = "test3_1";
	}
	
	PublicClass(int arg){
		
	}
	
	private PublicClass(String arg) {
		
	}
	
	
}

 class DefualtCalss{
	//������� ���õ� class���� �� ���� ���������� ������ �ϴ��� class�� �������� ��� �� ����. 
	public static String field1 = "defualtClassField1";
	public String field1_d1 = "test";
}