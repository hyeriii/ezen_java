package ch07;

public class GrandMa {

	public String grandmafield1 = "grandma";
	public String field = "grandma";
	public GrandMa() {
		// 기본생성자 존재시 자식클래스에 super없어도됨 
	}
	
	public GrandMa( String grandmafield1 ) {
		System.out.println(" String grandmafield1 생성자 호출 ");
		this.grandmafield1 = grandmafield1 ;
	}
	
	
	public void gMethod() {
		System.out.println("gMethod ");
	}
	
}
