package java8newfeatures.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//for FI, takes one argument and produces result.

class MyConsumer implements Consumer {

	@Override
	public void accept(Object t) {
		System.out.println("This is from consumer lambda " + t);
	}

}

public class TestLambdaConsumer {

	public static void main(String[] args) {

		Consumer c = (Object o) -> {
			System.out.println("This is from consumer lambda " + o);
		};

		// Consumer c = new MyConsumer();

		List<String> mylist = Arrays.asList("raj", "rajesh", "tom");

		mylist.forEach(c);

		/*
		 * for (String i : mylist) { System.out.println("iiiiiii" + i); }
		 */

	}

}
