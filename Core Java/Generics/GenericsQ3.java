public class GenericsQ3 {
	public static <T> void swapping(T[] arr,int x,int y)
	{
		T temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	 public static void main (String args[]) {
		 Integer arr[]= {7,1,6,4,8};
		 swapping(arr, 0, 4);
		 for (Integer i : arr) {
			 System.out.println(i);
		}
		
		 
	 }

}
