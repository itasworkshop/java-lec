package java8newfeatures.lambda;

import java.util.List;
import java.util.ArrayList;

//static helper class that performs generic filtering
public class FilterHelper {
	
	public static <T> List<T> filter(List<T> input,Filter<T> filter) {
		
		List<T> result = new ArrayList<T>();
		
		for(T t: input) {
			if(filter.filter(t)) {
				result.add(t);
			}
		}
		
		return result;		
		
	}	

}
