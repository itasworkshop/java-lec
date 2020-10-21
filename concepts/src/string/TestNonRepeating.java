package string;

public class TestNonRepeating {

	public static void main(String[] args) {
		String name = "abbccd";
		
		for(char c:name.toCharArray()) {
			
			if(name.indexOf(c)== name.lastIndexOf(c)) {
				System.out.println(c);
				break;
			}
		}

	}

}
