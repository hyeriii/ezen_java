package ch10;

public class FileInputStream implements AutoCloseable {

	@Override
	public void close() throws Exception{
		System.out.println("���ҽ� ����");
		//int num = 10/0; //���� ������ �߻� 
	}
	
	
}
