package bitwise;

public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		int y = 3;
		
		//AND &
		//0001 & 0011 = 0001
		System.out.println("x&y = "+ (x&y));
		//OR |
		//0001 | 0011 = 0011
		System.out.println("x|y = "+ (x|y));
		//XOR ^
		//0001 ^ 0011 = 0010
		System.out.println("x^y = "+ (x^y));
		//NOT ~
		//~0001 = 1110
		System.out.println("~x = "+ ~x);
		//Left shift <<
		//0001 << 1 = 0010
		System.out.println("x<<1 = " + (x<<1));
		//right shift >>
		//0001 >> 1 = 0000
		System.out.println("x>>1 = "+ (x>>1));
		//>>> zero fill right shift
		//0001 >> 1 = 0000
		System.out.println("x>>>1 =" +(x>>>1));
		
	}

}
