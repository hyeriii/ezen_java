package ch13;

public class BoxMain {

	public static void main(String[] args) {

		/*
		Box box = new Box();
		
		box.setObj(new Product());

		System.out.println(box.getObj().toString());
		
		Product p = (Product)box.getObj();
		
		box.setObj("�ȳ��ϼ���");
		
		p =  (Product) box.getObj();
		*/
		
		//**************************
		//���׸� 
		//- Ŭ���� �Ǵ� �������̽� ����� Ÿ���� �������� �ʰ� �ش� Ŭ���� �Ǵ� �������̽��� �̿��ؼ�
		//  ���� �Ǵ� ��ü�� �����Ǵ� ������ ����� Ÿ���� �����Ͽ� ���ʿ��� ����ȯ�� 
		//  �����ϰ� ������ �������� �ϴ� ���!
		//**************************
		Box<String> box = new Box<String>();
		//box.setObj(new Product());
		box.setObj("test");
		
		System.out.println(box.getObj());
		
		
		Box<Product> box2 = new Box<Product>();
		
		box2.setObj(new Product());
		System.out.println(box2.getObj().toString());
		
		Box box3 = new Box();
		box3.setObj(box3);
		
		
		Product<String, Integer> product =new Product<String, Integer>(); 
		
		product.setKind("kind");
		product.setModel(10);
		int model = product.getModel();
		System.out.println(product.getKind() +","+model);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
