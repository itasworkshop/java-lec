package oops;

class Parent{
	int x =10;
}

class Child extends Parent{
	int x = 20;
}

public class TestPolymorphism {

	public static void main(String[] args) {
		//Child obj = new Child(); //20
		Parent obj = new Child(); //10 runtime polymorphism can not be achieved using data members.
		System.out.println(obj.x);
		

	}

}
