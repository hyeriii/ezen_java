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
	//정적멤버 역시도 class보다 더 약한 접근제한을 가진다 하더라도 class의 사용범위를 벗어날 수 없다. 
	public static String field1 = "defualtClassField1";
	public String field1_d1 = "test";
}