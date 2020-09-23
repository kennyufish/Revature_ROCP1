package arithmetic;

public class ArithmeticDemo {
	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		
		//addtion + assignment
		double z = x + y;
		System.out.println("Addition: "+z);
		
		//subtraction
		z = x - y;
		System.out.println("Subtration: "+z);
		
		//multiplication
		z = x * y;
		System.out.println("Mulitiplication: "+z);
		
		//division
		z = x / y;
		System.out.println("Division: "+z);
		
		//Modulus
		z = x % y;
		System.out.println("Modulus: "+z);
		
		//Increment
		z++;
		System.out.println("Increment: "+z);
		
		//Decrement
		z--;
		System.out.println("Addition: "+z);
		
		//list of assignment
		z = 10; //z = 10
		z += 1; //z = z + 1
		z -= 1; //z = z - 1
		z *= 1; //z = z * 1
		z /= 1; //z = z / 1
		z %= 1; //z = z % 1
		
	}
}
