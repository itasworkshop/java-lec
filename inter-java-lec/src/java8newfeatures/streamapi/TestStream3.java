package java8newfeatures.streamapi;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import java8newfeatures.lambda.FilterHelper;

public class TestStream3 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(6,2,4,4,6,4,8,8);		
		
		//numbers.stream().filter(x -> x%2==0).forEach(i -> System.out.println(i));		
		
		Stream<Integer> newstream = numbers.stream().filter(x -> {
			System.out.println("hello from inside filter "+x);
			return x%2==1;
		});
		//newstream = [3,5,5,7,7]; wrong
		System.out.println("after filter");
		Optional<Integer> firstitem = newstream.findFirst();
		System.out.println(firstitem);		

	}

}
