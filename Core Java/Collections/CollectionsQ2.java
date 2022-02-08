import java.util.*;
public class CollectionsQ2 {
	public static void main(String[] args) {
		Set<String> products = new TreeSet<>();

		

		products.add("Phone");
		products.add("Laptop");
		products.add("Pen");
		products.add("Copy");
		products.add("Laptop");
		products.add("Spectacles");
		products.add("Pen");
		products.add("Chair");
		products.add("Table");
		products.add("Book");
		System.out.println(products);
		System.out.println("Total: "+ products.size());
}
}