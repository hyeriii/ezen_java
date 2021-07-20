package ch11;

import java.util.Date;

public class ObjectMain {

	public static void main(String[] args) {
		NewClass newclass = new NewClass();
		
		//Object Ŭ������ ��� Ŭ������ �ֻ��� Ŭ�����̹Ƿ� �ڵ�����ȯ�� �Ǵ�.
		Object obj = newclass;
		
		//�θ� ��ü�� �ڽ� ��ü�� ������ؼ��� ���� ����ȯ�� �ʿ��ϴ�.
		newclass = (NewClass)obj;
		
		newclass.method();
		
		
		boolean result = obj.equals(newclass);

		
		System.out.println(result);
		
		NewClass newclass2 = new NewClass();
		newclass2.field = 20;
		
		if(newclass2.equals(newclass)) {
			System.out.println("�����ϰ� �ִ� �ʵ尪�� ����");
		}else {
			System.out.println("�����ϰ� �ִ� �ʵ尪�� �ٸ���.");
		}
		
		//******************************************************************
		if(newclass2.equals(obj)) {
			System.out.println("�� ��ü�� �������� �����ϴ�.");
		}else {
			System.out.println("�� ��ü�� �������� �ٸ��ϴ�.");
		}
		
		//******************************************************************
		//hashCode() - obj�� ������ �ּҰ��� ������ ��ȯ�ؼ� ���
		//******************************************************************
		System.out.println(obj.hashCode());
		System.out.println(newclass.hashCode());
		
		//******************************************************************
		//toString() 
		//******************************************************************
		System.out.println(obj.toString());
		System.out.println(newclass.toString());
		
		
		//toString() Ȯ�� 
		EntityCalss e1 = new EntityCalss(10,20,"a","b",true);
		System.out.println(e1.toString());
		
		Date today = new Date(); // ��ü�� �����Ǵ� ������ �ð������� ���� ��ü 
		System.out.println(today.toString());
		
	
		
		
	}

}
