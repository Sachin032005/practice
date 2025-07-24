package sample;

import java.util.ArrayList;

public class Arrayget {

	public static void main(String[] args) {
		ArrayList<String> student=new ArrayList<String>();
		student.add("sachin");
		student.add("Ranjith");
		student.add("vishnu");
		for(String name:student) {
			System.out.println(name);
		}
		System.out.println("First student-"+student.get(1));
	student.set(2,"maadu");
	student.remove(2);
	student.set(1,"lion");
	student.clear() ;
	System.out.println("student list-"+student);

	}

}
