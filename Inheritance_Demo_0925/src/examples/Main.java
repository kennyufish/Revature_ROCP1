package examples;

public class Main {

	public static void main(String[] args) {
//		Person person=new Person(100, "Sachin");
//		System.out.println(person);
//		
//		Address a=new Address(188888, "XYZ Street Name", "San Fan", "Kansas", 1222222);
//		Employee employee=new Employee(102, "Raj", "Manager", 123344.44d);
//		employee.setPermenantAddress(a);
//		System.out.println(employee);
//		
//		Player player=new Player(900, "Chris Morris", 100, "Cricket");
//		System.out.println(player);
		
		//Employee Class Test
		System.out.println("Testing for Employee Class:");
		Project p1 = new Project(123, "UltraSonic Car", "Tesla", 10000000);
		Address a1 = new Address(456, "3678 Atlantic Blvd", "Alhambra", "CA", 91876);
		Address a2 = new Address(456, "298 SpaceY", "SF", "CA", 91079);
		Employee e1=new Employee(100, "Kenny", "Developer", 100000.99);
		e1.setCurrentProject(p1);
		e1.setPermenantAddress(a1);
		e1.setPresentAddress(a2);
		System.out.println(e1);
		
		//Player Class Test
		System.out.println("\nTesting for Player Class:");
		Team t1= new Team(102, "BestBasketball", "Coach P");
		Player player = new Player(112, "Denny", 8.9, "Basketball");
		player.setTeam(t1);
		System.out.println(player);
	}

}
