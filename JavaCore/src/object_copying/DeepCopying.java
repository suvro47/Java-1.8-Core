package object_copying;


public class DeepCopying {

	public static void main(String[] args) {
	    
		A obj1 = new A();
		
		obj1.x = 10;
		obj1.y = 20;
		
		A obj2 = new A();   // new reference created
		// obj1 and obj2 have difference reference
		
		obj2.x = obj1.x;
		obj2.y = obj1.y; 
		
		// but point the same object 
		
		System.out.println(obj2);
		System.out.println(obj1);

	}

}
