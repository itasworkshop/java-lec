package misc;

interface Animal{
	public void test();
}

class Dog implements Animal{
	public void test(){
		System.out.println("from Dog");
	}
}

class Parent{
	
	public static int foo() {
		return 5;
	}
	
	public static Animal foo1() {
		return new Dog();
	}
}

public class TestCovariant extends Parent {
	public static  int foo() {
		return 6;
	}
	
	public static Dog foo1() {
		return new Dog();
	}
	
	public static void main(String[] args) {
		System.out.println(foo());
		System.out.println(foo1());

	}

}
