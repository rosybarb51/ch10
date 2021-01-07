package ch10;

public class Account {
	private long balance;
	
	public Account() {
		
	}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withDraw(int money) throws BalanceException {
		if (balance < money) {
//			throw : 직접 예외 발생시키는 것.
			throw new BalanceException("잔고 부족 : " + (money - balance) + " 모자람.");
		}
	}
}
