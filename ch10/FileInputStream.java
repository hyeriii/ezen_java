package ch10;

public class FileInputStream implements AutoCloseable {

	@Override
	public void close() throws Exception{
		System.out.println("리소스 닫힘");
		//int num = 10/0; //예외 무조건 발생 
	}
	
	
}
