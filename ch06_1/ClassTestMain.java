package ch06_1;

public class ClassTestMain {

	public static void main(String[] args) {

		PublicClass pc = new PublicClass();// public- 모든곳에서 접근 가능
		PublicClass pc2 = new PublicClass(1);// default - 같은패키지에서 접근 가능
//		PublicClass pc3 = new PublicClass(""); // private - class내에서만 사용가능한 접근제한자
		

		PublicClass p3 = new PublicClass();
		System.out.println(p3.field1_s1);
		System.out.println(p3.field1_s2);
	//	System.out.println(p3.field1_s3);
		
		
		
	}

}
