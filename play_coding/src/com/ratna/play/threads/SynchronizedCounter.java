package com.ratna.play.threads;

public class SynchronizedCounter {
	int count = 0;

	public void increment() {

		synchronized (this) {
			count = count + 1;
		}

	}

	public int getCount() {
		return count;
	}

}
