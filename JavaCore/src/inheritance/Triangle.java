package inheritance;

public class Triangle extends Polygon {
	
	public double area( ) {
		
		// height and width can be directly accessible : protected member 
		return ( height*width)/2.0;
	}

}
