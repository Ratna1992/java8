package com.ratna.play.coding;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.ratna.play.model.Item;

public class ConvertListToMapByConsideringDuplicateKeysAndSorted {

	public static void main(String[] args) {

		List<Item> itemsList = Arrays.asList(new Item("apple", 10, new BigDecimal("9.99")),
				new Item("banana", 20, new BigDecimal("19.99")), new Item("orang", 10, new BigDecimal("29.99")),
				new Item("watermelon", 10, new BigDecimal("29.99")), new Item("papaya", 20, new BigDecimal("9.99")),
				new Item("apple", 10, new BigDecimal("9.99")), new Item("banana", 10, new BigDecimal("19.99")),
				new Item("apple", 20, new BigDecimal("9.99")));

		LinkedHashMap<String, Item> collect = itemsList.stream().sorted(Comparator.comparing(Item::getPrice).reversed())
				.collect(Collectors.toMap(Item::getName, Function.identity(), (oldvalue, newValue) -> oldvalue,
						LinkedHashMap::new));
		System.out.println(collect);
	}
}
