
package finalKeyword;


/*
 * Final Class can not be extend / It has no subclass
 * Final Method can not be overridden 
 * Final Variable can only be initialized once
 * 
 */

public class A {
	
	public static void main( String[] args) {
		
		B obj = new B();
		// obj.x = 10; not allowed | even within the same class
		
	}

}
