package unitt11_abstract_class;


/*
 * Abstract Class:
 * 1. Cannot create object of abstract class, abstract class must be extend to use 
 * 2. Have to implement all abstract method in child class
 * 3. Abstract method is a method without method body/definition.
 * 4. Contains both abstract and non abstract method/field
 * 
 */

abstract public class A {
	
	protected int x;
	protected void test() {
		System.out.println("I am non abstract method implemented in class A");
	}
	abstract protected void fun(); // no definition
	
}
