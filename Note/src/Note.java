import java.util.Scanner;

public class Note {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Something");
		String s= sc.next();
		while(s != "\null") {
			System.out.println(s);
			s= sc.next();
		}
		System.out.println("END!");
	}
}
