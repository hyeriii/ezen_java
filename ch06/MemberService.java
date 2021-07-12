package ch06;

public class MemberService {
	//210712
	//6장 확인문제 15
	public boolean login(String id, String password) {
		
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}
		return false;
		
	}
	
	public void logout(String id) {
		
		System.out.println("로그아웃 되었습니다.");
	}
	
	
	
}
