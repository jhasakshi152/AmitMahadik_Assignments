import java.util.HashMap;
import java.util.Random;
public class GenericsQ2 {
	public static void main(String[] args) {
		Random rand = new Random();
		HashMap<Integer,Double> map = new HashMap<Integer,Double>();
		while(map.size()<10)
		{
			map.put(rand.nextInt(), rand.nextDouble());
		}
		
		map.forEach((key, value) -> System.out.println(key + " : " + value));
	}
}