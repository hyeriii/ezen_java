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
	
	
	//��Ŭ���� ��Ŭ�� - �ҽ� - toString , �ڵ�ȭ ��� ������ 
	@Override
	public String toString() {
		return "EntityCalss [field1=" + field1 + ", field2=" + field2 + ", field3=" + field3 + ", field4=" + field4
				+ ", field5=" + field5 + "]";
	}
	
	
/*	
	//Object Ŭ������ ToString������ ������ ��ü�� ���ڿ� ������ ��ȯ���ִ� ������ �Ѵ�.
	@Override
	public String toString() {
		//Object�� ������ �ִ� toString()�� ������ �ϰڴٴ� �ǵ���
		//���������� ��ü�� �������ִ� ������ �ʵ� ������ �ϳ��� ���ڿ��� ��ȯ�ϴ� ����
		return "";
	}
*/	
	
}
