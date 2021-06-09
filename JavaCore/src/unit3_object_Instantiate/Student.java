package unit3_object_Instantiate;

public class Student {
	
	int id;  /// default visibility : only class within the same package can access the variable/method 
	String name;
	double age;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	// no need to getter/setter to access the data from MyClass
	
	

}
