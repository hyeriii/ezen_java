package ch07;

public class Parent extends GrandMa{

	public String f = "f_parent";
	
	public String field = "parent";
	// �θ� Ŭ������ �ڽ� Ŭ������ �ʵ� �̸��� ������ �θ� Ŭ���� �ʵ尪�� �ҷ����� ������ super ����ϸ� ���� 
	public String gfield = super.field;
	// GrandMa�� �⺻ �����ڰ� ���� ������ �ڽ� class���� GrandMa�� �����ڸ� ȣ������� �Ѵ�. 
	public Parent() {
		//�ڽ� ��ü�� �����Ǳ� ���ؼ��� �ݵ�� �θ� ��ü�� ���� �����Ǿ�� �ϹǷ�
		//�θ�Ŭ������ �⺻�����ڰ� ���� ��� �ڽ� �����ڿ��� �θ�����ڸ� ȣ���Ѵ�
		super("GrandMa field1");
		//�����ǰ� �ִ� �θ� ��ü�� �ּҰ���  �����ϰ� �ִ� Ű����
		//�ڽĺ��� �θ� ���� �����Ǿ���ϱ⶧���� super���� ��� ���๮�� ���� ���صǼ��� �ȵȴ�. ������ ���� �߻�
	}
	
	public String parentField1 = "parentField1";
	//default ���������ڴ� ����� �޾Ƶ� ��ĳ���� ����� ����� �� ���� 
	String parentField2 = "parent_default";
	
	private void method1() {
		System.out.println("parent method1()!!");
	}
	
	//protected : ��ӹ��� �ڽİ� ���� ��Ű������ ��밡�� 
	protected void method2() {
		
		System.out.println("parent_method2()!!");
	}
	
	//�������̵� - �θ� ������ �ִ� �޼ұ� �ڽ��ʿ��� �������Ͽ�
	//�ڽ��� ��ü �ۿ��� �����ǵ� �޼ҵ带ȣ���ϴ°�
	//1.�ݵ�� �������ϰ� �ִºθ� �޼ҵ��� ����ο� ��ġ�ؾ��� 
	//2. ���������ڴ� ���� �Ұ��� : ������ ���� ���������� ���ϰ� ������ �Ұ��ϰ� �� �ݴ�� �����ϴ� 
	
	@Override // ������̼� : �����Ϸ����� �Ʒ� �޼ҵ尡 ������ ������� �˷��� �˷��� 
	public void  gMethod() {
		super.gMethod(); // �����p�Ǳ��� �θ� ������ �ִ� �޼ҵ带 ȣ���ϴ°�
		System.out.println("method override");
	}
	
}

