package unit7.interfaces;

public class B implements A {
	
	public void fun() {
		System.out.println("Implemented in class B ");
	}
	
	public static void main(String[] args) {
		
		// A obj = new A(); we can not create object of interface
		
		B obj2 = new B();
		obj2.fun();
		
	}
}
