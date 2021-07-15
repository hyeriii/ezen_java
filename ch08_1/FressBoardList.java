package ch08_1;

public class FressBoardList implements ListBoard{

	private FreeBoard[] list;
	
	public FressBoardList(FreeBoard[] list) {
		this.list = list;
	}
	
	/*
	//목록 길이 반환
	public int FressBoardSize() {
		return list.length;
	}
	//특정 원소값 반환
	public FreeBoard get(int i) {
		return list[i];
	}
	//전체 목록 반환 
	/*public FreeBoard set () {
		
	}*/
	
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
