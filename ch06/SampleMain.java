package ch06;

public class SampleMain {

	public static void main(String[] args) {
		//210709
		//new�����ڴ� Ŭ�����̸�() ���� �� �����ڸ� ȣ���Ͽ� Ŭ���� �̸����� �� Ŭ������ �̿��Ͽ� ���� ��ü�� �����ϰ�
		//�׿� ���� �ּҰ��� new�� ȣ���� ��ġ�� ������ 
		
		//������ ��ü�� ���� Ŭ���� ������ ������ Ÿ���� �ݵ�� ������ ��ü�� Ŭ������ ���ƾ� �Ѵ�.
		
		Sample sample = new Sample();
		
		System.out.println(sample);
		
		//�ܺο��� ������ ��ü�� �ʵ忡 �����ϴ� ���
		//name�� ���
		System.out.println(sample.name);
		System.out.println(sample.number);
		
		sample.number = 10;
		System.out.println(sample.number);
		
		Sample_a sa= new Sample_a(10);
		
		//�����Ϸ��� �ҽ����Ͽ� �ϳ��̻��� �����ڰ� �����ϴ� ���
		//�⺻�����ڸ� ���������� �ʴ´�. 
		//Sample_a sa2= new Sample_a();
	
		System.out.println("sa�� filed��"+sa.filed1);
	
		A ex = new A("A", "B", 10);
	
		System.out.println("AŬ������ �ʵ尩 >"+ ex.title + ", "+ex.writer+ ", "+ex.type+ ","+ ex.hit);
	
	
		//�����ε� Ȯ��
		Test test1= new Test();
		
		//�ش� �����ڰ� ������� �����Ƿ� ������ ���� �߻���
		//Test test2= new Test("��", 10, true);
	
		//method EX
		A a = new A("tite","writer",10);
		
		a.method1();
		
		int result = a.method2();
		System.out.println(result);
		
		//A��  sum �޼ҵ� ����
		int result2 = a.sum(1,10);
		System.out.println("1~10������ �� : "+result2);
		
	}

}
