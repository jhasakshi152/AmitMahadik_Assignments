import java.util.Scanner;
class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String s) {
		super(s);
	}
}
class IllegalBankTransactionException extends Exception{
	public IllegalBankTransactionException(String s) {
		super(s);
	}
}
public class ExceptionQ3 {
	long id;
	private double balance=5000;
	public ExceptionQ3(long ID)
	{
		this.id=ID;
	}
	double withdraw(double amount) throws InsufficientBalanceException,IllegalBankTransactionException{
		try {
			if(amount>balance || balance==0)
			{
				throw new InsufficientBalanceException("You can't withdraw more than the amount present in your account");
			}
			else if(amount<0)
			{
				throw new IllegalBankTransactionException("You can't withdraw negative amount");
			}
			balance=balance-amount;
		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
		}
		return balance;
	}
	public double deposit(double amount) {
		balance+=amount;
		return balance;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you want to deposit or withdraw(deposit/withdraw): ");
		String opt=sc.next();
		if(opt.equals("deposit"))
		{
			System.out.print("Enter your ID: ");
			long id=sc.nextLong();
			System.out.print("Enter Deposit amount");
			double amount=sc.nextDouble();
			ExceptionQ3 SA=new ExceptionQ3(id);
			System.out.print("Total balance is: "+SA.deposit(amount));
		}
		else if(opt.equals("withdraw"))
		{
			System.out.print("Enter your ID: ");
			long id=sc.nextLong();
			System.out.print("Enter withdraw amount");
			double amount=sc.nextDouble();
			ExceptionQ3 SA=new ExceptionQ3(id);
			try {
				System.out.println("Total balance is: "+SA.withdraw(amount));
			} catch (InsufficientBalanceException e) {
				System.out.println(e.getMessage());
			} catch (IllegalBankTransactionException e) {
				System.out.println(e.getMessage());
			}
			finally {
				sc.close();
			}
		}
		
		
		
	}

}