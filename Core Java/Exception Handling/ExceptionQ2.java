import java.util.Scanner;
public class ExceptionQ2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=sc.nextInt();
		System.out.println("Enter value of b");
		int b=sc.nextInt();
		
		try {
			
		if(b==0)
		{
			throw new UnsupportedOperationException();
		}
		double c=a/b;
		System.out.println(c);
		}
		catch(UnsupportedOperationException e) 
		{
			System.out.println("cant divide by zero");
		}
		
		{
			System.out.println("enter new number:");
			int d=sc.nextInt();
			System.out.println(a/d);
		}
		}	
	}