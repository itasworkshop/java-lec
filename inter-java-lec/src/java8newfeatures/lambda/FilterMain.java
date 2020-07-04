package java8newfeatures.lambda;

import java.util.Arrays;
import java.util.List;

public class FilterMain {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,23,4,5,6,7,8);
		
		/*
		 * System.out.println(FilterHelper.filter(numbers, new Filter<Integer>() {
		 * public boolean filter(Integer t) { return t%2==0; } }));
		 */
		
		System.out.println(FilterHelper.filter(numbers, 
				(Integer t) -> { return t%2==0; })				
				);
	}

}
