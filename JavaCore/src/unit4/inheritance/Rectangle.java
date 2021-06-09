package unit4.inheritance;

public class Rectangle extends Polygon {
	
	public double area( ) {
		
		// height and width can be directly accessible : protected member 
		return ( height*width);
	}

}
