package ch06;

public class Account {

	//6장 확인문제 19번 
	int balance = 0;
	static final int MAX_BALANCE = 1000000;
	static final int MIN_BALANCE = 0 ;
	
	public void setBalance(int balance) {
		
		if (balance < MAX_BALANCE && balance > MIN_BALANCE) {
			this.balance += balance;
		}else {
			balance = this.balance; 
		}
		
	}
	
	public int getBalance() {
		return balance;
	}
}
