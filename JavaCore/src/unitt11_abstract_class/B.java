package unitt11_abstract_class;

public class B extends A {
	
	protected void fun() {
		System.out.println("I am abstract method implemented in class B");
	}
	
	public static void main(String[] args) {
		B obj = new B();
		obj.test();
		obj.fun();
	}
}
