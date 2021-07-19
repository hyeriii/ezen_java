package mission;

public class Account {

	private String ano ;
	private int balance;
	
	public Account(String ano, int balance) {
		this.ano = ano;
		this.balance = balance;
	}
	
	public void setAno (String ano) {
		this.ano = ano;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getAno() {
		return ano;
	}
	public int getBalance() {
		return balance;
	}
}
