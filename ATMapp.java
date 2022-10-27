package atm;

import java.util.HashMap;
import java.util.Scanner;

public class BankingApp {
	static Scanner scanner = new Scanner(System.in);
	static DataBase dataBase = new DataBase();
	static HashMap<Long, Account> dataset = dataBase.createDataSet();
	static Account account1;
	static Account account2;
	public static void main(String[] args) {
		//the ATM machine is supposed to read the card number by itself
		//but for coding reasons we write the number in the console
		System.out.println("Enter your card number: ");
		long CardNumber = scanner.nextLong();
		if (dataset.containsKey(CardNumber)) {
			System.out.println("Please enter your password!!!");
			int password = scanner.nextInt();
			int i = 0;
			while (i < 4) {
				if (dataset.get(CardNumber).getPass() == password) {
					System.out.println("Wellcome");
					i = 4;
					account1 = dataset.get(CardNumber);
					atmSercive();
				} else {
					System.err.println("WRONG PASSWORD!!");
					System.out.println("Please try again.");
					i++;
					System.err.println("Login failed.Attempt " + i + " of 4");
					if (i < 4) {
						password = scanner.nextInt();
					} else {
						System.err.println("Your Card has been blocked!");
					}
				}
			}
		}
		else {
			System.err.println("WRONG CARD NUMBER!!");
		}
	}

	public static void atmSercive() 
	{
		System.out.println("Next transaction: ");
		String T1 = scanner.next();

		while (T1.equals("EXIT") == false) {
			System.out.println("Please enter the amount of money you want to " + T1+": ");
			int value;
			Transaction transaction1 = new Transaction(account1);
			switch (T1) {
			case "DEPOSIT":
				value = scanner.nextInt();
				if (value >= 0) {
					scanner.nextLine();
					System.out.println("Balance of account1 before deposite:" + account1.getBalance());
					transaction1.deposit(value);
					System.out.println("Balance of account1 after deposite:" + account1.getBalance());
				} else {
					System.err.println("Invalid value!!! Negativ value!!!");

					scanner.nextLine();
				}
				break;
			case "WITHDRAW":
				value = scanner.nextInt();
				if (value >= 0) {
					scanner.nextLine();
					if (account1.getBalance() >= value) {
						System.out.println("Balance of account1 before withdraw:" + account1.getBalance());
						transaction1.withDraw(value);
						System.out.println("Balance of account1 after withdraw:" + account1.getBalance());
					} else {
						System.out.println("Your transaction cant be processed!!!! ");
						System.err.println(
								"ERROR!!!!!! \nThe amount of money you want to withdraw is greater than your banalce!!!");
						System.out.println("Your balance is : " + account1.getBalance());
					}
				} else
					System.err.println("Invalid value!!! Negativ value!!!");
				break;
			case "BALANCE":
				System.out.println("you account balance is: " + account1.getBalance());
				break;
			case "SEND_MONEY":
				value = scanner.nextInt();
				if (value >= 0) {
					scanner.nextLine();
					if (account1.getBalance() >= value) {
						System.out.println("To account: ");
						long account2CardNumber = scanner.nextInt();
						account2 = dataset.get(account2CardNumber);
						System.out.println("Balance of account1 before sending money:" + account1.getBalance());
						System.out.println("Balance of account2 before receiving money:" + account2.getBalance());
						transaction1.sendMoney(account1, account2, value);
						System.out.println("Balance of account1 after sending money:" + account1.getBalance());
						System.out.println("Balance of account2 before receiving money:" + account2.getBalance());
					} else {
						System.out.println("Your transaction cant be processed!!!! ");
						System.err.println(
								"ERROR!!!!!! \nThe amount of money you want to send is greater than your banalce!!!");
						System.out.println("Your balance is : " + account1.getBalance());
					}
					break;
				}
			default:
				System.err.println("Invalid transaction!");
			}
			System.out.println("Next transaction: ");
			T1 = scanner.next();
		}
		System.out.println("Thanks for banking with us!!!");
		scanner.close();
	}
}
