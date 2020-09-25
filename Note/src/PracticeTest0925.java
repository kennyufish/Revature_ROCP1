import java.util.Scanner;

public class PracticeTest0925 {

	public static void main(String[] args) {

		//reverseWord();
		//largerNumber();
		//trimWord();
		while (true){
			oddNumber();
		}

	}
	
	public static void reverseWord() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Something");
		String s= sc.nextLine();
		String ar[] = s.split(" ");
		String s1= "";
		
		for(int i =ar.length-1;i>=0;i--) {
			s1 = s1 +" " +ar[i];
		}
		
		System.out.println(s1.trim());
	}
	
	public static void largerNumber() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number(s):");
		String s=sc.nextLine();
		String ar[]=s.split(" ");
		String s1=ar[0];
		for (int i = 0; i < ar.length; i++) {
			if (Integer.parseInt(s1) < Integer.parseInt(ar[i])){
				s1 = ar[i];
			}
		}
		System.out.println("Largest number is:"+s1);
	}
	
	public static void trimWord() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Something");
		String s= sc.nextLine();
		
		for(int i = 0; i< s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if (s.charAt(i) == s.charAt(j)) {
					s = s.substring(0, j) + s.substring(j+1);
				}
			}
		}
		System.out.println("New word:"+s);
	}
	
	
	public static void oddNumber() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number(s):");
		String s=sc.nextLine();
		String ar[]=s.split(" ");
		String s1="";
		for (int i = 0; i < ar.length; i++) {
			if(Integer.parseInt(ar[i])%2!=0) {
				s1 = s1 + " "+ ar[i];
			}
		}
		System.out.println("Odd numbers:"+s1.trim());
	}
}
