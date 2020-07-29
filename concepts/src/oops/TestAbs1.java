package oops;

interface Testable{
	
	String name = "raj";
	
	static void printMe1() {
		//String name = "rajesh";
		System.out.println("hello from inter static"+name);
	}
	
	default void printMe2() {
		//name = "tom";
		System.out.println("hello from inter default 2"+name);
	}
	
	default void printMe3() {
		//name = "tom";
		System.out.println("hello from inter default 3"+name);
	}
	
}

abstract class Test{
	
	static void printMe1() {
		System.out.println("hello from static");
	}
	
	abstract void printMe();
}

public class TestAbs1 extends Test implements Testable{
	
	public static void main(String[] args) {
		Testable obj = new TestAbs1();
		((Test) obj).printMe();
		Test.printMe1();
		Testable.printMe1();
		obj.printMe2();
		obj.printMe3();
	}

	@Override
	void printMe() {
		System.out.println("hello from impl");
		
	}
	
	public void printMe3() {
		//name = "tom";
		System.out.println("hello from class default 3"+name);
	}
	
}
