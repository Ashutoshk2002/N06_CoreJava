package com.tnsif.multithreading;

public class RunnableImp1 implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello "+Thread.currentThread().getName());
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
