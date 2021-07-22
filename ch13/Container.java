package ch13;

public class Container<T, V> {

	private T a;
	private V b;

	public void set(T a, V b) {
		this.a = a;
		this.b =b;
	}
	
	public T getKey() {
		return a;
	}
	
	public V getValue() {
		return b;
	}
	
}
