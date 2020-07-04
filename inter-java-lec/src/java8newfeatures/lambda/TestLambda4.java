package java8newfeatures.lambda;

@FunctionalInterface
interface Printer {
	void print(Object o);
}

public class TestLambda4 {

	public static void add(int n1, int n2, Printer printer) {
		int result = n1 + n2;
		printer.print(result);
	}

	public static void main(String []args) {

		int num1 = 10;
		int num2 = 20;

		Printer printer = (Object o) -> {
			System.out.printf("The result of %d and %d is %d\n", num1, num2, o);
		};

		add(num1, num2, printer);
	}

}
