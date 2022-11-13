package com.ratna.play.object;

public class TestGarbageCollector {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("GC called");
	}

	public static void main(String[] args) {

		TestGarbageCollector tgc1 = new TestGarbageCollector();
		TestGarbageCollector tgc2 = new TestGarbageCollector();
		tgc1 = null;
		System.gc();

	}

}
