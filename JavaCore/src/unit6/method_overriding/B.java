package unit6.method_overriding;

public class B extends A{
	
	public void fun() {
		System.out.println("Implemnetd in B class"); 
	}

	public static void main(String[] args) {
		
		A a = new A();
		a.fun();
		
		B b = new B();
		b.fun();
	}

}
