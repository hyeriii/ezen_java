package ch11;

//Object�� ��� ������ ������ �ʾƵ� �ڵ����� ��ӵǴ� Ŭ�����̴�.
public class NewClass {
	public int field = 0;
	public void method() {
		System.out.println("NewClass �޼ҵ�");
	}
	
	
	//Object Ŭ������ ������ equals �޼ҵ� ������ ��ü�� ������ ����� �ּҰ��� �������� ���ϴ� ����
	@Override
	public boolean equals(Object obj) {
		//���� ����񱳶�? �� ��ü���� ���� �����ϰ� �ִ� �����Ͱ� �������� ���ϴ°��� �ǹ���
		//Object Ŭ������ equals �޼ҵ带 �������Ͽ� ����Ѵ�. 
		boolean result = false;
	
		if(obj instanceof NewClass) {
			NewClass nObj = (NewClass)obj;
			
			if(this.field == nObj.field) {
				result = true;
			}
		}
		
		return result;
	}
	
	
	
	
	
			
}
