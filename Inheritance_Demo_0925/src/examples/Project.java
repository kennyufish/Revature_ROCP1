package examples;

public class Project {
	private int pid;
	private String name;
	private String clientName;
	private double cost;
	
	public Project() {}
	
	public Project(int pid, String name, String clientName, double cost) {
		super();
		this.pid = pid;
		this.name = name;
		this.clientName = clientName;
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", name=" + name + ", clientName=" + clientName + ", cost=" + cost + "]";
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
	
}
