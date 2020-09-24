package examples;

public class StringBufferDemo {

	public static void main(String[] args) {
		String s ="hello hi how are you doing today";
		String ar[] = s.split(" ");
		
		StringBuilder sb= new StringBuilder();
		
		
		//last char to uppercase
		for(int i = 0; i<ar.length;i++) {
			sb.append(ar[i].substring(0, ar[i].length()-1)).append(Character.toUpperCase(ar[i].charAt(ar[i].length()-1))).append(" ");
		}
			
		System.out.println(sb.toString().trim());
	}

}
