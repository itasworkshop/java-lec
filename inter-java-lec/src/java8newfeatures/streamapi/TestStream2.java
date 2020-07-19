package java8newfeatures.streamapi;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import java8newfeatures.lambda.FilterHelper;

public class TestStream2 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4);		
		
		//numbers.stream().filter(x -> x%2==0).forEach(i -> System.out.println(i));		
		
		Stream<Integer> newstream = numbers.stream().filter(x -> {
			System.out.println("hello from inside filter "+x);
			return x%2==0;
		});
		//newstream = [2,4];
		System.out.println("after filter");
		newstream.forEach(i -> System.out.println("from foreach "+i));

	}

}
