package ch13;

public class Product<K, V>{
	private K kind;
	private V model;
	
	public void setKind(K kind) {
		this.kind = kind ;
	}

	public K getKind() {
		return kind;
	}
	
	public void setModel(V model) {
		this.model= model;
	}
	
	public V getModel() {
		return model;
	}
	
}
