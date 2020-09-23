package search;

public class ArraySearch {

	public static void main(String[] args) {
		
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
		System.out.println("\nSearching for prime numbers:");
		
		for(int i = 0; i<array1.length;i++) {
			//loop from 2 to half the value of i
			boolean isPrime = true;
			for(int j = 2; j< array1[i];j++){
				if (array1[i]%j == 0) {
					isPrime = false;
					break;
				}
			}
			//if it's prime and not 1
			if (isPrime && (array1[i] != 1)) {
				System.out.print(array1[i]+" ");
			}
		}
		
		//search for palindromes
		System.out.println("\nSearching for palindromes:");
		int array2[] = {123,323,43534,11781,99091,101,987,5559555,9087};
		
		for(int i = 0; i<array2.length;i++) {
			int remainder, sum = 0;
			int n = array2[i];
			//reverse the number
			while (n>0) {
				remainder=n%10;
				sum = (sum*10)+ remainder;
				n = n/10;
			}
			//if reverse number = original number -> Palindrome
			if(sum == array2[i])
				System.out.print(array2[i]+" ");
		}
		
	}

}
