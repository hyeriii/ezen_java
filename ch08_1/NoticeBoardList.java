package ch08_1;

public class NoticeBoardList implements ListBoard  {
	private NoticeBoard[] list;
	
	NoticeBoardList(NoticeBoard[] list){
		this.list = list;
	}
	
	/*
		//��� ���� ��ȯ
		public int NoticeBoardSize() {
			return list.length;
		}
		//Ư�� ���Ұ� ��ȯ
		public NoticeBoard getNotice(int i) {
			return list[i];
		}
		//��ü ��� ��ȯ 
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
