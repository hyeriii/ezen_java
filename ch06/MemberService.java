package ch06;

public class MemberService {
	//210712
	//6�� Ȯ�ι��� 15
	public boolean login(String id, String password) {
		
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}
		return false;
		
	}
	
	public void logout(String id) {
		
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
	
	
	
}
