package unit3.object_Instantiate;


/*
 * 
 * Access Modifiers 
 * 
 * Keyword       Class   Package   Subclass  Word
 * Public          Y        Y         Y       Y
 * Protected       Y        Y         Y       N
 * No Modifier     Y        Y         N       N
 * Private         Y        N         N       N
 * 
 *
 */


public class BaseClass {

	public static void main(String[] args) {
		
		// using dot operator 
		Student student = new Student();
		student.id = 1;
		student.age = 23;
		student.name = "suvro";
		System.out.println(student);
		
		
		// using getters and setter
		Teacher teacher = new Teacher();
		int id = 1;
		teacher.setId(id);
		String name = "abc";
		teacher.setName(name);
		String designation = "Lecturer";
		teacher.setDesignation(designation);
		System.out.println(teacher);
		
		
		// using constructor 
		Cube cube = new Cube(1,2,3);
		System.out.println(cube);
		
	}

}
