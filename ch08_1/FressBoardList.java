package ch08_1;

public class FressBoardList implements ListBoard{

	private FreeBoard[] list;
	
	public FressBoardList(FreeBoard[] list) {
		this.list = list;
	}
	
	/*
	//��� ���� ��ȯ
	public int FressBoardSize() {
		return list.length;
	}
	//Ư�� ���Ұ� ��ȯ
	public FreeBoard get(int i) {
		return list[i];
	}
	//��ü ��� ��ȯ 
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
