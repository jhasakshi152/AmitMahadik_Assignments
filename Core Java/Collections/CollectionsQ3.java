import java.util.Scanner;
import java.util.TreeSet;
import java.util.Collections;

class Employee implements Comparable<Employee>
{
	int ID;
	String Name;
	String Department;
	double Salary;
	public Employee()
	{
		
	}
	public Employee(int ID,String Name,String Department,double Salary)
	{
		this.ID=ID;
		this.Name=Name;
		this.Department=Department;
		this.Salary=Salary;
	}
	public int compareTo(Employee e)
    {
        if (ID >e.ID) {
            return 1;
        }
        else if (ID < e.ID) {
            return -1;
        }
        else {
            return 0;
        }
    }

}
public class CollectionsQ3 {
	public static void main(String args[])
	{
		Employee e1= new Employee(20,"John","HR",650000);
		Employee e2= new Employee(32,"Shivani","Marketing",800000);
		Employee e3= new Employee(12,"Rocky","Design",500000);
		Employee e4= new Employee(56,"Bruno","Sales",850000);
		Employee e5= new Employee(82,"Jiya","Finance",950000);
		Employee e6= new Employee(21,"Karan","Production",820000);
		Employee e7= new Employee(54,"Hema","Law",950000);
		Employee e8= new Employee(30,"Kenny","Business",320000);
		Employee e9= new Employee(41,"Naina","Accounting",870000);
		Employee e10= new Employee(06,"Clein","Operations",7900000);
		 Scanner sc = new Scanner(System.in);
		 System.out.println("a) ID"+"\n"+"b) Name"+"\n"+"c) Department"+"\n"+"d) Salary"+"\n");
		 System.out.println("Press Option: ");
		 String Choice;
		 Choice=sc.nextLine();
		 TreeSet<Employee> xy = new TreeSet<Employee>(Collections.reverseOrder());
		 xy.add(e1);
		 xy.add(e2);
		 xy.add(e3);
		 xy.add(e4);
		 xy.add(e5);
		 xy.add(e6);
		 xy.add(e7);
		 xy.add(e8);
		 xy.add(e9);
		 xy.add(e10);
		 if (Choice.equalsIgnoreCase("a"))
		 {
			 for(Employee e: xy)
			 {
				 System.out.println(e.ID);
			 }
		 }
		 else if (Choice.equalsIgnoreCase("b"))
		 {
			 for(Employee e: xy)
			 {
				 System.out.println(e.Name);
			 }
		 }
		 else if (Choice.equalsIgnoreCase("c"))
		 {
			 for(Employee e: xy)
			 {
				 System.out.println(e.Department);
			 }
		 }
		 else if (Choice.equalsIgnoreCase("d"))
		 {
			 for(Employee e: xy)
			 {
				 System.out.println(e.Salary);
			 }
		 }
		 
		 
	}

}
