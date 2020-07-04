package java8newfeatures.lambda;

//generic filter interface
@FunctionalInterface
public interface Filter<T> {
	
	boolean filter(T t);
	
	//boolean filter2(T t);

}
