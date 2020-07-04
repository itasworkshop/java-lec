package java8newfeatures.lambda;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestlambdaFilter {

	public static void main(String[] args) {
		List<Integer> numbers = new LinkedList(Arrays.asList(1,2,23,4,5,6,7,8));
		
		System.out.println(numbers);
		
		//numbers.removeIf(i -> i%2==0);
		numbers.removeIf(i -> { return i%2==0;});
		
		System.out.println(numbers);

	}

}
