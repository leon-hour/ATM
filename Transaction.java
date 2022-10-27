package atm;

public class Transaction {
private double balance;
private Account account;
	public Transaction(Account account) {
		// TODO Auto-generated constructor stub
		this.account= account;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double value) {
		balance = account.getBalance()+value;
		account.setBalance(balance);
	}
	public void withDraw(int value) {
		balance = account.getBalance() - value;
		account.setBalance(balance);
	}
	public void sendMoney(Account accountFrom, Account accountTo,int value) {
		accountFrom.setBalance(accountFrom.getBalance()-value);
		accountTo.setBalance(accountTo.getBalance()+value);
	}

}
