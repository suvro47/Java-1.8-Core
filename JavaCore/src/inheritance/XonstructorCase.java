package inheritance;

class A{
	
	A(){
		System.out.println("In A constant");
	}
	
	A(int i){
		System.out.println("In A constant int");
	}
	
}

class B extends A {
	
	B(){
		System.out.println("In B constant");
	}
	
	B(int i){
		System.out.println("In B constant int");
	}
	
}

public class XonstructorCase {
	
	public static void main( String[] agrs) {
		B obj = new B();  //  it is called default constructor of super class indirectly
		
		System.out.println("Break Down");
		B obj2 = new B(10); // it is called default constructor of super class indirectly
		
	}

}
