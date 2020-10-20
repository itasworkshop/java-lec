package misc;

interface Nothing{}

interface Funcint{
	int getinput(int num1,int num2);
	default int getValue(){
		return 0;
	}
	default int getValue1(){
		return 0;
	}
	
	default void print() {
	      System.out.println("I am a vehicle!");
	   }
		
	   static void blowHorn() {
	      System.out.println("Blowing horn!!!");
	   }
}

public class TestInt implements Funcint{

	public static void main(String[] args) {
		TestInt t = new TestInt();
		//Integer i = new Integer(null);
		String s = new String();
		System.out.println(s);
		s = null;
		//System.out.println(i);
		System.out.println(s);
		
		System.out.println(t.getinput(1,2));
		
		Funcint.blowHorn();
		}
	
	void blowHorn() {
	      System.out.println("Blowing horn33333!!!");
	   }

	@Override
	public int getinput(int num1, int num2) {
		// TODO Auto-generated method stub
		return getValue()+getValue1();
	}


}
