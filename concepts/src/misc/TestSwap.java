package misc;

public class TestSwap {

	public static void main(String[] args) {
		int x = 25;
		int y = 35;
		
		System.out.println(x+" "+y);
		
		/*
		int temp = 0;
		temp = x;
		x = y;
		y = temp;
		*/
		
		x = x+ y;
		y = x- y;
		x = x- y;
		
		System.out.println(x+" "+y);

	}

}
