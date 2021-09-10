package com.example.lab2;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		//Create arrayList of user-defined class objects
		List<Student> al = new ArrayList<Student>();
		
		Student s1 = new Student(101, "Kim", 23);
		al.add(s1); //adding Student class object
		Student s2 = new Student(102, "Lee", 21);
		al.add(s2); //adding Student class object
		al.add(new Student(103, "Park", 25));
		al.add(new Student(104, "Choi", 20));
		al.add(new Student(105, "Shin", 22));
		al.add(new Student(106, "Han", 29));
		al.add(new Student(107, "Ahn", 27));
		al.add(new Student(108, "Kwon", 24));
		al.add(new Student(109, "Yoon", 28));
		al.add(new Student(110, "Jung", 23));
		
		//Traverse elements of arraylist (method #1)
		for (Student s : al) {
			System.out.println(s.toString());
		}
		
		//Remove an object from arraylist
		al.remove(s2);
		System.out.println("One student removed!");
		
		//Traverse elements of arraylist (method #2)
		for (int i=0; i<al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
	}

}
