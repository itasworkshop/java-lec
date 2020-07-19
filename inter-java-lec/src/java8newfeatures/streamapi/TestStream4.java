package java8newfeatures.streamapi;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import java8newfeatures.lambda.FilterHelper;

public class TestStream4 {

	public static void main(String[] args) {

		String name1 = null;

		// System.out.println(name1.toUpperCase());

		// Optional<String> name2 = null;
		Optional<String> name2 = Optional.ofNullable(null);

		// System.out.println(name2.toUpperCase());
		// System.out.println(name2.get());
		if (name2.isPresent()) {
			System.out.println(name2.get().toUpperCase());
		} else {
			System.out.println("not value found");
		}

		if (name1 != null) {
			System.out.println(name2.get().toUpperCase());
		} else {
			System.out.println("not value found");
		}

		String[] names3 = new String[10];
		names3[8] = "raj";

		for (String i : names3) {
			if (i != null) {
				System.out.println(i.toUpperCase());
			}

		}
		
		Optional<String> names4 = Optional.ofNullable(names3[1]);
		
		if(names4.isPresent()){
			System.out.println(names4.get().toUpperCase());
		}else {
			System.out.println("not value found");
		}

	}

}
