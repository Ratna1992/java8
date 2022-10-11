package com.ratna.play.designpatterns;

import java.io.Serializable;

public class DoubleCheckAndLockingInitializationSingleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static volatile DoubleCheckAndLockingInitializationSingleton object;

	private DoubleCheckAndLockingInitializationSingleton() {

	}

	public static DoubleCheckAndLockingInitializationSingleton getInstance() {
		if (object == null) {
			synchronized (DoubleCheckAndLockingInitializationSingleton.class) {
				if (object == null) {
					object = new DoubleCheckAndLockingInitializationSingleton();
				}
			}
		}
		return object;
	}

}
