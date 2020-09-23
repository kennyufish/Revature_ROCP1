package conditional;

public class ConditionalOpsDemo {
	public static void main(String[] args) {
		boolean x = true;
		boolean y = false;
		boolean z = true;
		
		if ((x && y) || z) {
			System.out.println("Both x and y are true or z is true");
		}
		
		int a = 1;
		int b = 2;
		String c = (a>b) ? "a is greater than b" : "a is less than b";
		
		System.out.println(c);
		
	}
}
