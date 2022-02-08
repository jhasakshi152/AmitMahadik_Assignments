public class StringQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Java String pool refers to collection of "
				+ "Strings which are stored in heap memory.";
		
		System.out.println("The string is: "+ str);
		System.out.println("1. Lowercase: "+ str.toLowerCase());
		System.out.println("2. Uppercase: "+ str.toUpperCase());
		System.out.println("3. Replace 'a' with '$': "+ str.replace('a', '$'));
		System.out.println("4. Contains collection?: "+ str.contains("collection"));
		
		String num = "java string pool refers to collection of "
				+ "strings which are stored in heap memory.";
		
		System.out.println("5. Matching original string with the new: " + str.equals(num));
		System.out.println("6. Not matching: "+ str.equalsIgnoreCase(num));
	}

}