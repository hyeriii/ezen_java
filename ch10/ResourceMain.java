package ch10;

public class ResourceMain {

	public static void main(String[] args) {
		//자동 리소스 닫기 기능 구현 
		try(FileInputStream file = new FileInputStream()) {
		
		
		//file 내용 읽어들이는 부분...
		
		//file.close();    -> try catch를 이용하지 않으며 해당 리소스를 개발자가 직접 종료해줘야 한다.
		}catch(Exception e) {
			System.out.println("예외 발생 ");
		}
		//리소스 객체는 데이터에 입출력에 관여하는 객체를 의미하면 해당 객테는 사용이 완료된 후 close를 호출해야한다.
		//이때 try() 안쪽에서 리소스 객체를 생성해주며 try- catch 블럭이 종료된 후 자동으로 close를 호출해주고 이때
		//반드시 해당 리소스 객체는  AutoCloseable 인터페이스의 구현 클래스여야한다.
		
		}
		

}
