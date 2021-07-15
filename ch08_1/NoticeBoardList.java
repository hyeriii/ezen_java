package ch08_1;

public class NoticeBoardList implements ListBoard  {
	private NoticeBoard[] list;
	
	NoticeBoardList(NoticeBoard[] list){
		this.list = list;
	}
	
	/*
		//목록 길이 반환
		public int NoticeBoardSize() {
			return list.length;
		}
		//특정 원소값 반환
		public NoticeBoard getNotice(int i) {
			return list[i];
		}
		//전체 목록 반환 
		public NoticeBoard[] allList() {
			return list;
		}
	*/
	
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
