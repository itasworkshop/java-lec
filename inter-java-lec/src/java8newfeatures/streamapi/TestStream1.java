package java8newfeatures.streamapi;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import java8newfeatures.lambda.FilterHelper;

public class TestStream1 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,23,4,5,6,7,8);
		
		/*
		 * System.out.println(FilterHelper.filter(numbers, (Integer t) -> { return
		 * t%2==0; }) );
		 */
		
		//numbers.stream().map(x -> x+1).forEach(i -> System.out.println(i));
		int result = numbers.stream().reduce((x,y) -> x+y).get();
		//System.out.println(result);
		
		numbers.stream().filter(x -> x%2==0).forEach(i -> System.out.println(i));		

	}

}
