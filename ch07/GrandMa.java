package ch07;

public class GrandMa {

	public String grandmafield1 = "grandma";
	public String field = "grandma";
	public GrandMa() {
		// �⺻������ ����� �ڽ�Ŭ������ super����� 
	}
	
	public GrandMa( String grandmafield1 ) {
		System.out.println(" String grandmafield1 ������ ȣ�� ");
		this.grandmafield1 = grandmafield1 ;
	}
	
	
	public void gMethod() {
		System.out.println("gMethod ");
	}
	
}
