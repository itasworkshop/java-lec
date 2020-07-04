package java8newfeatures.lambda;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class EvenOdd{
	
	public static boolean isEven(int i) {
		return i%2==0;
	}
	
	public static boolean isOdd(int i) {
		return !isEven(i);
	}
}

public class TestlambdaDoubleColon2 {

	public static void main(String[] args) {
		//EvenOdd obj = new EvenOdd();
		
		List<Integer> numbers = new LinkedList(Arrays.asList(1,2,23,4,5,6,7,8));
		
		System.out.println(numbers);
		
		//numbers.removeIf(i -> i%2==0);
		//numbers.removeIf(i -> { return i%2==0;});
		//numbers.removeIf(obj::isEven);
		numbers.removeIf(EvenOdd::isEven);
		
		System.out.println(numbers);

		
	}

}
