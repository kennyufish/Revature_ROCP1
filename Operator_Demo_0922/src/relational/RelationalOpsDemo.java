package relational;

public class RelationalOpsDemo {
	
	public static void main(String[] args) {
		int x = 0;
		int y = 1;
		if (x>y) {
			System.out.println("x is greater than y");
		} else if (x<y) {
			System.out.println("x is less than y");
		} else if (x==y) {
			System.out.println("x is equal to y");
		}
		
		int z = 10;
		if (z >= y) {
			System.out.println("z is greater than or equal to y");
		}else if (z <= y){
			System.out.println("z is less than or equal to y");
		}
		
		if (z != x) {
			System.out.println("z is not equal to x");
		}
	}
}
