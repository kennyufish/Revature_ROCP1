package examples;

public class Flight {
	private int fid;
	private String fname;
	private double cost;
	private double rating;
	
	public Flight() {
		// TODO Auto-generated constructor stub
	}
	
	public Flight(int fid, String fname, double cost, double rating) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.cost = cost;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Flight [fid=" + fid + ", fname=" + fname + ", cost=" + cost + ", rating=" + rating + "]";
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		if (fid != other.fid)
			return false;
		return true;
	}
	
	
}
