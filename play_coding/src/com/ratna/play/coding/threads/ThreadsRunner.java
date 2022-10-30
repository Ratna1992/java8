package com.ratna.play.coding.threads;

public class ThreadsRunner {

	public static void main(String[] args) {

		// new Thread
		ThreadDemo threadDemo = new ThreadDemo();

		// start
		threadDemo.start();

		// new Thread
		RunnableDemo runnableDemo = new RunnableDemo();
		Thread t1 = new Thread(runnableDemo);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.start();
	}
}
