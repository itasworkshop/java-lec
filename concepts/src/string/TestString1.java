package string;

public class TestString1 {

	public static void main(String[] args) {
		String s1 = "how";
		String s2 = "are";
		String s3 = s1+s2;
		String s4 = "how"+"are";
		String s5 = new String("how");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());

	}

}
