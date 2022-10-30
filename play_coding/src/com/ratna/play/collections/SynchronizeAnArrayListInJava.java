package com.ratna.play.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizeAnArrayListInJava {

	public static void main(String[] args) {
		// Using Collections.synchronizedList() method:
		List<String> synchronized_list = Collections.synchronizedList(new ArrayList<String>());

		synchronized_list.add("learn");
		synchronized_list.add("practice");
		synchronized_list.add("solve");
		synchronized_list.add("interview");

		synchronized (synchronized_list)// must be declared
		{

			Iterator<String> it = synchronized_list.iterator();

			while (it.hasNext())
				System.out.println(it.next());
		}

		// Using CopyOnWriteArrayList:
		CopyOnWriteArrayList<String> copysynchronized_list = new CopyOnWriteArrayList<String>();// creating a
																								// thread-safe
																								// Arraylist.

		// Adding strings to the synchronized ArrayList
		copysynchronized_list.add("learn");
		copysynchronized_list.add("practice");
		copysynchronized_list.add("solve");
		copysynchronized_list.add("interview");

		System.out.println("The synchronized ArrayList has the following elements :");

		// Iterating on the synchronized ArrayList using an iterator.
		Iterator<String> it = copysynchronized_list.iterator();

		while (it.hasNext())
			System.out.println(it.next());
	}

}
