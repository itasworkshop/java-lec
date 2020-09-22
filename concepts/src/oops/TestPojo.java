package oops;

import java.util.ArrayList;
import java.util.List;

public class TestPojo {
	private int id;
	private String name;
	public String address;
	
	TestPojo(int id,String name){
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		/*TestPojo obj = new TestPojo();
		obj.address= "ECITY";
		obj.setId(11);
		obj.setName("Rajesh");
		
		System.out.println(obj.getId()+" "+obj.getName()+" "+obj.address);
				*/
		TestPojo obj1= new TestPojo(101,"Rajesh");
		TestPojo obj2 = new TestPojo(11,"Maveric");
		TestPojo obj3= new TestPojo(101,"Rajesh");
		
		List<TestPojo> mylist = new ArrayList<TestPojo>();
		mylist.add(obj1);
		mylist.add(obj2);
		mylist.add(obj3);
		
		System.out.println(mylist);

	}

}
