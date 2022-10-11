package com.ratna.play.designpatterns;

import java.io.Serializable;

public class UnbreakableInitializationSingleton implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private volatile static UnbreakableInitializationSingleton object;

	private UnbreakableInitializationSingleton() {
		// unbreakable from reflection
		if (object != null) {
			throw new IllegalStateException("Already Initialized!");
		}

	}

	protected Object readResolve() {
		// unbreakable from serialization
		return object;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// unbreakable from cloning
		return super.clone();
	}

	public static UnbreakableInitializationSingleton getInstance() {
		if (object == null) {
			synchronized (UnbreakableInitializationSingleton.class) {
				if (object == null) {
					object = new UnbreakableInitializationSingleton();
				}
			}
		}
		return object;
	}

}
