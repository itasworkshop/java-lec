package oops;

enum Size{
	BIG(10),SMALL(5);
	
	private final int size;
	
	Size(int i) {
		this.size = i;
	}	
}

class Sizing{
	public static final int BIG = 10;
	public static final int SMALL = 5;
}


public class TestEnum {

	public static void main(String[] args) {
		Size b = Size.BIG;
		System.out.println(b);
		System.out.println(Size.valueOf("BIG1"));
		
		Sizing s = new Sizing();

	}

}
