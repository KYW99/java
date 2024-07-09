package sub4;

public class Account {
	
	//속성
	protected String bank;
	protected String name;
	protected String acc;
	protected int balance;
	
	//생성자
	public Account(String bank, String acc, String name, int balance ) {
		
		this.bank = bank;
		this.name = name;
		this.acc = acc;
		this.balance = balance;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getBank() {
		return bank;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	//기능
	public void withdraw(int money) {
		this.balance -= money;
	}
	
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void show() {
		System.out.println("--------------------");
		System.out.println("은행명 : " +this.bank);
		System.out.println("계좌번호 : " +this.acc);
		System.out.println("입금주 : " +this.name);
		System.out.println("현재잔액 : " +this.balance);
		System.out.println("--------------------");

	}

}
