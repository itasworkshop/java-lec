package misc;

import java.util.HashMap;
import java.util.Iterator;


public final class MyImmutableTest {	
	private final int id;
	private final String name;	
	private final HashMap<String,String> mymap;

	public MyImmutableTest(int id, String name, HashMap<String,String> mymap) {
		super();
		this.id = id;
		this.name = name;
		//this.mymap = mymap;
		HashMap<String,String> tempmap = new HashMap<String,String>();
		Iterator<String> keys = mymap.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			tempmap.put(key, mymap.get(key));
		}
		this.mymap = tempmap;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public HashMap<String, String> getMymap() {
		return (HashMap<String, String>) mymap.clone();
		//return mymap;
	}

	public static void main(String[] args) {
		int id = 101;
		String name = "raj";
		
		HashMap<String,String> mymap = new HashMap<String,String>();
		mymap.put("k1", "v1");
		
		MyImmutableTest obj = new MyImmutableTest(id,name,mymap);
		System.out.println(obj.id+" "+obj.name+" "+obj.getMymap());		
		
		System.out.println(id == obj.getId());
		System.out.println(name == obj.getName());
		
		id = 104;
		name = "rajesh";
		mymap.put("k2", "v2");
		System.out.println(mymap);
		
		obj.getMymap().put("k3", "v3");
		
		System.out.println(obj.id+" "+obj.name+" "+obj.getMymap());	

	}

}
