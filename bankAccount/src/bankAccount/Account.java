package bankAccount;
class BankAccount{
	int acNo;
	String acName,acPhone,acEmail;
	double AcBal;
	public BankAccount(int acNo, String acName, String acPhone, String acEmail, double AcBal)
	{
		this.acNo=acNo;
		this.acName=acName;
		this.acPhone=acPhone;
		this.acEmail=acEmail;
		this.AcBal=AcBal;
	}
	public void accountholder()
	{
		System.out.println("Account Number :"+acNo);
		System.out.println("Account Holder Name :"+acName);
		System.out.println("Account Holder Address :"+acEmail);
		System.out.println("Account Holder Phone :"+acPhone);
		System.out.println("Account Holder Balance :"+AcBal);
	}
}
class SavingsAccount extends BankAccount {
	public void print() {
		System.out.println("SAVINGS ACCOUNT DETAILS");
	}
		public SavingsAccount(int acNo, String acName, String acPhone, String acEmail, double AcBal) {
			super(acNo, acName, acPhone,acEmail, AcBal);
		}
		public void deposit(double amount) {
			AcBal += amount;
			System.out.println("Deposited: $" + amount);
		}
		public void displayBalance() {
			System.out.println("Account Number: " + acNo+"\tBalance: $" + AcBal);
		}
	
	
}
class CurrentAccount extends BankAccount {
	public void print() {
		System.out.println(" ");
		System.out.println("CURRENT ACCOUNT DETAILS");
	}
	public CurrentAccount(int acNo, String acName, String acPhone, String acEmail, double AcBal) {
		super(acNo, acName, acPhone,acEmail, AcBal);
	}
	public void deposit(double amount) {
		AcBal += amount;
		System.out.println("Deposited: $" + amount);
	}
	public void displayBalance() {
		System.out.println("Account Number: " + acNo+"\tBalance: $" + AcBal);
	}


}

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingsAccount sac = new SavingsAccount(1001, "Ann Kamau", "07200000","test@gmail.com",1000);
		sac.print();
sac.accountholder();
sac.deposit(500);
sac.displayBalance();
CurrentAccount current = new CurrentAccount(1001, "Peter Smith", "08100000","admin@gmail.com",0.0);
current.print();
current.accountholder();
current.deposit(300);
current.displayBalance();
	}

}

