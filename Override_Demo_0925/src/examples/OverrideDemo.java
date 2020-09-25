package examples;

public class OverrideDemo {

	public static void main(String[] args) {
		
		//Employee Class Test
		System.out.println("Testing for Employee Class:");
		Project p1 = new Project(123, "UltraSonic Car", "Tesla", 10000000);
		Address a1 = new Address(456, "3678 Atlantic Blvd", "Alhambra", "CA", 91876);
		Address a2 = new Address(456, "298 SpaceY", "SF", "CA", 91079);
		
		//employee objects
		Employee e1=new Employee(100, "Kenny", "Developer", 100000.99);
		Employee e2=new Employee(100, "Jenny", "Manager", 100001.99);
		
		
		e1.setCurrentProject(p1);
		e1.setPermenantAddress(a1);
		e1.setPresentAddress(a2);
		e2.setCurrentProject(p1);
		e2.setPermenantAddress(a1);
		e2.setPresentAddress(a2);
		
		System.out.println(e1);
		System.out.println(e2);
		
		//Override Demo
		System.out.println("\nTesting for Override:");
		if(e1.equals(e2)) {
			System.out.println("Both Employees are same");
		}else {
			System.out.println("Employees are different");
		}
		
	}

}
