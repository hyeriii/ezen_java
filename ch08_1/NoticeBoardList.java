package ch08_1;

public class NoticeBoardList implements ListBoard {

	private NoticeBoard[] list;
	
	public NoticeBoardList(NoticeBoard[] list){
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
