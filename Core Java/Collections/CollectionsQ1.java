import java.util.TreeMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class CollectionsQ1 extends contact {

	public static void main(String[] args) {
		contact a = new contact(5656565656L,"John","John@gmail.com",Gender.MALE);
		contact b = new contact(6363636363L,"Alisan","Alisan@gmail.com",Gender.MALE);
		contact c = new contact(7979797979L,"Robin","Robin@gmail.com",Gender.MALE);
		contact d = new contact(1515151515L,"Kenny","Kenny@gmail.com",Gender.MALE);
		contact e = new contact(3232323232L,"Baby","Baby@gmail.com",Gender.FEMALE);
		TreeMap<Long,contact> TM = new TreeMap<Long, contact>(Collections.reverseOrder());
		TM.put(a.Phonenumber, a);
		TM.put(b.Phonenumber, b);
		TM.put(c.Phonenumber, c);
		TM.put(d.Phonenumber, d);
		TM.put(e.Phonenumber, e);
		Set<Map.Entry<Long,contact>> entries= TM.entrySet();
		entries.forEach(entry ->
		{System.out.println(entry.getKey()+":"+entry.getValue());
		});
	}

}
class contact
{
	long Phonenumber;
	String Name;
	String Email;
	enum Gender{
		MALE,
		FEMALE;
	}
	public Gender gender;
	public contact()
	{
		System.out.println("Default");
	}
	public contact(long Phonenumber,String Name,String Email,Gender gender)
	{
		this.Phonenumber=Phonenumber;
		this.Name=Name;
		this.Email=Email;
		this.gender=gender;
	}
	public String toString()
	{
		return "["+this.Name+","+this.Email+","+this.gender+"]";
	}
	
}