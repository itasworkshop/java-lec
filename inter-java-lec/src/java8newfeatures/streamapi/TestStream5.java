package java8newfeatures.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class Person{
	String fname;
	String lname;
	
	public Person(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Person [fname=" + fname + ", lname=" + lname + "]";
	}
	
	
}

public class TestStream5 {

	public static void main(String[] args) {
		List<Person> people= Arrays.asList(
									new Person("Raj","Sharma"),
									new Person("Rajesh","Singh"),
									new Person("John","Sharma"),
									new Person("John","xyz")
									);	
		
		//Map<String, List<Person>> group = people.stream().collect(Collectors.groupingBy(Person::getLname),Collectors.counting());
		
		//Object result = people.stream().collect(Collectors.groupingBy(Person::getLname),Collectors.counting());
		
		//System.out.println(result);
		
		//System.out.println(group.get("Sharma"));
		

	}

}
