package com.cozentus.AnonymousClass_Thread;
//This is program where dependencies are there. So, without using any dependencies, we can write same program as done in Thread2 class.
public class Thread1 implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			System.out.println("Value of I : "+i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		Thread t = new Thread(t1);
		t.start();
	}
}
