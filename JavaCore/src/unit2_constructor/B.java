package unit2_constructor;

public class B {
	
	private int x;
	private String str;
	
	public B() {   // parameterless constructor
		super();
		System.out.println("Parameterless constructor called");
	}
	
	public B(int x, String str) {  // parameterized constructor 
		super();
		this.x = x;
		this.str = str;
	}
}
