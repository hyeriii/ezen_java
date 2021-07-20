package ch11;

public class EntityCalss {

	private int field1;
	private int field2;
	private String field3;
	private String field4;
	private boolean field5;
	
	
	public EntityCalss(int field1,int field2,String field3,String field4, boolean field5 ) {
		this.field1=field1;
		this.field2 =field2;
		this.field3 =field3;
		this.field4 =field4;
		this.field5 =field5;
	}
	
	
	//이클립스 우클릭 - 소스 - toString , 자동화 기능 제공함 
	@Override
	public String toString() {
		return "EntityCalss [field1=" + field1 + ", field2=" + field2 + ", field3=" + field3 + ", field4=" + field4
				+ ", field5=" + field5 + "]";
	}
	
	
/*	
	//Object 클래스의 ToString역할은 생성된 객체의 문자열 정보를 반환해주는 역할을 한다.
	@Override
	public String toString() {
		//Object가 가지고 있는 toString()를 재정의 하겠다는 의도는
		//보편적으로 객체가 가지고있는 데이터 필드 정보를 하나의 문자열로 반환하는 역할
		return "";
	}
*/	
	
}
