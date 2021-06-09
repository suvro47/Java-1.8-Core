package unitt10.comparator_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {  // also here student class can implements [comparable interface] to obtain the sorting logic within the student class
	
	int id;
	int marks;
	
	public Student() {
		super();
	}
	
	public Student(int id, int marks) {
		this.id = id;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", marks=" + marks + "]";
	}
	
}

public class TestClass {

	public static void main(String[] args) {
	
		List<Student> students = new ArrayList<Student>();
		
		Student stu1 = new Student(101,600);
		students.add(stu1);
		Student stu2 = new Student(102,500);
		students.add(stu2);
		Student stu3 = new Student(103,550);
		students.add(stu3);
		Student stu4 = new Student(104,620);
		students.add(stu4);
		
		for( Student stu: students) System.out.println(stu);
		
		// now we have to sort the list accroding to their marks
		System.out.println("After Sorting : ");
		Comparator<Student> comp = ( obj, obj2 ) -> {
			if( obj.marks > obj2.marks ) return 1;
			return -1;
		};
		
		Collections.sort(students, comp);
		
		for( Student stu: students) System.out.println(stu);
		
		
		
	}

}
