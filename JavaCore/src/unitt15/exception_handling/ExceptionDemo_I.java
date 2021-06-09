package unitt15.exception_handling;

public class ExceptionDemo_I {

	public static void main(String[] args) {
		
		Integer x = 10;
		Integer y = 0;
		Integer z = 0; 
		
		try {
			z = x / y;
		} catch( Exception e ){
			System.out.println(e);
		}
		
		System.out.println(z);
		
		
	}

}
