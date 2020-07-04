package java8newfeatures.lambda;

import java.util.Arrays;
import java.util.List;

public class TestlambdaDoubleColon {

	public static void main(String[] args) {
		List<String> mylist = Arrays.asList("raj", "rajesh", "tom");

		//foreach expects a consumer, println method return void and accepts single parameter there it can be used as instance of consumer
		mylist.forEach(System.out::println);
	}

}
