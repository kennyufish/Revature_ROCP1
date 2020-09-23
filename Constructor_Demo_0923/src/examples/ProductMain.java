package examples;

public class ProductMain {
	public static void main(String[] args) {
		System.out.println("Testing for Product Class:");
		
		Product p1=new Product(100, "Apple", 8.9, 1.50);
		System.out.println(p1);
		Product p2=new Product(101, "Cereal", 7.1, 10.5);
		System.out.println(p2);
		Product p3=new Product(102, "Milk", 9.2, 2.99);
		System.out.println(p3);
	}
}
