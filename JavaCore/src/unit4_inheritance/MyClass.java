package unit4_inheritance;

public class MyClass {

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
		rec.setHeight(10);
		rec.setWidth(5);
		System.out.println(rec.area());
		
		Triangle tri = new Triangle();
		tri.setHeight(14);
		tri.setWidth(10);
		
		System.out.println(tri.area());
	}

}
