package ch13;

public class Sample<T extends Parent> {

	//<T extends ClassName > ���� extends�� ������ 
	//Ÿ�� �Ķ���ͷ� ���� �� �ִ� Ÿ���� ������ �� ���
	//�ش� ClassName Ÿ������ ���� �����Ǿ� �ִ� Ÿ�Ը� �Ķ���ͷ� ���� �� �� �ִ� 
	
	
	//���ϵ� ī�� 
	//�Ű������� Ÿ�� �Ķ���͸� ����ϴ� ��ü�� ������ 
	//�Ű������� �� �� �ִ� Ÿ�� �Ķ������ ������ �ǹ��� 
	public void method(Box<?> box) {
		//? - ��� Ÿ������ ������ box�� �ްڴ�
		
		box.getObj();
		
	}
	
	public void method2(Box< ? extends Child> box) {
		//? extends ClassName -> ClassName ���� ������ ������ ��ü���� ���� �� ���� 
	}
	
	public void method3(Box<? super Child> box) {
		//? super ClassName - > ClassName ���� ���� Ÿ������ ������ ��ü�� �Ű�����������
		//������ ��ü�� �Ű������� ���� �� �ִ�. 
	}
	
	
	
	
	
	
	
	
	
} 
