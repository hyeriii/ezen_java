package ch08_1;

public interface ListBoard {

	//추상메소드 정의
	//사이즈
	public int size();
	//특정 인덱스 원소
	public Object get(int i) ;
	//전체목록리스트
	public Object[] all();
	
}
