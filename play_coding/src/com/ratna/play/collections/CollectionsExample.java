package com.ratna.play.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsExample {

	public static void main(String[] args) {

		List<String> items = new ArrayList<>();

		items.add("Shoes");
		items.add("Toys");

		// Adding one or more elements using addAll()
		Collections.addAll(items, "Fruits", "Bat", "Mouse");

		// Sorting according to default ordering
		// using sort() method
		Collections.sort(items, Comparator.reverseOrder());
		Collections.sort(items);
		// search
		System.out.println("The index of Mouse is " + Collections.binarySearch(items, "Mouse"));

		System.out.println(items);

		// copying
		List<String> destination_List = new ArrayList<>();

		// Add elements
		destination_List.add("Shoes");
		destination_List.add("Toys");
		destination_List.add("Horse");
		destination_List.add("Tiger");

		// Create source list
		List<String> source_List = new ArrayList<>();

		// Add elements
		source_List.add("Bat");
		source_List.add("Frog");
		source_List.add("Lion");

		// Check if disjoint or not
		System.out.println(Collections.disjoint(destination_List, source_List));
		System.out.println(source_List);
		System.out.println(destination_List);

		// Copy the elements from source to destination
		Collections.copy(destination_List, source_List);

		System.out.println(source_List);
		System.out.println(destination_List);

	}

}
