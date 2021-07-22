package ch13;

public class SampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample<Child> s1 = new Sample<>();
		Sample<Parent> s2 = new Sample<>();
		//Sample<String> s3 = new Sample<>();
		Sample<Child2> s4 = new Sample<>();
		
		Sample<Child> sample =  new Sample<>(); 
		sample.method(new Box<Product>());
		sample.method(new Box<String>());
		sample.method(new Box<Parent>());
		
		//sample.method2(new Box<Parent>());
		sample.method2(new Box<Child>());
		sample.method2(new Box<Child2>());
		
		//sample.method3(new Box<Child2>());
		sample.method3(new Box<Child>());
		sample.method3(new Box<Parent>());
		sample.method3(new Box<>()); // 비워두면 Object임 
		
	}

}
