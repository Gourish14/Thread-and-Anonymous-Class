//Multithreading Basics
public class MultiThreading extends Thread {
	
	private String name;
	public MultiThreading(String name) {
		this.name=name;
	} 
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(name+":"+i);
		}
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new MultiThreading("Thread 1");
		Thread t2 = new MultiThreading("Thread 2");
		t1.start();
		t2.start();
	}

}
