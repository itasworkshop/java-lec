package threads;

public class MyThread2 implements Runnable{
	int count = 0;
	
	public void run() {
		for(int i=0;i<=50;i++) {
			
				try {
					Thread.currentThread().sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				count++;
			
			System.out.println("from run "+ Thread.currentThread().getName()+" "+count);
		}
	}

	public static void main(String[] args) {
		Thread th1 = new Thread(new MyThread2());
		Thread th2 = new Thread(new MyThread2());
		th1.start();
		th2.start();

	}

}
