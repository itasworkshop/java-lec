package java8newfeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//class Student implements Comparable{
class Student {
	private String name;
	private int rollno;

	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}

	// java encapsulation via accessors and mutators
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	// methods of object class.
	public String toString() {
		return this.getName() + this.getRollno();
	}

	/*
	 * @Override public int compareTo(Object obj) { return
	 * this.getName().compareTo(((Student) obj).getName()); }
	 */

}

class MyStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student obj1, Student obj2) {
		return obj1.getName().compareTo(obj2.getName());
	}

}

public class TestLambda1 {

	public static void main(String[] args) {

		Student s1 = new Student("Zee", 101);
		Student s2 = new Student("Rajesh", 102);
		Student s3 = new Student("Tom", 103);

		System.out.println(s1);

		List<Student> mylist = new ArrayList<Student>();
		mylist.add(s1);
		mylist.add(s2);
		mylist.add(s3);

		System.out.println(mylist);

		// Collections.sort(mylist);
		Collections.sort(mylist, new MyStudentComparator());

		System.out.println(mylist);
	}

}
