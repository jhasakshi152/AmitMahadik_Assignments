abstract class Abstract{
	abstract public void check(); 

	public void check1() {
		System.out.println("Inside check of Abstract class");
	}
}

class Abstract2 extends Abstract{ 
	public void check() { //overriding abstract method in extended class.
		System.out.println("Overridden method of abstract class");
	}
}
public class Assignment2Q4 {

	public static void main(String[] args) {
		

		
		Abstract2 a = new Abstract2(); 
		Abstract b = new Abstract2(); 
		a.check();
		a.check1();
		b.check();
		b.check1();
	}

}