import java.util.Scanner;

public class ExceptionQ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter value of a :");
		a=sc.nextInt();
		System.out.println("Enter value of b :");
		b=sc.nextInt();
		int c=0;
		try
		{
			System.out.println(c=a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		{
			
			b=sc.nextInt();
			System.out.println(c=a/b);
			
		}

	}

}