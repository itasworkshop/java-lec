package java8newfeatures.lambda;


@FunctionalInterface
interface MyAdder1{
	int add(int x);
}

class MyNumberHolder{
	public int number = 10;
}

public class TestLambdaScope2 {
	
	public static MyAdder1 getMyAdder() {
		MyNumberHolder holder = new MyNumberHolder();
		holder.number = 10;
		MyAdder1 myadder1 = x -> x + holder.number;
		System.out.println(myadder1);
		
		holder.number = 5;
		
		System.out.println(myadder1);
		
		return myadder1;
	}

	public static void main(String[] args) {
		
		MyAdder1 myAdder = getMyAdder();
		System.out.println(myAdder.add(20)); //25 because by the time lambda is called the number variable is changed.

	}

}
