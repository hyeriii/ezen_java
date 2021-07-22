package ch13;

public class BoxMain {

	public static void main(String[] args) {

		/*
		Box box = new Box();
		
		box.setObj(new Product());

		System.out.println(box.getObj().toString());
		
		Product p = (Product)box.getObj();
		
		box.setObj("안녕하세요");
		
		p =  (Product) box.getObj();
		*/
		
		//**************************
		//제네릭 
		//- 클래스 또는 인터페이스 선언시 타입을 결정하지 않고 해당 클래스 또는 인터페이스를 이용해서
		//  변수 또는 객체가 생성되는 시점에 사용할 타입을 결정하여 불필요한 형변환을 
		//  제거하고 강력한 컴파일을 하는 방법!
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
