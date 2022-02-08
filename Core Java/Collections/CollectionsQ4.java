import java.util.*; 
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CollectionsQ4{  
	public static void main(String args[]){
	 
		DateTimeFormatter a = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	 
		LocalDate d1 = LocalDate.of(2000, 12, 23);
		LocalDate d2 = LocalDate.of(2001, 12, 23);
		
  
		LinkedList<LocalDate> b=new LinkedList<>();  
		b.add(d1);  
		b.add(d2);  
		 
	  
	    Iterator<LocalDate> itr=b.descendingIterator();  
	    while(itr.hasNext()){ 
		    LocalDate date = itr.next();
		    System.out.print("Your date of birth is : "+date.format(a));
	   
	        if(date.isLeapYear()) {
		        System.out.println(" and it was a leap year.");
	        }
	        else {
		    System.out.println(" and it was not a leap year.");
	        }
        }  
	}
}