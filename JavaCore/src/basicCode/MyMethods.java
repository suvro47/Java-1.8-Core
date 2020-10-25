package basicCode;

public class MyMethods {
	
	static void myMethod() {
		System.out.println("Hello @ I am from First Method !! Are you there ..? ");
	}
	
	static String mySecondMethod(String str) {
		return str;
	}	
	
	public static void main( String[] args ) {
		
		myMethod();
		System.out.println(mySecondMethod("I Love Java ")); 
		
	}

}
