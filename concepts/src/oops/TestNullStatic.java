package oops;

class A{
static void staticmethod(){
	System.out.println("Static method");
	}
}


public class TestNullStatic {

	public static void main(String[] args) {
		A a =null;
		A b = new A();
		a.staticmethod();
		b.staticmethod();
	}

}
