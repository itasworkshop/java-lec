package misc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestMonthSort {

	public static void main(String[] args) {
		List<String> mlist = Arrays.asList("April","January","March");
		
		Collections.sort(mlist,
				(String o1,String o2) -> { 
					SimpleDateFormat sdf  = new SimpleDateFormat("MMM");
					//return o1.compareTo(o2);
				try {
					return sdf.parse(o1).compareTo(sdf.parse(o2));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return o1.compareTo(o2);
				
				}
				
				);
		
		System.out.println(mlist);

	}

}
