package threads;

public class MyThread1 extends Thread{
	int count = 0;
	
	public void run() {
		for(int i=0;i<=50;i++) {
			
				try {
					this.currentThread().sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				count++;
			
			System.out.println("from run "+ this.currentThread().getName()+" "+count);
		}
	}

	public static void main(String[] args) {
		MyThread1 th1 = new MyThread1();
		MyThread1 th2 = new MyThread1();
		th1.start();
		th2.start();

	}

}
