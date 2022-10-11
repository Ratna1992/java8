package com.ratna.play.designpatterns;

import java.io.Serializable;

public class LazyInitializationSingleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static LazyInitializationSingleton object = null;

	private LazyInitializationSingleton() {

	}

	public static LazyInitializationSingleton getInstance() {
		if (object == null) {
			object = new LazyInitializationSingleton();
		}
		return object;
	}
}
