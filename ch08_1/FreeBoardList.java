package ch08_1;

public class FreeBoardList implements ListBoard {
	private FreeBoard[] list;
	
	public FreeBoardList(FreeBoard[] list) {
		this.list = list;
	}
	public int size() {
		return list.length;
	}
	
	public Object get(int i) {
		return list[i];
	}
	
	public Object[] all() {
		return list;
	}
}
