package examples;

//Employee is-A person
public class Employee extends Person{
	//add has-A relationship Project-pid,name,clientname,cost
	private String designation; //has-A
	private double salary;//has-A
	private Address permenantAddress;//has-A
	
	//added
	private Address presentAddress;
	private Project currentProject;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String designation, double salary) {
		super(id, name);
		this.designation = designation;
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


	public Address getPermenantAddress() {
		return permenantAddress;
	}

	public void setPermenantAddress(Address permenantAddress) {
		this.permenantAddress = permenantAddress;
	}
	
	//added
	public Address getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(Address presentAddress) {
		this.presentAddress = presentAddress;
	}

	public Project getCurrentProject() {
		return currentProject;
	}

	public void setCurrentProject(Project currentProject) {
		this.currentProject = currentProject;
	}

	@Override
	public String toString() {
		return "Employee [designation=" + designation + ", salary=" + salary + ", permenantAddress=" + permenantAddress
				+ ", presentAddress=" + presentAddress + ", currentProject=" + currentProject + "]";
	}
	
	
	//added for Override Demo
	@Override
	public boolean equals(Object o) {
		boolean b=false;
		Employee e2=(Employee)o;
		if(this.getId()==e2.getId()) {
			b=true;
		}
		return b;
	}
	
//Imitate above behavior for employee class for checking if 2 employees id are same or not
}
