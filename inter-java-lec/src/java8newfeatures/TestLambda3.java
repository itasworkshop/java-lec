package java8newfeatures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student2{
	private String name;
	private int rollno;
	
	public Student2(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}

	//java encapsulation via accessors and mutators
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
	
	//methods of object class.
	public String toString() {
		return this.getName()+this.getRollno();
	}
	
}

public class TestLambda3 {
	public static void main(String[] args) {
		
		Student2 s1 = new Student2("Zee",101);
		Student2 s2 = new Student2("Rajesh",102);
		Student2 s3 = new Student2("Tom",103);
		
		System.out.println(s1);
		
		List<Student2> mylist = new ArrayList<Student2>();
		mylist.add(s1);
		mylist.add(s2);
		mylist.add(s3);
		
		System.out.println(mylist);
		
		//Collections.sort(mylist);
		// () -> {};
		Collections.sort(mylist,
				(Student2 obj1, Student2 obj2) -> 
						{return obj1.getName().compareTo(obj2.getName());});
		
		System.out.println(mylist);
	}	

}
