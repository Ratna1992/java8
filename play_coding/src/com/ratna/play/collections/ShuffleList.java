package com.ratna.play.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleList {

	public static void main(String[] args) {
		List<String> array_list = new ArrayList<String>();// creating an arraylist of strings

		array_list.add("Monday");
		array_list.add("Tuesday");
		array_list.add("Wednesday");
		array_list.add("Thursday");
		array_list.add("Friday");
		array_list.add("Saturday");
		array_list.add("Sunday");

		Collections.shuffle(array_list);// shuffling the arraylist

		System.out.println("The shuffled array list is as follows : " + array_list);// printing the shuffled array list

	}

}
