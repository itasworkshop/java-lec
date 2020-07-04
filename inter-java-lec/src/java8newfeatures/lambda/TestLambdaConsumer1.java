package java8newfeatures.lambda;

import java.util.Arrays;
import java.util.List;

public class TestLambdaConsumer1 {

	public static void main(String[] args) {
		/*
		 * List mylist = Arrays.asList("raj", "rajesh", "tom");
		 * 
		 * mylist.forEach((Object o) -> {
		 * System.out.println("This is from consumer lambda " + o); });
		 */
		
		List<String> mylist = Arrays.asList("raj", "rajesh", "tom");

		mylist.forEach(i -> {
			System.out.println("This is from consumer lambda " + i);
		});
	}

}
