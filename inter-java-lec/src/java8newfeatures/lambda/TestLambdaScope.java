package java8newfeatures.lambda;


@FunctionalInterface
interface MyAdder{
	int add(int x);
}

public class TestLambdaScope {
	
	public static MyAdder getMyAdder() {
		int n = 10; //Local variable n defined in an enclosing scope must be final or effectively final
		//n++;
		return x -> x + n;
	}

	public static void main(String[] args) {
		
		MyAdder myAdder = getMyAdder(); //n should die here as per local scope rules
		System.out.println(myAdder.add(20));

	}

}
