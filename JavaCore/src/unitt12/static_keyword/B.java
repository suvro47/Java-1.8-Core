package unitt12.static_keyword;

public class B {
	
	int id;
	String name;
	double balance;
	static int ROI;  // Rate OF Interest
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	// static member function 
	public static int getROI() {
		return ROI;
	}
	public static void setROI(int rOI) {
		ROI = rOI;
	}
	
	

}
