package atm;

public class Account {
	private String name;
	private String lastName;
	private int pass;
	private double balance;
	public Account(String name, String lastName, int pass, int balance) {
		this.name = name;
		this.lastName = lastName;
		this.pass = pass;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public String getLastName() {
		return lastName;
	}
	public int getPass() {
		return pass;
	}
	public double getBalance() {
		return balance;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
