package unit5_method_overloading;

public class BaseClass {
	
	public int add( int x, int y) {
		return x+y;
	}
	
	public double add( double x, double y) {
		return x+y;
	}
	
	public void textShow( String text) {
		System.out.println(text);
	}
	
	public static void main( String[] args ) {
		
		BaseClass baseClass = new BaseClass();
		baseClass.add(2, 3);
		baseClass.textShow("I Love Java");
		
		ChildClass childClass = new ChildClass();
		childClass.textShow("I Love Python");
		
	}

}
