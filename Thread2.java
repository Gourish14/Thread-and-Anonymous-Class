package com.cozentus.AnonymousClass_Thread;
//This is a program without using any dependencies and also it is more preferred.
public class Thread2 {
	
	public static void main(String[] args) {
		Runnable run = new Runnable() {
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println("Value of I is : "+i);
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		Thread th = new Thread(run);
		th.start();	
	}
}
