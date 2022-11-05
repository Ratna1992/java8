package com.ratna.play.designpatterns.singleton;

import java.io.Serializable;

public class EarlyInitializationSingleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static EarlyInitializationSingleton object = new EarlyInitializationSingleton();

	private EarlyInitializationSingleton() {

	}

	public static EarlyInitializationSingleton getInstance() {
		return object;
	}
}
