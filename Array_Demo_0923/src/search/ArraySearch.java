package search;

public class ArraySearch {

	public static void main(String[] args) {
		//prime,odd,palindromes
		
		int array1[] = {1,2,3,4,5,6,7,8,9,10};
		int searchKey = 1;
		boolean found = false;
		
		//search for odd numbers
		System.out.println("Searching for odd numbers:");
		for(int i = 0; i <array1.length;i++) {
			if (array1[i]%2!=0) {
				System.out.print(array1[i]+" ");
			} 
		}
		
		//search for prime numbers
		
	}

}