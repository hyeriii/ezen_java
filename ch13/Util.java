package ch13;

public class Util {
	public static <T>Box<T> boxing(T o){
		
		Box<T> box = new Box<T>();
		
		box.setObj(o);
		
		return box;
	}

}
