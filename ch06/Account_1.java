package ch06;

public class Account_1 {

	//210714 6장 확인문제 20번
	private String ano;
	private String owner;
	private int balance;
	
	public Account_1(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner= owner;
		this.balance =balance;
		
	}
	
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano =ano;
	}
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner =owner;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance =balance;
	}
	
	
	
	
	
	
	
}
