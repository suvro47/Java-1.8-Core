package object_Instantiate;

public class Cube {
	
	// use of constructor 
	
	private int length;
	private int bredth;
	private int height;
	
	Cube(){
		
	}

	public Cube(int length, int bredth, int height) {
		super();
		this.length = length;
		this.bredth = bredth;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Cube [length=" + length + ", bredth=" + bredth + ", height=" + height + "]";
	}
	
	
	
	

}
