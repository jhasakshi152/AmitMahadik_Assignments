import java.util.HashSet;
import java.util.Set;
class Employee{
	private int empid;
	private String name;
	private double salary;
	private String department;
	public Employee(int empid, String name, double salary, String department) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	public int getEmpid() {
		return empid;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void displayDetails() {
		System.out.println("Employee ID "+empid);
		System.out.println("Employee Name "+name);
		System.out.println("Employee Salary "+salary);
		System.out.println("Department "+department);
	}
	
}
public class GenericsQ1 {
	public static void main(String[] args) {
		Set<Employee> emp=new HashSet<>();
		emp.add(new Employee(1111, "John",900000,"SDE"));
		
		for(Employee e : emp){
		    e.displayDetails();
		    System.out.print("\n");
		}
		
		
	}

}