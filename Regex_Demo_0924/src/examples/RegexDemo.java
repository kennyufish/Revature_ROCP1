package examples;

public class RegexDemo {
	public static void main(String[] args) {
		System.out.println("Regex Demo :");
		System.out.println("------------\n");
		System.out.println("Testing for SSN Validation:");
		System.out.println(isValidSSN("123-23-1231"));
		System.out.println("Testing for CA DL Validation:");
		System.out.println(isValidDL("Y1234567"));
		System.out.println("Testing for Area Zip Code Validation");
		System.out.println(isValidAreaZipCode("91381"));
		System.out.println("Testing for CA Lisence Plate Validation");
		System.out.println(isValidLisencePlate("6TKR123"));
	}
	
	public static boolean isValidSSN(String ssn) {
		if (ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}")) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isValidDL(String dl) {
		if (dl.matches("[A-Za-z]{1}[0-9]{7}")) { //CA DL format
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isValidAreaZipCode(String azc) {
		if (azc.matches("[0-9]{5}")) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isValidLisencePlate(String lp) {
		if (lp.matches("[0-9A-Z]{7}")) {
			return true;
		}else {
			return false;
		}
	}
}
