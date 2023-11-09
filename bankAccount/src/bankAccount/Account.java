package bankAccount;
<<<<<<< HEAD
import java.util.Scanner;

class BankAccount {
    int acNo;
    String acName, acPhone, acEmail;
    double AcBal;

    public BankAccount(int acNo, String acName, String acPhone, String acEmail, double AcBal) {
        this.acNo = acNo;
        this.acName = acName;
        this.acPhone = acPhone;
        this.acEmail = acEmail;
        this.AcBal = AcBal;
    }

    public void accountholder() {
        System.out.println("Account Number :" + acNo);
        System.out.println("Account Holder Name :" + acName);
        System.out.println("Account Holder Address :" + acEmail);
        System.out.println("Account Holder Phone :" + acPhone);
        System.out.println("Account Holder Balance :" + AcBal);
    }
}

class SavingsAccount extends BankAccount {
    public void print() {
        System.out.println("SAVINGS ACCOUNT DETAILS");
    }

    public SavingsAccount(int acNo, String acName, String acPhone, double AcBal) {
        super(acNo, acName, acPhone, "", AcBal);
    }

    public void deposit(double amount) {
        amount += 0.02 * amount;
        AcBal += amount;
        System.out.println("Bonus:" + (0.02 * amount));
        System.out.println("Deposited: $" + amount);
    }

    public void displayBalance() {
        System.out.println("Account Number: " + acNo + "\tBalance: $" + AcBal);
    }

    public void withdrawal(double amount) {
        AcBal -= amount + (0.4 * amount);
    }

    public void transferToCurrent(CurrentAccount current, double amount) {
        if (AcBal >= amount) {
            withdrawal(amount);
            current.deposit(amount);
            System.out.println("Transferred $" + amount + " from Savings to Current Account.");
        } else {
            System.out.println("Insufficient funds in Savings Account. Transfer failed.");
        }
    }
}

class CurrentAccount extends BankAccount {
    public void print() {
        System.out.println(" ");
        System.out.println("CURRENT ACCOUNT DETAILS");
    }

    public CurrentAccount(int acNo, String acName, String acPhone, String acEmail, double AcBal) {
        super(acNo, acName, acPhone, acEmail, AcBal);
    }

    public void deposit(double amount) {
        AcBal += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void displayBalance() {
        System.out.println("Account Number: " + acNo + "\tBalance: $" + AcBal);
    }

    public void withdrawal(double amount) {
        AcBal -= amount + (0.25 * amount);
    }

    public void transferToSavings(SavingsAccount savings, double amount) {
        if (AcBal >= amount) {
            withdrawal(amount);
            savings.deposit(amount);
            System.out.println("Transferred $" + amount + " from Current to Savings Account.");
        } else {
            System.out.println("Insufficient funds in Current Account. Transfer failed.");
        }
    }
}

public class Account {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Set a password for login
        String password = "securePassword";

        // Get user input for password
        System.out.println("Enter your password:");
        String userInput = scanner.nextLine();

        // Check if password is correct
        if (userInput.equals(password)) {
            // Password is correct, proceed with account operations
            SavingsAccount sac = new SavingsAccount(1001, "Ann Kamau", "07200000", 1000);
            sac.print();
            sac.accountholder();
            sac.deposit(500);
            sac.displayBalance();

            CurrentAccount current = new CurrentAccount(1001, "Peter Smith", "08100000", "admin@gmail.com", 0.0);
            current.print();
            current.accountholder();
            current.deposit(300);
            current.displayBalance();

            // Transfer funds between accounts
            sac.transferToCurrent(current, 200);
            sac.displayBalance();
            current.displayBalance();
        } else {
            // Password is incorrect, deny access
            System.out.println("Access denied. Incorrect password.");
        }

        // Close the scanner
        scanner.close();
    }
}
=======
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

>>>>>>> e9a230dc83147b1fd0af5d3e54f54a1dc05e2b83
