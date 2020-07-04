package java8newfeatures.lambda;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1{
	private String name;
	private int rollno;
	
	public Student1(String name, int rollno) {
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

public class TestLambda2 {
	public static void main(String[] args) {
		
		Student1 s1 = new Student1("Zee",101);
		Student1 s2 = new Student1("Rajesh",102);
		Student1 s3 = new Student1("Tom",103);
		
		System.out.println(s1);
		
		List<Student1> mylist = new ArrayList<Student1>();
		mylist.add(s1);
		mylist.add(s2);
		mylist.add(s3);
		
		System.out.println(mylist);
		
		//Collections.sort(mylist);
		Collections.sort(mylist, new Comparator<Student1>(){

			@Override
			public int compare(Student1 obj1, Student1 obj2) {
				return obj1.getName().compareTo(obj2.getName());
			}		
			
		});
		
		System.out.println(mylist);
	}	

}
