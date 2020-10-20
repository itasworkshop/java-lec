package collect;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue1 {
	
	final public void Hacker1(){}
	//public void final Hacker2(){}
	//public modifier void Hacker3() {}
	public static final void Hacker4() {}

	public static void main(String[] args) {
		Queue<Integer> q = new  PriorityQueue <>();
		System.out.println(q.remove());
		q.add(10);
		System.out.println(q.remove());

	}

}
